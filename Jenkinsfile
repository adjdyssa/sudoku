pipeline {
  agent any
  stages {
    stage('') {
      steps {
        checkstyle(canComputeNew: true)
      }
    }
    stage('testcobertura') {
      steps {
        cobertura(autoUpdateHealth: true)
      }
    }
  }
}