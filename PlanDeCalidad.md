# Test plan 

1. [Test plan identifier](#testplan)
2. [References](#references)
3. [Introduction](#intro)
4. [Test Elements](#TE)
5. [Software Risk Issues](#risk)
6. [Features to be tested](#featuretest)
7. [Features not to be tested](#featurenotest)
8. [Approach](#approach)
9. [Item pass/fail Criteria](#9)
10. [Suspension Criteria and Resumption Requirements](#10)
11. [Test Deliverables](#11)
12. [Remaining Test Tasks](#12)
13. [Environmental Needs](#13)
14. [Staffing and training needs](#14)
15. [Responsabilities](#15)
16. [Schedule](#16)
17. [Planning Risks And Contingenciees](#17)
18. [Approvals](#18)

# 1. Test plan identifier <a name="testplan"></a>
El test plan identifier de este documento es Quality_Plan_M-1.0

Fecha: 25/11/21
Autores: Equipo 405YesFound

# 2. References<a name="references"></a>
Sistemas deL ITAM como la página grace.itam.mx y comunidad.itam.mx en la que se llegan a hacer votaciones y encuestas.

# 3. Introduction<a name="intro"></a>
El propósito de este plan es verificar las funcionalidades que se implementarán en un sistema para subir propuestas de proyectos para el ITAM y que estas seee sometan a votación ante la comunidad del ITAM. Los elementos, el método y el proceso de pruebas corresponden a este plan de calidad.

# 4. Test Elements<a name="TE"></a>
- Interfaz
- Log in
- Votación
- Alta de propuestas
- Resultados
- Menú
- Base de datos

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
- 
# 7. Features not to be tested<a name="featurenotest"></a>
- Funcionamiento de la base de datos.
- Texto de la pestaña "Acerca de" e índice

# 8. Approach<a name="approach"></a>
Realizar un testeo gray box para estresar el sistema y ver qué tanto flujo de usuarios permite al mismo tiempo. 

# 9 Item pass/fail Criteria<a name="9"></a>
Mientras el sistema siga dando servicio será pass, cuando falle un fail.

# 10 Suspension Criteria and Resumption Requirements<a name="10"></a>
Si el sistema se cierra al realizar las pruebas de estresamiento se realizarán otras dos pruebas, se se llega a la misma conclusión que indica que no las soportó, se tendrán que conseguir mejores equipos o se deberá modificar y hacer más resistente el sistema a estas pruebas. Esa decisión recaerá en el Product Manager y Product Owner.

# 11 Test Deliverables<a name="11"></a>
- Las pruebas de estresamiento se comprobarán con un video de la prueba con múltiples computadoras ayudando a simular los microservicios.
- De las pruebas con los usuarios se llena un cuestionario sobre el rendimiento, la calidad y la funcionalidad en el que el usuario indicará que tan satisfecho se encontró.

# 12 Remaining Test Tasks<a name="12"></a>
No Aplica, ya que el despliegue de la aplicación no será incremental, la funcionalidad está interconectada y se desplegará toda en manera conjunta.

# 13. Environmental Needs<a name="13"></a>
Cada dispositivo que soporte el sistem  deebe tener 4gb de RAM un disco de estado sólido de 50gb. Esto se prueba con pruebas de estres conectando distintas computadoras. Las computadoras del ITAM lo soportan.

# 14. Staffing and training needs<a name="14"></a>
Cada que se busque instalar el sistema en algún dispositivo nuevo en el ITAM se necesitará que alguien realice las mismas pruebas de estres e indique que si funciona y lo soporta. Se necesitará a alguien encargado de estas pruebas y en este caso será eel Software Developer.

# 15 Responsabilities<a name="15"></a>
- Software developer: está a cargo de realizar las pruebas y mostrar las pruebas de funcionamiento.
- Product Manager: verifica y aprueba.

# 16 Schedule<a name="16"></a>
Durante el proceso de creación se realizarán pruebas aporximadamente cada semana al terminar un sprint equivalente a una funcionalidad.
Si el sistema ya desplegado no se ve modificado se realizarán pruebas cada 3 meses, pero en caso de ser modificado se reelizarán las pruebas con las nuevas modificaciones sin importar la frecuencia de estas.

# 17 Planning Risks And Contingenciees<a name="17"></a>
Si la página se cae entraría en un estado de mantenimiento que al acceder le de un mensaje al ususario que el servicio se reanudará pronto. Dependiendo de la falla se podría dar un estimado de tiempo para que vuelva a funcionar. 

# 18 Approvals<a name="18"></a>
- Product Manager - internamente
- Junta directiva ITAM: Stakeholders 


