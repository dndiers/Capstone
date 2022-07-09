# FROM specifying the tomcat image source version
FROM tomcat:10-jre11-temurin-focal

LABEL maintainer=danielle.diers@gmail.com

# Populate tomcat default location with WebApp
COPY ./RetailWebApp/target/ /usr/local/tomcat/webapps

# EXPOSE tomcat port 8080
EXPOSE 8080