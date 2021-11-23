pipeline {
  agent any
  stages {
    stage('master') {
      steps {
        echo 'hello world'
        sh '''#!/bin/bash
                  echo "Hello from bash"
                  echo "Who I'm $SHELL"
                  npm -g install newman
                  newman run /NopService.postman_collection.json
              '''
      }
    }

  }
}