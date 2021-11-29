pipeline {
  agent {
          docker { image 'node:14-alpine' }
      }
  stages {
//     stage('Unit test') {
//     junit 'test-results.xml'
//     }
    stage('API test') {
      steps {
        sh 'npm install -g newman'
        sh 'npm install -g newman-reporter-htmlextra'
        sh 'newman run /var/jenkins_home/workspace/AutomatedTests_master/api_test/NopService.postman_collection.json --reporters=cli,htmlextra'
      }
    }
//     stage('Performance test') {
//           steps {
//             sh 'npm install -g newman'
//             sh 'npm install -g newman-reporter-htmlextra'
//             sh 'newman run /var/jenkins_home/workspace/AutomatedTests_master/api_test/NopService.postman_collection.json --reporters=htmlextra'
//           }
//         }
  }
}