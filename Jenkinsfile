pipeline {
  agent any
  stages {
    stage('chechstyle') {
      steps {
        checkstyle(canComputeNew: true)
      }
    }
    stage('findbugs') {
      steps {
        findbugs(canComputeNew: true, canResolveRelativePaths: true)
      }
    }
    stage('rapport cobertura') {
      steps {
        jacoco(buildOverBuild: true)
      }
    }
  }
}