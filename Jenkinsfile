pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        bat 'mvn test'
      }
    }

    stage('TEST') {
      steps {
        bat 'mvn clean install'
      }
    }

  }
}