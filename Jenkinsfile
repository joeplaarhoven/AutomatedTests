pipeline {
  agent none
  stages {
    stage('Unit test') {
      steps{
        echo "Unit test"
      }
    }
    stage('API test') {
      agent { docker { image 'node:14-alpine' } }
      steps {
        sh 'npm install -g newman'
        sh 'npm install -g newman-reporter-htmlextra'
        sh 'newman run /var/jenkins_home/workspace/AutomatedTests_master/api_test/NopService.postman_collection.json --reporters=cli,htmlextra'
      }
    }
    stage('Performance test') {
      steps {
       echo "Performance test"
      }
    }
    stage('GUI test') {
      steps {
        echo "GUI test"
      }
    }
  }
}