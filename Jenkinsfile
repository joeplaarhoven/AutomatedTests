pipeline {
  agent any
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        sh  'newman run /NopService.postman_collection.json'
      }
    }

  }
}