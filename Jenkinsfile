pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo "hello"'
        sleep 60
      }
    }
    stage('Test') {
      steps {
        echo 'hello world'
      }
    }
    stage('Deploye') {
      steps {
        echo 'deployed'
      }
    }
  }
}