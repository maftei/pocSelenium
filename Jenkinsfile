pipeline {
    agent any
    environment{
        PATH = "/opt/maven/apache-maven-3.8.6/bin:$PATH"

    }
    stages{
      stage("Git Clone"){
        steps{
            git credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/maftei/pocSelenium.git'
        }
    }

    stage("Maven Build"){
        steps{
            sh "mvn clean package  -DskipTests"
        }
    }

    stage("Create Docker Image"){
        steps{

        sh 'docker version'
        sh 'docker build -t selenium-docker-epay .'
        sh 'docker image list'
        sh 'docker tag selenium-docker-epay andrei4455/selenium-docker-epay:selenium-docker-epay'
        }
    }


    stage("Docker Login"){
        steps{
            withCredentials([string(credentialsId: 'DOCKER_HUB_PASSWORD', variable: 'PASSWORD')]) {
                sh 'docker login -u andrei4455 -p $PASSWORD'
            }
        }
    }

    stage("Push Image to Docker Hub"){
        steps{
            sh 'docker push  andrei4455/selenium-docker-epay:selenium-docker-epay'
        }
    }
    stage("Docker compose up"){
                steps{
                sh 'docker-compose up'
                }
            }
   }
  }