pipeline {
  agent any
  stages {
    stage("Fix the permission issue") {
          agent any
          steps {
              sh '''#!/bin/bash
                      echo "Hello from bash"
                      echo "Who I'm $SHELL"
                  '''
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