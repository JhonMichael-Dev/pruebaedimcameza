# BackEnd 

Este proyecto consiste en una aplicación desarrollada mediante el framework Spring boot y permite realizar ordenes de productos para clientes. El proyecto se comunica a través de servicios REST al FrontEnd, desarrollada en React.

- Para la clonación del proyecto FrontEnd desarrollado en Angular, se puede acceder a través de:

- Se encuentra adjunto el script con la estructura de la base de datos utilizada, en el gestor de datos PostgreSQL.

- Para la ejecución del proyecto, es necesario importar en el IDE de desarrollo que se vaya a utilizar.

- La conexión de la base de datos con la aplicación BackEnd, se la realiza a través de hibernate, mediante la modificación del archivo src/main/resources/application.properties.

- Colocar el username y password acorde a su configuracion.

  - spring.datasource.url= jdbc:postgresql://localhost:1450/concesionario
- spring.datasource.username= postgres
- spring.datasource.password= 1993

- spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation= true
- spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto= update
