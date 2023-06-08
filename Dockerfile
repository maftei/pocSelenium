FROM openjdk:11-jre

#WORKIDIR
WORKDIR /usr/share/epay
########################
ADD target/selenium-docker.jar          selenium-docker.jar
ADD target/selenium-docker-tests.jar    selenium-docker-tests.jar
ADD target/libs                          libs
#
ADD search-module.xml   search-module.xml
ADD transferpage.xml    transferpage.xml
#
#ENTRYPOINT ["java", "-cp", "selenium-docker.jar:selenium-docker-tests.jar:libs/*", "-DBROWSER=$BROWSER  -DHUB_HOST=$HUB_HOST org.testng.TestNG $MODULE"]
ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* -DBROWSER=$BROWSER  -DHUB_HOST=$HUB_HOST org.testng.TestNG $MODULE