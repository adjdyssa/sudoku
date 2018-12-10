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
        stage('findbugs') {
          steps {
            findbugs(canComputeNew: true, canResolveRelativePaths: true)
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