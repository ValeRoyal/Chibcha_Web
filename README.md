# ChibchaWeb

Aplicación web para centralizar y gestionar las operaciones de **ChibchaWeb**, una empresa de servicios de alojamiento web y gestión de dominios.

## Descripción del proyecto

ChibchaWeb es un sistema de información diseñado para centralizar los procesos administrativos y operativos de una empresa de hosting. La aplicación busca reemplazar los sistemas heredados de la organización mediante una plataforma web que permita gestionar clientes, empleados, distribuidores, dominios, servicios de hosting, pagos y solicitudes de soporte técnico.

El sistema contempla diferentes perfiles de usuario, cada uno con funcionalidades y permisos específicos, además de mecanismos de integración con servicios externos para el registro de dominios y el procesamiento de pagos.

## Objetivos

- Centralizar la información y las operaciones de la empresa.
- Gestionar los clientes, empleados y distribuidores.
- Administrar las solicitudes de registro y transferencia de dominios.
- Gestionar los planes de hosting y sus respectivas configuraciones.
- Automatizar los procesos de cobro y liquidación de comisiones.
- Facilitar la atención y el seguimiento de solicitudes de soporte técnico.
- Permitir la migración controlada de información desde los sistemas anteriores.

## Módulos del sistema

| Módulo | Descripción |
|---|---|
| Control de acceso | Registro, autenticación y autorización de usuarios según sus roles. |
| Gestión de clientes | Administración de perfiles, información personal y solicitudes de los clientes. |
| Gestión de dominios y hosting | Registro y transferencia de dominios, selección de planes y administración de servicios de hosting. |
| Gestión de distribuidores | Administración de distribuidores, consulta de dominios y clasificación comercial. |
| Gestión de empleados | Registro y administración del personal interno y sus roles. |
| Gestión de pagos y comisiones | Procesamiento de cobros, generación de comprobantes y liquidación de comisiones. |
| Soporte técnico | Creación, asignación, seguimiento y escalamiento de tickets de soporte. |
| Administración | Configuración de parámetros del negocio, usuarios, planes y niveles de servicio. |
| Migración de datos | Extracción, validación y transferencia de información desde los sistemas heredados. |

## Roles de usuario

La aplicación contempla los siguientes perfiles:

- **Cliente:** administra su cuenta, contrata servicios de hosting, solicita registros o transferencias de dominios y reporta inconvenientes.
- **Distribuidor:** consulta los dominios que administra, su categoría comercial y las comisiones correspondientes.
- **Empleado de soporte técnico:** gestiona los tickets asignados, establece prioridades y escala los casos cuando es necesario.
- **Administrador:** configura los parámetros del negocio, administra usuarios y empleados, supervisa solicitudes y controla procesos administrativos.

## Características generales

- Aplicación accesible desde un navegador web.
- Comunicación segura mediante HTTPS.
- Integración con registradores externos de dominios mediante archivos XML.
- Integración con plataformas externas de procesamiento de pagos.
- Gestión de planes de hosting Chibcha-Platino, Chibcha-Plata y Chibcha-Oro.
- Compatibilidad con plataformas Windows y Unix.
- Manejo de diferentes periodicidades de pago: mensual, trimestral, semestral y anual.
- Mecanismos de contingencia para proteger la información ante interrupciones de la persistencia principal.

## Estado del proyecto

**En desarrollo.**

Actualmente, el proyecto se encuentra en la etapa de implementación, posterior al levantamiento de requerimientos y al modelado funcional y estructural del sistema.

## Documentación

La documentación de análisis y diseño del proyecto comprende:

- Especificación de requerimientos funcionales y no funcionales.
- Diagramas de casos de uso.
- Diagrama de actores.
- Modelo de dominio.
- Diagramas y especificaciones complementarias del sistema.

## Equipo de desarrollo

Proyecto académico desarrollado para la asignatura **Fundamentos de Ingeniería de Software** de la Universidad Distrital Francisco José de Caldas.

- Valentina Aguilar Perdomo
- Silvana Martínez

**Docente:** Henry Alberto Diosa.

## Licencia

Proyecto académico. No se ha definido una licencia de distribución de código abierto.
