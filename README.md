# pasantes_back
Proyecto para cargar los códigos del proyecto backend pasantes 


## Configuración de proyecto
1. Descargar el proyecto "pasantes_back" del repositorio, en la direccion deseada mediante zip o usando la herramienta git con el comando "git clone https://github.com/juank20097/pasantes_back.git"
2. Descomprimir el proyecto
3. Abrir el proyecto descargado con Spring Framework
4. Configurar el archivo "docker-compose.yml" ubicado dentro de la carpeta "docker_compose"
5. Definir las credenciales de postgres en "environment" donde "POSTGRES_USER" es el usuario y "POSTGRES_PASSWORD" es la contraseña
7. Configurar los puertos "ports" de acuerdo a la necesidad o dejarlos por defecto.    
8. Configurar los puertos de pgadmin4 si se necesita o dejarlos por defecto.
9. Definir las credenciales de pgadmin4 en "environment" donde "PGADMIN_DEFAULT_EMAIL" es el usuario y "PGADMIN_DEFAULT_PASSWORD" es la contraseña
10. Dirigirse a la dirección del proyecto y dentro de la cartpeta "docker_compose" abrir una terminal
11. Ejecutar el comando  "Docker compose up" para el levantamiento del contenedor con PostgreSQL, PgAdmin
12. Una vez levantado el contenedor, acceder a "pgadmin4" por medio del navegador con la URL: http://LOCALHOSTIP:5050/login, reemplazar LOCALHOSTIP por la ip de su equipo y el puerto si se modificó.
13. Ingresar las credenciales en el login, cuyas credenciales son las configuradas en el "environment" de "pgadmin4"
14. Añadir un nuevo servidor, y colocar un nombre (cualquiera)
15. Abrir la pestaña de "Connection" y escribimos "postgres" en cajón de "Host name/address" que se refiere al nombre del servicio de PostgreSQL en el contenedor Docker.
16. En la misma pestaña, en el cajón de "Username" y "Password" escribir las credenciales definidas en "POSTGRES_USER" y "POSTGRES_PASSWORD" y hacer clic en "save".
17. Desplejar la base de datos y crear una base de datos con el nombre "devsecops" que esta definido proyecto "pasantes_back" en el archivo "application.properties" (modificar el nombre opcional)
18. En la base de datos creada (devsecops), diriguirse a la pestaña "Schemas" y creamos un nuevo esquema con el nombre "Andres", este atributo esta definido en las entidades del proyecto en la notacion @Table (modificar el nombre opcional)
19. 
## Ejecución del proyecto y consumo de servicios

13. Ejecutar el proyecto "pasantes_back"
14. Abrir el software Insomnia para el testeo de los Servicios
15. Seleccionar importar
16. Dirigirse a la direccion del proyecto y dentro de la carpeta "colleccion_insomnia" seleccionar el archivo "Insomnia_colleccion_devsecops"

*consumo de servicios en local (sin seguridades)*
17. Ejecutar los servicios de la carpeta "local" desde el Software Insomnia

*consumo de servicios en WSO2 (con seguridades)*
18. Ejecutar los servicios de la carpeta "WSO2" desde el Software Insomnia


19. En caso de errores con el token, podemos ejecutar los curls en una terminal y copiar el "access_token"

    curl para tokens
    
    empresa:
    
    curl -k -X POST https://localhost:9443/oauth2/token -d "grant_type=client_credentials" -H"Authorization: Basic dThzeDBaN1hCNWY5cmUzSkpmOUlnMFV5WTFFYTpCYzdTZEgyZVM5azRHajV2QjJPQzl3Z2VQS29h"
    
    departamento:
    curl -k -X POST https://localhost:9443/oauth2/token -d "grant_type=client_credentials" -H"Authorization: Basic dnZXV0J6ZkVQOW96SkVKUGRYV3Q0dVVjUElBYTpoR2s0QW9jUVAyRUdfSk5Fb2FxN3J4Um5YZ2th"
    
    empleado:
    curl -k -X POST https://localhost:9443/oauth2/token -d "grant_type=client_credentials" -H"Authorization: Basic aHFmQ0ZJbzd2OVpiU1hqOVRsUFRZbVl3SXdzYTpqZlViNGdOeURPbmNmTmw4VGFRNUFJV0pEcllh"
    
    departamento_empleado:
    curl -k -X POST https://localhost:9443/oauth2/token -d "grant_type=client_credentials" -H"Authorization: Basic ZTR0OU9yT0drZk9FTmlTcW9jY2pxcXNoY0ZRYTptUVdFSGVGSGduRHhpckpIWGZXM2tGekgzV0Fh" 
    
20. Volver a Insomnia, seleccionar el servicio y en la pestaña de "AUTH TYPE" selecionar "Bearer Token" y pegar el "access_token" en el campo "TOKEN" y hacer clic en el boton "send"

21. Comentario de prueba GitLab

