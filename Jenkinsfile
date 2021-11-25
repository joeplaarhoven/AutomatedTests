pipeline {
  agent {
          docker { image 'node:14-alpine' }
      }
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        sh 'pwd'
        sh 'npm install newman'
        sh 'newman run /var/jenkins_home/workspace/AutomatedTests_master/api_test/NopService.postman_collection.json'
      }
    }

  }
}