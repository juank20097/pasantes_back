# Container Base

FROM eclipse-temurin:17-jdk-alpine

ENV NOMBRE=ejemplonombrejar

# Ports to Export

#Change timezone to server

ENV TZ=America/Guayaquil
USER root
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# Copy files to deploy

ADD ./$NOMBRE aplicacion.jar

# execute run to deploy

CMD ["java","-jar","/aplicacion.jar"]