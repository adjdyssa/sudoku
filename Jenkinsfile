pipeline {
  agent any
  stages {
    stage('checkstyle') {
      steps {
        checkstyle(canComputeNew: true)
      }
    }
    stage('cobertura') {
      steps {
        cobertura(autoUpdateHealth: true)
      }
    }
  }
}