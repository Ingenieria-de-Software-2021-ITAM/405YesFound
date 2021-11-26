# Test plan 

1. [Test plan identifier](#testplan)
2. [References](#references)
3. [Introduction](#intro)
4. [Software Risk Issues](#risk)
5. [Features to be tested](#featuretest)
6. [Features not to be tested](#featurenotest)
7. [Approach](#approach)


# 1. Test plan identifier <a name="testplan"></a>
El test plan identifier de este documento es Quality_Plan_M-1.0

Fecha: 25/11/21
Autores: Equipo 405YesFound

# 2. References<a name="testplan"></a>
Sistemas deL ITAM como la página grace.itam.mx y comunidad.itam.mx en la que se llegan a hacer votaciones y encuestas.

# 3. Introduction<a name="intro"></a>
El propósito de este plan es verificar las funcionalidades que se implementarán en un sistema para subir propuestas de proyectos para el ITAM y que estas seee sometan a votación ante la comunidad del ITAM. Los elementos, el método y el proceso de pruebas corresponden a este plan de calidad.

# 5. Software Risk Issues<a name="risk"></a>
- Precisión de la información: No se le puede mostrar a andie información de alguien más sin que se la comparta, cada votación debe de permitir la cantidad correcta de votos y mostrar las propuestas correctas.
- Seguridad: Seguridad de la información, de las contraseñas y de los datos personales.
- Funcionamiento del sistema frente a fuertes cargas de trabajo con votaciones nuevas o que duren un día.

# 6. Features to be tested<a name="featuretest"></a>
- Funcionamiento de la interfaz y las animaciones en cualquier dispositivo.
- Funcionalidad de votación: que se registren los votos correctamente y solo permita la cantidad correcta de votos.
- Log in: que los usuarios guardados en la base de datos se puedan dar de alta y que nadie pudea acceder a la información de otros usuarios.
- Dar de alta propuestas: que las propuestas sí se eden de alta con la información correcta.
- Resultados: que los resultados desplegados sean acertados y se desplieguen correctamente.
- Uso del menú: movimiento a través de las distintas pestañas.
- Base de datos frente a cargas altas de usuarios.
# 7. Features not to be tested<a name="approach"></a>
- Funcionamiento de la base de datos.
- Texto de la pestaña "Acerca de"


