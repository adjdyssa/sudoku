pipeline {
  agent any
  stages {
    stage('chechstyle') {
      steps {
        checkstyle(canComputeNew: true)
      }
    }
    stage('testcobertura') {
      steps {
        cobertura(coberturaReportFile: 'index.html')
      }
    }
    stage('error') {
      steps {
        publishCoverage(failNoReports: true)
      }
    }
  }
}