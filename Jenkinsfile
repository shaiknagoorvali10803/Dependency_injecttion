pipeline {
  agent any
  stages {
    stage('TEST') {
      steps {
        sh 'mvn clean install'
        build 'mvn clean install'
      }
    }

  }
}