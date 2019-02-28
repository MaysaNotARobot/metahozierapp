pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build(job: 'build', quietPeriod: 1)
      }
    }
    stage('Test') {
      steps {
        junit(testResults: 'test', allowEmptyResults: true)
      }
    }
  }
}