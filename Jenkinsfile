pipeline {
  agent any
  stages {
    stage("Fix the permission issue") {
          agent any
          steps {
              sh "sudo chown root:jenkins /run/docker.sock"
          }
      }
    stage('master') {
      steps {
        echo 'hello world'
        sh 'npm -g install newman'
        sh 'newman run /NopService.postman_collection.json'
      }
    }

  }
}