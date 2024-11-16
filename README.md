# Proyecto Java Spring

Este es un proyecto base utilizando **Java** y **Spring Boot**. El objetivo de este repositorio es servir como punto de partida para proyectos basados en estas tecnologías. 

## Requisitos

Asegúrese de tener las siguientes herramientas instaladas en su máquina:

- **Java 22**
- **Maven 3.3.0** o superior
- **Git**

## Configuración

Antes de ejecutar el proyecto, configure el archivo `application.properties` con los datos adecuados para su entorno. Este archivo se encuentra en la ruta:


### Ejemplo de configuración del archivo `application.properties`

#### Configuración de la base de datos
```properties
spring.application.name=literAlura
spring.datasource.url=jdbc:mysql://127.0.0.1/literAlura?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
