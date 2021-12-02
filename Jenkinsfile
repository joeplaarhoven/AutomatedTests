pipeline {
  agent none
  stages {
    stage('Unit test') {
    agent { docker { image 'maven' } }
      steps{
        dir("/var/jenkins_home/workspace/AutomatedTests_master/unit_test"){
          sh 'mvn jacoco:report'
        }
      }
    }
    stage('API test') {
      agent { docker { image 'node:14-alpine' } }
      steps {
        dir("/var/jenkins_home/workspace/AutomatedTests_master/api_test"){
          sh 'npm install -g newman'
          sh 'npm install -g newman-reporter-htmlextra'
          sh 'newman run NopService.postman_collection.json --reporters=cli,htmlextra'
        }
      }
    }
    stage('Performance test') {
      steps {
       echo "Performance test"
      }
    }
    stage('GUI test') {
      steps {
        dir('/var/jenkins_home/workspace/AutomatedTests_master/gui_test'){
            sh 'docker run -t --rm -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -projectPath=DemoWebshopGUITest.prj'
        }
      }
    }
  }
}