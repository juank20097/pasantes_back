# pasantes_back
Proyecto para cargar los códigos del proyecto backend pasantes 



*Ejecucion de proyecto*
1. Descargar el proyecto "pasantes_back" del repositorio, en la direccion deseada
2. Abrir el proyecto descargado con Spring Framework
3. Dirigirse a la dirección del proyecto y dentro de la cartpeta "docker_compose" abrir una terminal en esta dirección
4. Ejecutar el comando  "Docker compose up" para el levantamiento de PostgreSQL, PgAdmin
5. Ejecutar el proyecto "pasantes_back" en el IDE
6. Abrir el software Insomnia para el testeo de los Servicios
7. Sobre una coleccion seleccionamos importar
8. Dirigirse a la direccion del proyecto y dentro de la carpeta "colleccion_insomnia" seleccionamos el archivo "Insomnia_colleccion_devsecops"

*consumo de servicios en local*
9. Ejecutar los servicios de la carpeta "local" desde el Software Insomnia

*consumo de servicios en WSO2*

10. curl para tokens para consumo de WSO2
11. URL: http://192.168.12.204:8280/iess-ws-devsecops/1.0
    
12. empresa:
curl -k -X POST https://localhost:9443/oauth2/token -d "grant_type=client_credentials" -H"Authorization: Basic dThzeDBaN1hCNWY5cmUzSkpmOUlnMFV5WTFFYTpCYzdTZEgyZVM5azRHajV2QjJPQzl3Z2VQS29h"

13. departamento:
curl -k -X POST https://localhost:9443/oauth2/token -d "grant_type=client_credentials" -H"Authorization: Basic dnZXV0J6ZkVQOW96SkVKUGRYV3Q0dVVjUElBYTpoR2s0QW9jUVAyRUdfSk5Fb2FxN3J4Um5YZ2th"

14. empleado:
curl -k -X POST https://localhost:9443/oauth2/token -d "grant_type=client_credentials" -H"Authorization: Basic aHFmQ0ZJbzd2OVpiU1hqOVRsUFRZbVl3SXdzYTpqZlViNGdOeURPbmNmTmw4VGFRNUFJV0pEcllh"

15. departamento_empleado:
curl -k -X POST https://localhost:9443/oauth2/token -d "grant_type=client_credentials" -H"Authorization: Basic ZTR0OU9yT0drZk9FTmlTcW9jY2pxcXNoY0ZRYTptUVdFSGVGSGduRHhpckpIWGZXM2tGekgzV0Fh"


