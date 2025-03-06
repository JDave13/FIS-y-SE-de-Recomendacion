package fis_health;

import interfaz.health_UI;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;


public class FIS_Health {

    public String calcularSalud(double edad, double peso, double altura) {
        // Ruta del archivo FCL
        String fileName = "src/fis_health/FCL_health.fcl";

        // Cargar el archivo FCL
        FIS fis = FIS.load(fileName, true);

        // En caso de error al cargar el archivo
        if (fis == null) {
            System.err.println("No se puede cargar el archivo: '" + fileName + "'");
            return "Error: No se pudo cargar el archivo FCL.";
        }

        // Establecer las entradas del sistema
        fis.setVariable("edad", edad);
        fis.setVariable("peso", peso);
        fis.setVariable("altura", altura);

        // Evaluar el sistema difuso
        fis.evaluate();

        // Mostrar los gráficos de las variables de entrada y salida
        JFuzzyChart.get().chart(fis.getFunctionBlock("health"));

        // Obtener el valor difuso de salida (desfuzzificación)
        double calorias = fis.getVariable("calorias").getLatestDefuzzifiedValue();
        double actividad = fis.getVariable("actividad").getLatestDefuzzifiedValue();

        // Obtener membresías de salida para actividad física
        double pertenenciaMuyBaja = fis.getVariable("actividad").getMembership("muy_baja");
        double pertenenciaBaja = fis.getVariable("actividad").getMembership("baja");
        double pertenenciaModerada = fis.getVariable("actividad").getMembership("moderada");
        double pertenenciaAlta = fis.getVariable("actividad").getMembership("alta");
        double pertenenciaMuyAlta = fis.getVariable("actividad").getMembership("muy_alta");


        // Mostrar reglas activadas
        StringBuilder reglasUsadas = new StringBuilder();
        reglasUsadas.append("Reglas Usadas:\n");
        fis.getFunctionBlock("health").getFuzzyRuleBlock("rules").getRules().stream()
                .filter(rule -> rule.getDegreeOfSupport() > 0)
                .forEach(rule -> reglasUsadas.append(rule).append("\n"));

        // Retornar los resultados en un formato similar al ejemplo proporcionado
        return "Recomendación calórica diaria: " + String.format("%.1f", calorias) + " kcal\n" +
               "Tiempo recomendado de actividad física: " + String.format("%.1f", actividad) + " min\n" + "\n\n" +
               reglasUsadas.toString();
    }

    public static void main(String[] args) {
        health_UI p = new health_UI();
        p.setVisible(true);
    }
}
