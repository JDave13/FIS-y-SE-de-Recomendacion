package interfaz;

import javax.swing.JOptionPane;
import fis_health.FIS_Health;

/**
 * Clase para la interfaz gráfica del sistema difuso de salud
 */
public class health_UI extends javax.swing.JFrame {

    FIS_Health resultados = new FIS_Health();

    /**
     * Creates new form SaludUI
     */
    public health_UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bannerLabel = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        pesoLabel = new javax.swing.JLabel();
        alturaLabel = new javax.swing.JLabel();
        edadTextField = new javax.swing.JTextField();
        pesoTextField = new javax.swing.JTextField();
        alturaTextField = new javax.swing.JTextField();
        calcularButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTextArea = new javax.swing.JTextArea();
        salirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculadora de Salud"));

        bannerLabel.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        bannerLabel.setForeground(new java.awt.Color(0, 153, 204));
        bannerLabel.setText("SALUD-FIS");

        edadLabel.setText("Edad (años):");

        pesoLabel.setText("Peso (kg):");

        alturaLabel.setText("Altura (cm):");

        edadTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
            }
        });

        pesoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
            }
        });

        alturaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {

            }
        });

        calcularButton.setText("Calcular");
        calcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtonActionPerformed(evt);
            }
        });

        resultadoTextArea.setEditable(false);
        resultadoTextArea.setColumns(20);
        resultadoTextArea.setRows(5);
        jScrollPane1.setViewportView(resultadoTextArea);

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edadLabel)
                            .addComponent(pesoLabel)
                            .addComponent(alturaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alturaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(calcularButton, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bannerLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bannerLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadLabel)
                    .addComponent(edadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoLabel)
                    .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaLabel)
                    .addComponent(alturaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salirButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirButton)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>                        


                                   

    private void calcularButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try {
            double edad = Double.parseDouble(edadTextField.getText());
            double peso = Double.parseDouble(pesoTextField.getText());
            double altura = Double.parseDouble(alturaTextField.getText());
            
            resultadoTextArea.setText(resultados.calcularSalud(edad, peso, altura));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese valores válidos en los campos.");
        }
    }                                              

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.exit(0);
    }                                           

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new health_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel alturaLabel;
    private javax.swing.JTextField alturaTextField;
    private javax.swing.JLabel bannerLabel;
    private javax.swing.JButton calcularButton;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JTextField edadTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JTextField pesoTextField;
    private javax.swing.JTextArea resultadoTextArea;
    private javax.swing.JButton salirButton;
    // End of variables declaration                   
}
