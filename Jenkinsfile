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
            jacoco(buildOverBuild: true)
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
        jacoco(buildOverBuild: true)
      }
    }
  }
}