pipeline{
    agent any
    tools {
        maven 'maven3.8.2'
    }
    stages{
        stage('Build Maven'){
            steps {
                echo 'Building SpringBoot app using maven...'
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vengateshm/devops-springboot-sample']]])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps {
                echo 'Building Docker Image...'
                script {
                    bat 'docker build -t vengateshm13/devops-springboot-sample .'
                }
            }
        }
        stage('Push Image to Docker Hub'){
            steps {
                echo 'Pushing Docker Image to Docker Hub...'
                script {
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u vengateshm13 -p 13Ven@dockerhub!'
                    }
                    bat 'docker push vengateshm13/devops-springboot-sample'
                }
            }
        }
    }
}