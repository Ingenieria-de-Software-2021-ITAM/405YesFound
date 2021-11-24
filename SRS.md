# Software Requirements Specification

# Tabla de Contenido
1. [Introducción](#introduction)
2. [Descripción General](#overall-description)
3. [Requerimiento de Interfaz Externo](#external-interface-requirement)
4. [Features del Sistema](#system-features)
5. [Otros Requerimientos No-Funcionales](#other-nonfunctional-requirements)
6. [Otros Requerimientos](#other-requirements)

## 1. Introducción <a name="introduction"></a>
### 1.1 Propósito
El propósito de este documento es la creación de una aplicación para el Instituto Tecnológico Autónomo de México que permita que los y las estudiantes de la universidad voten para elegir proyectos que se llevarán a cabo dentro de la institución. El objetivo principal es ayudar a facilitar la elección de proyectos nuevos.

### 1.2 Convenciones del Documento

| Término  | Convención  |
|---|---|
| Instituto Tecnológico Autónomo de México  | ITAM  |
| Base de Datos  | BD  |
| Cosa  | Coso  |

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


<Describe the logical characteristics of each interface between the software product and the users. This may include sample screen images, any GUI standards or product family style guides that are to be followed, screen layout constraints, standard buttons and functions (e.g., help) that will appear on every screen, keyboard shortcuts, error message display standards, and so on. Define the software components for which a user interface is needed. Details of the user interface design should be documented in a separate user interface specification.>

### 3.2 Interfaces de Hardware

<Describe the logical and physical characteristics of each interface between the software product and the hardware components of the system. This may include the supported device types, the nature of the data and control interactions between the software and the hardware, and communication protocols to be used.>

### 3.3 Interfaces de Software

El producto se accesará a través de un navegador web ya que será una "web app."

<Describe the connections between this product and other specific software components (name and version), including databases, operating systems, tools, libraries, and integrated commercial components. Identify the data items or messages coming into the system and going out and describe the purpose of each. Describe the services needed and the nature of communications. Refer to documents that describe detailed application programming interface protocols. Identify data that will be shared across software components. If the data sharing mechanism must be implemented in a specific way (for example, use of a global data area in a multitasking operating system), specify this as an implementation constraint.>

### 3.4 Interfaces de Comunicación

<Describe the requirements associated with any communications functions required by this product, including e-mail, web browser, network server communications protocols, electronic forms, and so on. Define any pertinent message formatting. Identify any communication standards that will be used, such as FTP or HTTP. Specify any communication security or encryption issues, data transfer rates, and synchronization mechanisms.>

## 4. Features del Sistema<a name="system-features"></a>

### 4.1 System Feature 1

<Don’t really say “System Feature 1.” State the feature name in just a few words.>

### 4.1.1 Description and Priority

<Provide a short description of the feature and indicate whether it is of High, Medium, or Low priority. You could also include specific priority component ratings, such as benefit, penalty, cost, and risk (each rated on a relative scale from a low of 1 to a high of 9).>

### 4.1.2 Stimulus/Response Sequences

List the sequences of user actions and system responses that stimulate the behavior defined for this feature. These will correspond to the dialog elements associated with use cases.

### 4.1.3 Functional Requirements

<Itemize the detailed functional requirements associated with this feature. These are the software capabilities that must be present in order for the user to carry out the services provided by the feature, or to execute the use case. Include how the product should respond to anticipated error conditions or invalid inputs. Requirements should be concise, complete, unambiguous, verifiable, and necessary. Use “TBD” as a placeholder to indicate when necessary information is not yet available.>

Each requirement should be uniquely identified with a sequence number or a meaningful tag of some kind.

REQ-1:

REQ-2:

### 4.2 System Feature 2 (and so on)

## 5. Otros Requerimientos No-Fucnionales<a name="other-nonfunctional-requirements"></a>

### 5.1 Performance Requirements
If there are performance requirements for the product under various circumstances, state them here and explain their rationale, to help the developers understand the intent and make suitable design choices. Specify the timing relationships for real time systems. Make such requirements as specific as possible. You may need to state performance requirements for individual functional requirements or features.
### 5.2 Safety Requirements

<Specify those requirements that are concerned with possible loss, damage, or harm that could result from the use of the product. Define any safeguards or actions that must be taken, as well as actions that must be prevented. Refer to any external policies or regulations that state safety issues that affect the product’s design or use. Define any safety certifications that must be satisfied.>

### 5.3 Security Requirements

Specify any requirements regarding security or privacy issues surrounding use of the product or protection of the data used or created by the product. Define any user identity authentication requirements. Refer to any external policies or regulations containing security issues that affect the product. Define any security or privacy certifications that must be satisfied.

### 5.4 Software Quality Attributes

<Specify any additional quality characteristics for the product that will be important to either the customers or the developers. Some to consider are: adaptability, availability, correctness, flexibility, interoperability, maintainability, portability, reliability, reusability, robustness, testability, and usability. Write these to be specific, quantitative, and verifiable when possible. At the least, clarify the relative preferences for various attributes, such as ease of use over ease of learning.>

### 5.5 Business Rules
List any operating principles about the product, such as which individuals or roles can perform which functions under specific circumstances. These are not functional requirements in themselves, but they may imply certain functional requirements to enforce the rules.

## 6. Otros Requerimientos <a name="other-requirements"></a>

Define any other requirements not covered elsewhere in the SRS. This might include database requirements, internationalization requirements, legal requirements, reuse objectives for the project, and so on. Add any new sections that are pertinent to the project.
