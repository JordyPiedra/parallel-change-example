**Práctica 1. Parallel change**

**Enunciado**

Se desean realizar ciertos cambios en una aplicación que gestiona una librería online. Esta
librería ofrece un interfaz web y una API REST para la gestión de libros, con sus
correspondientes pruebas unitarias, de API REST y Selenium. Se proporciona el código de
dicha aplicación, que podrá obtenerse del aula virtual.
Los cambios que se desean realizar, de forma compatible con la versión inmediatamente
anterior, son los siguientes:
* Cambio de nombre del atributo description por preface.
* Añadir un nuevo campo precio en la tabla de tipo INT y posterior cambio del tipo del
   campo precio por FLOAT(24).
   Se proporciona una versión inicial de la aplicación que incluye la dependencia de la librería
   Liquibase para gestionar los cambios en el esquema de la base de datos, así como el script
   que inicializa la tabla de libros. Esta versión llega el sufijo “v1”, y su versión del POM es la
   1.0.0.
   El alumno debe preparar las correspondientes versiones en carpetas separadas con los
   sufijos v2, v3, … Cada versión debe modificar la versión del POM (la versión inicial es la
   1.0.0) incrementando el major version (2.0.0, 3.0.0, …) Además, cada versión debe poder
   arrancarse, tirarse abajo, y arrancar la versión anterior que debe funcionar correctamente.


**Recomendaciones:**

   El enunciado está preparado para usar MySQL. Concretamente, está probado con la
   siguiente configuración de esta base de datos basada en docker:

   `docker run --name mysql -d -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=test -p 3306:3306 mysql:8`

   Las inserciones en la base de datos deben probarse con la API REST. La interfaz
   web hace referencia a campos del objeto book que en sucesivas versiones pueden
   desaparecer. No es necesario actualizar la interfaz web.