# 4. Características del sistema

## 4.1 Renovación de contraseña segura

## 4.1.1 Description and Priority

Debido al creciente aumento de los ciberataques(México es el lugar 9 con más ataques en el mundo) se deicidió implementar este feature para disminuir la amenaza de ataque, pues el cambio constante de contraseña reduce esta vulnerabilidad.
Es una tarea de alta prioridad, pues está relacionada con la seguridad de la información 
de los usuarios. El riesgo es alto si una persona ajena a la organización entra con las 
credenciales de otra persona.

## 4.1.2 Stimulus/Response Sequences
List the sequences of user actions and system responses that stimulate the behavior defined for this feature. These will correspond to the dialog elements associated with use cases.

## 4.1.3 Functional Requirements
El usuario debe de tener acceso a un sistema que le permita generar un token a partir de información que solo el usuario tiene. Si el usuario no introduce la información válida el sistema de token no le permitirá obtenerlo. Es necesario el usuario y contraseña, y posteriormente el token y una nueva contraseña que cumpla con los requisitos de seguridad para que se permita cambiar la contraseña. 
Después de cierto tiempo sin cambiar de contraseña será obligatorio cambiarla para poder entrar a la página y se avisará desde dos semanas antes.


Each requirement should be uniquely identified with a sequence number or a meaningful tag of some kind.

REQ-1:

REQ-2:
