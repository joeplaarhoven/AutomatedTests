pipeline {
  agent any
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        sh 'npm install newman'
        sh 'run api_test/NopService.postman_collection.json'
      }
    }
  }
}