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
        cobertura(autoUpdateHealth: true, autoUpdateStability: true, coberturaReportFile: 'Cobertura xml')
      }
    }
    stage('error') {
      steps {
        publishCoverage(failNoReports: true)
      }
    }
  }
}