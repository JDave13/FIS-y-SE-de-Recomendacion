% Definición de las categorías de calorías
se_calorias(Calorias, muy_baja) :- Calorias >= 1200, Calorias < 1400.
se_calorias(Calorias, baja) :- Calorias >= 1400, Calorias < 1600.
se_calorias(Calorias, moderada) :- Calorias >= 1600, Calorias < 2000.
se_calorias(Calorias, alta) :- Calorias >= 2000, Calorias < 2400.
se_calorias(Calorias, muy_alta) :- Calorias >= 2400, Calorias =< 3000.

% Definición de las categorías de tiempo de actividad
se_tiempo(Tiempo, muy_bajo) :- Tiempo >= 10, Tiempo < 15.
se_tiempo(Tiempo, bajo) :- Tiempo >= 15, Tiempo < 30.
se_tiempo(Tiempo, moderado) :- Tiempo >= 30, Tiempo < 50.
se_tiempo(Tiempo, alto) :- Tiempo >= 50, Tiempo < 80.
se_tiempo(Tiempo, muy_alto) :- Tiempo >= 80, Tiempo =< 120.

% Base de datos con las recomendaciones según calorías y tiempo
recomendaciones(Calorias, Tiempo, Dieta, Entrenamiento) :-
    se_calorias(Calorias, CaloriasCategoria),
    se_tiempo(Tiempo, TiempoCategoria),
    recomendacion(CaloriasCategoria, TiempoCategoria, Dieta, Entrenamiento).

recomendacion(muy_baja, muy_bajo, 
    'Opta por una dieta líquida o ligera, como caldos, jugos naturales y té de hierbas. Podrían considerarse suplementos vitamínicos si es necesario para evitar deficiencias.', 
    'Enfócate en el reposo absoluto. Evita cualquier actividad física para permitir al cuerpo recuperarse por completo.').

recomendacion(muy_baja, bajo, 
    'Dieta ligera con líquidos como caldos y jugos, además de proteínas fáciles de digerir como yogur o pescado blanco. Evita alimentos difíciles de digerir o muy pesados.', 
    'Realiza reposo activo, con movimientos muy suaves como estiramientos o caminatas breves. El objetivo es mantener la circulación sin exigir demasiado al cuerpo.').

recomendacion(muy_baja, moderado, 
    'Consume alimentos bajos en calorías, priorizando vegetales frescos, sopas ligeras y proteínas magras como tofu o pollo a la plancha. Evita alimentos con alto contenido de azúcares o grasas.', 
    'Actividad física ligera, como caminatas o yoga de bajo impacto. Evita la fatiga excesiva, permitiendo al cuerpo adaptarse a la baja ingesta calórica.').

recomendacion(muy_baja, alto, 
    'Dieta ligera que incluya batidos nutritivos, sopas de verduras y proteínas fáciles de digerir. Agrega electrolitos si la actividad es considerablemente intensa.', 
    'Limita la actividad a ejercicios muy suaves como estiramientos o técnicas de respiración. No hagas ejercicios intensos para evitar sobrecargar tu sistema.').

recomendacion(muy_baja, muy_alto, 
    'Prioriza una dieta ligera con muchos líquidos, electrolitos y nutrientes esenciales. Opta por alimentos fáciles de digerir, como caldos ricos en minerales.', 
    'Reduzca la intensidad del ejercicio a actividades de muy bajo impacto como caminatas suaves o estiramientos. El descanso y la recuperación son esenciales para evitar un agotamiento extremo.').

recomendacion(baja, muy_bajo, 
    'Dieta baja en calorías, enfocada en vegetales frescos, proteínas magras como pollo o tofu, evitando azúcares y alimentos procesados.', 
    'Descanso total, sin realizar actividades físicas exigentes para permitir una recuperación completa del cuerpo.').

recomendacion(baja, bajo, 
    'Dieta baja en calorías que incluya vegetales frescos, proteínas magras y carbohidratos complejos como quinoa o avena. Limita las grasas saturadas.', 
    'Reposo activo, como caminatas suaves o estiramientos ligeros. Mantén una actividad mínima para no sobrecargar el cuerpo.').

recomendacion(baja, moderado, 
    'Alimentación baja en calorías con vegetales, proteínas magras y carbohidratos complejos de bajo índice glucémico. Opta por alimentos que liberen energía de manera sostenida.', 
    'Actividad física moderada, como trotar o caminar durante 30 minutos. Escucha a tu cuerpo para evitar excesos y fatiga.').

recomendacion(baja, alto, 
    'Dieta baja en calorías rica en proteínas magras y carbohidratos complejos. Evita excesos de grasas y azúcares.', 
    'Entrenamiento moderado a intenso como correr o levantar pesas. Ajusta la intensidad según la energía disponible.').

recomendacion(baja, muy_alto, 
    'Dieta baja en calorías, con proteínas y carbohidratos de bajo índice glucémico. Incluye electrolitos si la actividad es muy intensa.', 
    'Entrenamiento de alta intensidad, como HIIT o pesas. La dieta debe proporcionar energía suficiente para evitar el agotamiento.').

recomendacion(moderada, muy_bajo, 
    'Dieta equilibrada con vegetales frescos, proteínas ligeras y líquidos como infusiones o jugos naturales.', 
    'Reposo absoluto. Permite al cuerpo recuperarse completamente antes de realizar esfuerzos mayores.').

