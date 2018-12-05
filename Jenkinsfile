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
        cobertura(autoUpdateHealth: true, autoUpdateStability: true, lineCoverageTargets: 'info', fileCoverageTargets: 'info', zoomCoverageChart: true)
      }
    }
  }
}