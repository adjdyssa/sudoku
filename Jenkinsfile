pipeline {
  agent any
  stages {
    stage('checkstyle') {
      parallel {
        stage('checkstyle') {
          steps {
            checkstyle(canComputeNew: true, canResolveRelativePaths: true)
          }
        }
        stage('findbugs') {
          steps {
            findbugs()
          }
        }
      }
    }
    stage('coverage') {
      steps {
        jacoco(buildOverBuild: true)
      }
    }
  }
}