recomendacion(moderada, bajo, 
    'Dieta equilibrada con énfasis en verduras, frutas y proteínas magras como pescado o pollo.', 
    'Actividad ligera como caminatas suaves o estiramientos. Mantén un ritmo relajado sin esfuerzos prolongados.').

recomendacion(moderada, moderado, 
    'Dieta balanceada que incluya proteínas magras, carbohidratos complejos y grasas saludables como nueces y aguacate.', 
    'Actividad física moderada como trotar, nadar o caminar 30-40 minutos. Mantén un equilibrio entre energía consumida y ejercicio realizado.').

recomendacion(moderada, alto, 
    'Dieta equilibrada con carbohidratos complejos, proteínas magras y grasas saludables. Limita alimentos procesados.', 
    'Entrenamiento intenso como correr largas distancias o hacer pesas. Prioriza la recuperación nutricional tras el ejercicio.').

recomendacion(moderada, muy_alto, 
    'Dieta balanceada rica en carbohidratos complejos, proteínas de alta calidad y grasas saludables para mantener un rendimiento elevado.', 
    'Entrenamiento de alta intensidad como HIIT o pesas. Asegura una buena recuperación y nutrición post-entrenamiento.').

recomendacion(alta, muy_bajo, 
    'Dieta rica en carbohidratos y proteínas para apoyar la recuperación. Incluye líquidos, vitaminas y minerales esenciales.', 
    'Descanso absoluto. Es crucial que el cuerpo tenga tiempo para reponerse y adaptarse.').

recomendacion(alta, bajo, 
    'Dieta alta en calorías con carbohidratos complejos y proteínas como carnes magras y huevos. Asegúrate de consumir suficiente energía para la recuperación.', 
    'Entrenamiento ligero como caminatas de 30 minutos o estiramientos suaves. Mantén un equilibrio sin exceder la capacidad de tu cuerpo.').

recomendacion(alta, moderado, 
    'Dieta alta en calorías con carbohidratos complejos, proteínas magras y grasas saludables como aguacate y aceite de oliva.', 
    'Actividad moderada como trotar, nadar o caminar durante 40 minutos. Mantén una ingesta adecuada para apoyar la energía necesaria para el ejercicio.').

recomendacion(alta, alto, 
    'Dieta alta en calorías con carbohidratos complejos, proteínas y grasas saludables. Evita alimentos procesados y prioriza comida fresca.', 
    'Entrenamiento intenso para aumentar masa muscular, como correr o levantar pesas. Asegura una recuperación adecuada tras la actividad.').

recomendacion(alta, muy_alto, 
    'Dieta rica en calorías enfocada en carbohidratos rápidos y proteínas de alta calidad para apoyar la intensidad del entrenamiento.', 
    'Entrenamiento de alta intensidad como HIIT o pesas. Asegúrate de nutrirte adecuadamente para evitar la fatiga excesiva.').

recomendacion(muy_alta, muy_bajo, 
    'Dieta extremadamente calórica con carbohidratos y proteínas para una rápida recuperación. Prioriza alimentos fáciles de absorber.', 
    'Reposo absoluto, evitando cualquier tipo de actividad física para asegurar una recuperación completa.').

recomendacion(muy_alta, bajo, 
    'Dieta calórica con carbohidratos rápidos y proteínas de alta calidad para maximizar la energía disponible.', 
    'Actividad ligera, como caminatas o estiramientos, para mantener el cuerpo activo sin agotarlo.').

recomendacion(muy_alta, moderado, 
    'Dieta muy alta en calorías con carbohidratos rápidos, proteínas de alta calidad y grasas saludables para un rendimiento óptimo.', 
    'Actividad moderada como trotar o caminar a buen ritmo por 40-50 minutos. Evita llevar el cuerpo al límite.').

recomendacion(muy_alta, alto, 
    'Dieta extremadamente rica en calorías con carbohidratos rápidos y proteínas para apoyar el rendimiento físico.', 
    'Entrenamiento de alta intensidad como HIIT o pesas. Es clave mantener una buena nutrición y recuperación.').

recomendacion(muy_alta, muy_alto, 
    'Dieta calórica alta en carbohidratos rápidos y proteínas para asegurar un alto rendimiento durante el ejercicio intenso.', 
    'Entrenamiento extremadamente intenso como HIIT avanzado o levantamiento de pesas. La nutrición y recuperación deben ser prioritarias.').

% Validación de las calorías
validar_calorias(Calorias) :- Calorias >= 1200, Calorias =< 3000, !.
validar_calorias(_) :- write('Error: Las calorías deben estar entre 1200 y 3000. Inténtelo de nuevo.'), nl, fail.

% Validación del tiempo
validar_tiempo(Tiempo) :- Tiempo >= 10, Tiempo =< 120, !. 
validar_tiempo(_) :- write('Error: El tiempo de actividad debe estar entre 10 y 120 minutos. Inténtelo de nuevo.'), nl, fail. 

% Ingreso de datos
ingresar_datos :-
    write('Ingrese las calorías diarias recomendadas: (Valores entre 1200 y 3000 calorias): '), nl,
    read(Calorias), nl,
    validar_calorias(Calorias),  % Validamos las calorías
    write('Ingrese el tiempo de actividad física recomendado (en minutos entre 10 a 120 minutos): '), nl,
    read(Tiempo), nl,
    validar_tiempo(Tiempo),  % Validamos el tiempo
    recomendaciones(Calorias, Tiempo, Dieta, Entrenamiento),
    write('Recomendación de dieta: '), write(Dieta), nl,
    write('Recomendación de entrenamiento: '), write(Entrenamiento), nl, !.
