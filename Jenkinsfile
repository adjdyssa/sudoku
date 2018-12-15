pipeline {
  agent any
  stages {
    stage('checkstyle') {
      parallel {
        stage('checkstyle') {
          steps {
            checkstyle(canComputeNew: true)
          }
        }
        stage('findbugs') {
          steps {
            findbugs()
          }
        }
      }
    }
    stage('cobertura') {
      steps {
        cobertura()
      }
    }
  }
}