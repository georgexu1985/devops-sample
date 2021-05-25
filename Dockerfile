#FROM registry.xcmg.com:5000/nginx:1.13-alpine 
#MAINTAINER hanyun
#COPY dist /etc/nginx/micro_vue
#RUN chmod 777 /etc/nginx/micro_vue -R
#CMD [ "nginx", "-g", "daemon off;"]

FROM f00lisher/alpn-jre8-cst:jdk-8u212
VOLUME /tmp
WORKDIR /home
ADD target/*.jar app.jar
ENTRYPOINT exec java -server -Xms1024m -Xmx1024m -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar app.jar
