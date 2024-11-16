# Proyecto Java Spring de Juan Arce para Alura Latam 

Este es un proyecto base utilizando **Java** y **Spring Boot**. El objetivo de este repositorio es servir como punto de partida para proyectos basados en estas tecnologías. 

# Descripción del Proyecto

Este proyecto es una aplicación de consola basada en **Java** y **Spring Boot**, diseñada para gestionar información de libros. Su enfoque principal está en proporcionar funcionalidades básicas que permitan interactuar con la base de datos de libros de manera eficiente. 

### Funcionalidades principales

1. **Búsqueda de libros por título**  
   La persona usuaria puede buscar libros ingresando el título en la consola. Por ejemplo, si busca "Pride" (en inglés, *Orgullo*), el sistema mostrará los resultados correspondientes, en caso de que el libro exista en la base de datos.

### Consideraciones

- La aplicación es solo de **consola**, por lo que no se requiere una interfaz gráfica o frontend.
- Las búsquedas son sensibles a los datos almacenados en la base de datos. Asegúrese de que la base de datos esté configurada correctamente y contenga registros para obtener resultados precisos.

### Objetivo del Proyecto

Proveer una solución simple y funcional que permita realizar búsquedas de libros por título utilizando tecnologías modernas como Java y Spring Boot, mientras se enfoca en la lógica de backend y manejo de datos.

## Requisitos

Asegúrese de tener las siguientes herramientas instaladas en su máquina:

- **Java 17**
- **Maven 3.3.0** o superior
- **Git**

## Configuración

Antes de ejecutar el proyecto, configure el archivo `application.properties` con los datos adecuados para su entorno. Este archivo se encuentra en la ruta:


### Ejemplo de configuración del archivo `application.properties`

#### Configuración de la base de datos
```properties
spring.application.name=literalura
spring.datasource.url=jdbc:mysql://localhost/literalura
spring.datasource.username=postgres
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.HSQLDialect

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
