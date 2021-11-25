pipeline {
  agent {
          docker { image 'node:14-alpine' }
      }
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        sh 'npm install -g newman'
        sh 'newman run api_test/NopService.postman_collection.json'
      }
    }

  }
}