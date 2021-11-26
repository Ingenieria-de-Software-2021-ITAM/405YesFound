# Test plan 

1. [Test plan identifier](#testplan)
2. [References](#references)
3. [Introduction](#intro)
4. [Test Elements](#TE)
5. [Software Risk Issues](#risk)
6. [Features to be tested](#featuretest)
7. [Features not to be tested](#featurenotest)
8. [Approach](#approach)


# 1. Test plan identifier <a name="testplan"></a>
El test plan identifier de este documento es Quality_Plan_M-1.0

Fecha: 25/11/21
Autores: Equipo 405YesFound

# 2. References<a name="testplan"></a>
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
# 7. Features not to be tested<a name="approach"></a>
- Funcionamiento de la base de datos.
- Texto de la pestaña "Acerca de" e índice

# 8. Approach<a name=""></a>
This is your overall test strategy for this test plan; it should be appropriate to the level of the plan (master, acceptance, etc.) and should be in agreement with all higher and lower levels of plans.  Overall rules and processes should be identified. § Are any special tools to be used and what are they? § Will the tool require special training? § What metrics will be collected? § Which level is each metric to be collected at? § How is Configuration Management to be handled? § How many different configurations will be tested? § Hardware § Software § Combinations of HW, SW and other vendor packages § What levels of regression testing will be done and how much at each test level? § Will regression testing be based on severity of defects detected? § How will elements in the requirements and design that do not make sense or are untestable be processed? If this is a master test plan the overall project testing approach and coverage requirements must also be identified. Specify if there are special requirements for the testing. § Only the full component will be tested. § A specified segment of grouping of features/components must be tested together. Other information that may be useful in setting the approach are: § MTBF, Mean Time Between Failures - if this is a valid measurement for the test involved and if the data is available. § SRE, Software Reliability Engineering - if this methodology is in use and if the information is available. 
IEEE Test Plan Outline Foundation Course in Software Testing Prepared by Systeme Evolutif Limited Page 5 How will meetings and other organizational processes be handled? 

# 9 Item pass/fail Criteria
What are the Completion criteria for this plan?  This is a critical aspect of any test plan and should be appropriate to the level of the plan. § At the Unit test level this could be items such as: § All test cases completed. § A specified percentage of cases completed with a percentage containing some number of minor defects. § Code coverage tool indicates all code covered. § At the Master test plan level this could be items such as: § All lower level plans completed. § A specified number of plans completed without errors and a percentage with minor defects. This could be an individual test case level criterion or a unit level plan or it can be general functional requirements for higher level plans. What is the number and severity of defects located? § Is it possible to compare this to the total number of defects?  This may be impossible, as some defects are never detected. § A defect is something that may cause a failure, and may be acceptable to leave in the application. § A failure is the result of a defect as seen by the User, the system crashes, etc.

# 10 Suspension Criteria and Resumption Requirements
Know when to pause in a series of tests. § If the number or type of defects reaches a point where the follow on testing has no value, it makes no sense to continue the test; you are just wasting resources. Specify what constitutes stoppage for a test or series of tests and what is the acceptable level of defects that will allow the testing to proceed past the defects. Testing after a truly fatal error will generate conditions that may be identified as defects but are in fact ghost errors caused by the earlier defects that were ignored. 

# 11 Test Deliverables 
What is to be delivered as part of this plan? § Test plan document. § Test cases. § Test design specifications. § Tools and their outputs. § Simulators. § Static and dynamic generators. § Error logs and execution logs. § Problem reports and corrective actions. One thing that is not a test deliverable is the software itself that is listed under test items and is delivered by developmen

# 12 Remaining Test Tasks
If this is a multi-phase process or if the application is to be released in increments there may be parts of the application that this plan does not address.  These areas need to be identified to avoid any confusion should defects be reported back on those future functions.  This will also allow the users and testers to avoid incomplete functions and prevent waste of resources chasing non-defects. If the project is being developed as a multi-party process, this plan may only cover a portion of the total functions/features. This status needs to be identified so that those other areas have plans developed for them and to avoid wasting resources tracking defects that do not relate to this plan. When a third party is developing the software, this section may contain descriptions of those test tasks belonging to both the internal groups and the external groups. 

# 13. Environmental Needs
- Cada dispositivo que soporte el sistem  deebe tener 4gb de RAM un disco de estado sólido de 50gb. Esto se prueba con pruebas de estres conectando distintas computadoras. Las computadoras del ITAM lo soportan.

# 14. Staffing and training needs
- Cada que se busque instalar el sistema en algún dispositivo nuevo en el ITAM se necesitará que alguien realice las mismas pruebas de estres e indique que si funciona y lo soporta. Se necesitará a alguien encargado de estas pruebas y en este caso será eel Software Developer.

# 15 Responsabilities 
Who is in charge? This issue includes all areas of the plan.  Here are some examples: § Setting risks. § Selecting features to be tested and not tested. § Setting overall strategy for this level of plan. § Ensuring all required elements are in place for testing. § Providing for resolution of scheduling conflicts, especially, if testing is done on the production system. § Who provides the required training? § Who makes the critical go/no go decisions for items not covered in the test plans?
IEEE Test Plan Outline Foundation Course in Software Testing Prepared by Systeme Evolutif Limited Page 7 

# 16 Schedule
Should be based on realistic and validated estimates.  If the estimates for the development of the application are inaccurate, the entire project plan will slip and the testing is part of the overall project plan. § As we all know, the first area of a project plan to get cut when it comes to crunch time at the end of a project is the testing.  It usually comes down to the decision, ‘Let’s put something out even if it does not really work all that well’. And, as we all know, this is usually the worst possible decision. How slippage in the schedule will to be handled should also be addressed here. § If the users know in advance that a slippage in the development will cause a slippage in the test and the overall delivery of the system, they just may be a little more tolerant, if they know it’s in their interest to get a better tested application. § By spelling out the effects here you have a chance to discuss them in advance of their actual occurrence. You may even get the users to agree to a few defects in advance, if the schedule slips. At this point, all relevant milestones should be identified with their relationship to the development process identified.  This will also help in identifying and tracking potential slippage in the schedule caused by the test process. It is always best to tie all test dates directly to their related development activity dates.  This prevents the test team from being perceived as the cause of a delay.  For example, if system testing is to begin after delivery of the final build, then system testing begins the day after delivery.  If the delivery is late, system testing starts from the day of delivery, not on a specific date.  This is called dependent or relative dating. 

# 17 Planning Risks And Contingenciees
What are the overall risks to the project with an emphasis on the testing process? § Lack of personnel resources when testing is to begin. § Lack of availability of required hardware, software, data or tools. § Late delivery of the software, hardware or tools. § Delays in training on the application and/or tools. § Changes to the original requirements or designs. Specify what will be done for various events, for example: § Requirements definition will be complete by January 1, 19XX, and, if the requirements change after that date, the following actions will be taken. § The test schedule and development schedule will move out an appropriate number of days.  This rarely occurs, as most projects tend to have fixed delivery dates. § The number of test performed will be reduced. § The number of acceptable defects will be increased. § These two items could lower the overall quality of the delivered product. § Resources will be added to the test team. § The test team will work overtime. § This could affect team morale. § The scope of the plan may be changed. § There may be some optimization of resources.  This should be avoided, if possible, for obvious reasons. 
IEEE Test Plan Outline Foundation Course in Software Testing Prepared by Systeme Evolutif Limited Page 8 § You could just QUIT.  A rather extreme option to say the least. Management is usually reluctant to accept scenarios such as the one above even though they have seen it happen in the past. The important thing to remember is that, if you do nothing at all, the usual result is that testing is cut back or omitted completely, neither of which should be an acceptable option.

# 18 Approvals
Who can approve the process as complete and allow the project to proceed to the next level (depending on the level of the plan)? At the master test plan level, this may be all involved parties. When determining the approval process, keep in mind who the audience is.  § The audience for a unit test level plan is different than that of an integration, system or master level plan. § The levels and type of knowledge at the various levels will be different as well. § Programmers are very 


