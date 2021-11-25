pipeline {
  agent {
          docker { image 'node:14-alpine' }
      }
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        sh 'npm install newman'
        sh  'newman run /NopService.postman_collection.json'
      }
    }

  }
}