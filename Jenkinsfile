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

    stage('DEPLOYMENT') {
      parallel {
        stage('DEPLOYMENT') {
          steps {
            git(url: 'https://github.com/shaiknagoorvali10803/JenkinsPipelineDemoProject.git', branch: 'master')
          }
        }

        stage('build') {
          steps {
            bat 'mvn test'
          }
        }

      }
    }

  }
}