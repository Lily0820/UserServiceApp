pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/lily0820/UserServiceApp.git'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}
