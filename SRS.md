# Software Requirements Specification

# Tabla de Contenido
1. [Introducción](#introduction)
2. [Descripción General](#overall-description)
3. [Requerimiento de Interfaz Externo](#external-interface-requirement)
4. [Features del Sistema](#system-features)
5. [Otros Requerimientos No-Funcionales](#other-nonfunctional-requirements)

## 1. Introducción <a name="introduction"></a>
### 1.1 Propósito
El propósito de este documento es la creación de una aplicación para el Instituto Tecnológico Autónomo de México que permita que los y las estudiantes de la universidad voten para elegir proyectos que se llevarán a cabo dentro de la institución. El objetivo principal es ayudar a facilitar la elección de proyectos nuevos.

### 1.2 Convenciones del Documento

| Término  | Convención  |
|---|---|
| Instituto Tecnológico Autónomo de México  | ITAM  |
| Base de Datos  | BD  |

### 1.3 Audiencia Destinataria y Sugerencias de Lectura

Este documento esta destinado a desarolladores, project managers y a usuarios. La audiencia principal de este documento son los desarolladores que crearan y mantedrán el producto. Sin embargo, también es útil tanto para los estudiantes como para los integrantes de la administración del ITAM que desean publicar proyectos dentro de la plataforma. Para aquellos con tiempo, sugerimos que lean el documento de principio a fin. Para aquellos con menos tiempo, la sección mas pertinente es la de [Features del Sistema](#system-features).

### 1.4 Definición (Scope) del Producto

El propósito de esta aplicación es facilitar la votación y elección de proyectos propuestos por la administración del ITAM. Se requiere que sea conveniente y fácil de usar. Adicionalmente permite que el cuerpo estudiantil participe de manera más activa en la toma de decisiones dentro de su universidad, fomentando un ambiente democrático.

## 2. Descripción General<a name="overall-description"></a>
### 2.1 Perspectiva del Producto

El propósito de este producto es proveer a los estudiantes del ITAM con más facultades para influir en el proceso de decisiones de la administración de la institución. Este producto existe dentro del contexto de una variedad de aplicaciones que utilizán los estudiantes del ITAM, las dos más importantes siendo Canvas y Grace. Este producto sería un producto nuevo y autónomo, pero que utilizaría el mismo login usuario y password que el sistema de Grace. El username siendo la clave única del estudiante mientras que el password incial sería el NIP que recibes al ingresar a la universidad en primer semestre.

### 2.2 Funciones del Producto

El producto tendrá dos tipos de usuarios, estudiante y administrador. 

Funciones de Estudiante:
- Login a su cuenta.
- Votar por el proyecto deseado.
- Observar los resultados de una votación.

Funciones de Administrador:
- Login a su cuenta.
- Comenzar una campaña nueva de votación.
- Añadir opciones a una campaña de votación (con nombre, descripción y/o imágenes).
- Concluir una campaña de votación.
- Observar los resultados de una votación.

### 2.3 Clases de Usuario y Características

Como fue mencionado previamente, habrá dos tipos de usuarios: estudiante y administrador. Es más importante satisfacer las necesidades del usuario tipo estudiante ya que habrá mucho más usuarios en esta categoría. El usuario administrador debería tener acceso a todas las funciones del producto.

### 2.4 Entorno de Operación

El entorno de operación del sistema de votación esta listado debajo:

- BD distribuida
- Sistema tipo Client/Server
- Sistema Operativo: Windows
- BD: Derby
- Plataforma: Java/JavaScript
- Arquitectura: Microservicios y Space-Based.

La aplicación solamente tendría que ser una "web-app" ya que no se utilizaría tan seguído por los usuarios y porque no hay necesidad de que sea híper-accesible.

### 2.5 Limitaciones de Diseño e Implementación

1. Los commandos de Derby para los queries e aplicaciones del producto.
2. Políticas de confidencialidad de datos de la institución (ITAM).
3. Limitaciones de una BD distribuida (mayor complejidad).
4. Limitaciones de una arquitectura de Microservicios (performance).
5. Limitaciones de una arquitectura Space-Based (testability y development).

### 2.6 Suposiciones y Dependencias

1. La creación de este sistema opera bajo la suposición de que el ITAM tiene una BD con las claves únicas y los NIPs de cada alumno del ITAM. Sin esta BD el producto se vería afectado y se tendría que generar una BD de usuarios para constituir los logins.
2. Adicionalmente, se trabaja bajo la suposición de que dicha BD contiene información para verificar que el alumno sigue inscrito en el ITAM.
3. Finalmente se asume que el backend del producto se mantedrá de manera adecuada.

## 3. Requerimiento de Interfaz Externo<a name="external-interface-requirement"></a>
### 3.1 Interfaces de Usuario

El producto tendrá cuatro interfaces principales para los usuarios:

- Página de Login:

![login](./srs_images/login.jpg)

- Página de Votación de Proyectos:

![proyectos](./srs_images/proyectos.jpg)

- Página de Registro de Proyectos Nuevos (sólo para usuarios tipo administrador):

![registro](./srs_images/registro.jpg)

- Página de Vista de Resultados:

![resultados](./srs_images/resultados.jpg)

También se desea que haya un menú en la parte superior de cada una de las página para que el usuario pueda navegar a través de todas las funcionalidades de el producto.

### 3.2 Interfaces de Hardware

El producto solo será accesible a través de un navegador web que este instalado dentro de una computadora tradicional u otro dispositivo electrónico como un smartphone o tablet. No hay planes para crear una versión móvil del producto como se hace a veces para algunas páginas web.

### 3.3 Interfaces de Software

El producto se accesará a través de un navegador web ya que será una "web app."

<Describe the connections between this product and other specific software components (name and version), including databases, operating systems, tools, libraries, and integrated commercial components. Identify the data items or messages coming into the system and going out and describe the purpose of each. Describe the services needed and the nature of communications. Refer to documents that describe detailed application programming interface protocols. Identify data that will be shared across software components. If the data sharing mechanism must be implemented in a specific way (for example, use of a global data area in a multitasking operating system), specify this as an implementation constraint.>

### 3.4 Interfaces de Comunicación

<Describe the requirements associated with any communications functions required by this product, including e-mail, web browser, network server communications protocols, electronic forms, and so on. Define any pertinent message formatting. Identify any communication standards that will be used, such as FTP or HTTP. Specify any communication security or encryption issues, data transfer rates, and synchronization mechanisms.>

## 4. Features del Sistema<a name="system-features"></a>

### 4.1 Feature 1: Login

#### 4.1.1 Descripción y Prioridad

Esta funcionalidad se refiere a que un usuario (ya sea estudiante o administrador) pueda ingresar a su cuenta dentro del producto. Esta funcionalidad tiene prioridad alta o de tipo 1 ya que es indispensable para que un usuario pueda llevar a cabo acciónes dentro del producto. Es increíblemente importante que exista **rendición de cuentas** dentro de este producto. Un buen sistema de **rendición de cuentas** permitirá que cada voto sea contado y relacionado a un usuario específico, así evitando fraudes en votaciones.

#### 4.1.2 Secuencias de Estímulo/Respuesta

| Estímulo  | Respuesta  |
|---|---|
| El usuario ingresa su nombre de usuario (clave única) y contraseña (NIP) en los renglones correspondientes. Presiona el botón "Entrar." | El producto lleva al usuario a la página de inicio de la aplicación. El producto lo tiene identificado como el usuario correspondiente a la tupla de nombre de usuario y contraseña ingresada.  |

#### 4.1.3 Requerimientos Funcionales

**REQ-1-1:** El sistema tiene acceso a la BD de usuarios de la aplicación. Dicha BD esta compuesta por, al menos: nombres de usuario (claves únicas), contraseñas, tipos de usuario (administrador o estudiante), y en el caso de ser estudiante si siguen dados de alta dentro del ITAM.

**REQ-1-2:** El sistema no permite acceso al usuario si la combinación de nombre de usuario y contraseña no está dentro de la BD.

**REQ-1-3:** El sistema bloquea la habilidad de ingresar nombres de usuarios/contraseñas nuevas después de 5 intentos fallidos por un determinado tiempo. Este requerimiento añade seguridad al sistema y evita que alguien pueda accesar la cuenta de otro usuario a través de "brute-forcing."

**REQ-1-4:** El sistema no permite acceso al usuario si la BD indica que el usuario es un estudiante que esta dado de baja en el ITAM. Despliega un mensaje correspondiente.

### 4.2 Feature 2: Votar para el proyecto deseado

#### 4.2.1 Descripción y Prioridad

Esta funcionalidad se refiere a que un usuario, del tipo estudiante, pueda votar a favor de el proyecto que deseé. Evidentemente, esta funcionalidad tiene prioridad alta o de tipo 1 ya que es indispensable para que el producto haga lo que debe de hacer.

#### 4.2.2 Secuencias de Estímulo/Respuesta

| Estímulo  | Respuesta  |
|---|---|
| El usuario ingresa su clave única a una caja de texto, elige el proyecto deseado de un "drop-down list" y presiona el botón de "Votar". | El producto registra el voto del usuario dentro de la BD y despliega un mensaje de confirmación.  |

#### 4.2.3 Requerimientos Funcionales

**REQ-2-1:** El sistema tiene acceso a la BD de usuarios de la aplicación, previamente mencionada en REQ-1-1.

**REQ-2-2:** El sistema tiene acceso (con habilidad para modificar) a la BD de votos/proyectos, que registra cuantos votos recibe cada proyecto.

**REQ-2-3:** El sistema no permite que el mismo usuario vote más de una vez.

### 4.3 Feature 3: Crear proyectos nuevos

#### 4.3.1 Descripción y Prioridad

Esta funcionalidad se refiere a que un usuario, del tipo administrador, pueda añadir un proyecto nuevo a una contienda existente. El administrador debe poder asignar un nombre, descripción breve, descripción completa e imágen a las caracterísitcas de dicho proyecto nuevo, para que los usuarios estudiantes entiendan por qué proyecto están votando. Evidentemente, esta funcionalidad tiene prioridad alta o de tipo 1 ya que es indispensable para que el producto haga lo que debe de hacer. Sin esta funcionalidad los usuarios tipo estudiante no podrían votar por algún proyecto.

#### 4.3.2 Secuencias de Estímulo/Respuesta

| Estímulo  | Respuesta  |
|---|---|
| Dentro de las cajas de texto correspondientes, el usuario ingresa el nombre del proyecto, la contienda, la descripción breve, y la descripción completa del proyecto. El usuario presiona el botón "Registrar proyecto". | El producto añade el proyecto nuevo y sus características a la base de datos de proyectos y lo despliega en la contienda especificada. Ahora los usuarios tipo estudiante podrán votar por dicho proyecto.  |

#### 4.3.3 Requerimientos Funcionales

**REQ-3-1:** El sistema tiene acceso a la BD de usuarios de la aplicación, previamente mencionada en REQ-1-1.

**REQ-3-2:** El sistema tiene acceso (con habilidad para modificar) a la BD de votos/proyectos, que registra las características de cada proyecto y los votos que tienen, previamente mencionada en REQ-2-2.

**REQ-3-3:** El sistema solo permite que los usuarios tipo administrador utilizen esta funcionalidad.

**REQ-3-4** Para permanecer apegado al requerimiento de **autorización**, el sistema verifica, con la BD mencionada en REQ-3-1, que el usuario es del tipo administrador, antes de llevar a cabo cambios.

### 4.4 Feature 4: Observación de Resultados

#### 4.4.1 Descripción y Prioridad

Esta funcionalidad se refiere a que un usuario pueda observar los resultados de una contienda de votaciones. Esta visualización se llevaría a cabo en una gráfica circular. Esta funcionalidad tiene prioridad media o de tipo 2 ya que no es completamente indispensable para que el producto haga lo que debe de hacer. En teoría, un administrador de BD podría observar los resultados de una contienda sin esta funcionalidad. Sin embargo, es una funcionalidad de alta conveniencia para todos los usuarios.

#### 4.4.2 Secuencias de Estímulo/Respuesta

| Estímulo  | Respuesta  |
|---|---|
| El usuario presiona "Resultados" en el menú superior de la aplicación.| El producto lleva al usuario a la página de "Resultados" donde se despliega una gráfica circular con los resultados de la contienda.  |

#### 4.4.3 Requerimientos Funcionales

**REQ-4-1:** El sistema tiene acceso a la BD de votos/proyectos de la aplicación, previamente mencionada en REQ-2-2.

## 5. Otros Requerimientos No-Funcionales<a name="other-nonfunctional-requirements"></a>

### 5.1 Requerimientos de Rendimiento

Estos requerimientos se aseguran que la aplicación funcione como debe funcionar sin que se reduzca su desempeño. Es importante que consideremos que habrá periodos dondé el sistema tiene a muchos usuarios en línea, como cuando se acerque la fecha límite para ingresar votos, y que también habrá periodos dondé el sistema tendrá a una cantidad de usuarios activos cercana a cero. Para los periodos de mucha actividad de usuarios sería inteligente implementar un "load balancer" para distribuir los request que se mandan al servidor y evitar que se junten todos. EL "load balancer" también trabajaría con "autoscaling" para prender servidores adicionales cuando se necesiten. Igualmente sería importante consider que el techo para el número de usuarios en línea sería el número de estudiantes en el ITAM.

### 5.2 Requerimientos de Protección

El peor daño que podría causar este producto sería la privación del derecho a votar de un estudiante. Esto ocurriría en el caso de que surja algún error con la aplicación que cause que el voto de un estudiante no se registre o que un estudiante no pueda ingresar al sistema a votar. Sin embargo, los requerimientos establecidos en otras partes de este documento (por ejemplo los requerimientos de rendimiento) se asegurarían que esto no ocurra o casi nunca ocurra.

### 5.3 Requerimientos de Seguridad

Este producto deberá apegarse a los principios de seguridad de software:

- **Confidencialidad:** Este principio se enfoca en proteger los datos sensibles de los usuarios. En este caso es importante conservar la privacidad de el voto. Este requerimiento se podría implementar en la manera en la que se registran los votos a la BD. Solamente se debe registrar el estatus del usuario como ya haber votado o no y sumar el voto al proyecto elegido. No se debe de relacionar el usuario al proyecto al que voto a favor.

- **Integridad:** Este principios se enfoca en mantener la veracidad y confiabilidad de los datos. En este caso esto se implementaría con el tipo de usuario administrador, que sería el único con la capacidad de accesar funciones que modifican las BD de manera directa. Si este tipo de cuenta solo se le entrega a usuarios de alta confiabilidad, no debería de haber problemas con este principio. Para reforzar este principio se podría implementar un sistema de firmas digitales que se tenga que llevar a cabo cada vez que un administrador haga un cambio a los datos.

- **Disponibilidad:** Este principio se enfoca en mantener disponible el producto y la información que provee a los usuarios. Si los requerimientos de rendimiento son cumplidos y los system features son desarollados de manera apropiada, los usuarios deberían de siempre tener acceso a los datos que tienen autorización para ver. Para reforzar este principio se podrían implementar protecciones en contra de ataques DDsS (Distributed Denial of Service).

- **Autenticación:** Este principio se enfoca en validar la identidad de los usuarios que ingresan al producto. Esto se podría asegurar implementando autenticación de dos factores.

- **Autorización:** Este principio se enfoca en que los permisos adecuados sean asignados a las personas correctas. En este caso este principio se cumple por medio de los tipos de usuario que el sistema incluye. Los usuarios estudiante tienen permisos limitados mientras que los usuarios administrador no.

- **Rendición de cuentas:** Finalmente, este principio se enfoca en construir los mecanismos adecuados para reportar las acciones de los usuarios. Este principio se podría cumplir con un log que registre lo que hacen los usuarios (estudiantes y administradores). La importancia del login feature yace en este principio ya que permite atribuir la acciones llevadas a cabo a una cuenta específica.

### 5.4 Atributos de Software de Calidad

<Specify any additional quality characteristics for the product that will be important to either the customers or the developers. Some to consider are: adaptability, availability, correctness, flexibility, interoperability, maintainability, portability, reliability, reusability, robustness, testability, and usability. Write these to be specific, quantitative, and verifiable when possible. At the least, clarify the relative preferences for various attributes, such as ease of use over ease of learning.>

### 5.5 Reglas del Negocio
List any operating principles about the product, such as which individuals or roles can perform which functions under specific circumstances. These are not functional requirements in themselves, but they may imply certain functional requirements to enforce the rules.
