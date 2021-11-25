pipeline {
  agent {
          docker { image 'node:14-alpine' }
      }
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        echo 'npm --version'
//         sh  'newman run /NopService.postman_collection.json'
      }
    }

  }
}