pipeline {
  agent any
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        sh '''#!/bin/bash
        apt update && apt install -y nodejs
        '''
        sh 'curl -O -L https://npmjs.org/install.sh'
        sh 'sh install.sh'
        sh 'npm install newman'
        sh 'run api_test/NopService.postman_collection.json'
      }
    }
  }
}