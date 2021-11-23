pipeline {
  agent any
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        sh 'npm install newman'
        sh 'newman run /NopService.postman_collection.json'
      }
    }
  }
}