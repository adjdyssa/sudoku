pipeline {
  agent any
  stages {
    stage('chechstyle') {
      steps {
        checkstyle(canComputeNew: true)
      }
    }
    stage('testcobertura') {
      parallel {
        stage('testcobertura') {
          steps {
            cobertura()
          }
        }
        stage('') {
          steps {
            findbugs(canComputeNew: true)
          }
        }
      }
    }
    stage('error') {
      steps {
        publishCoverage(failNoReports: true)
      }
    }
  }
}