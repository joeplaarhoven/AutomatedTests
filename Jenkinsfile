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
      agent { docker { image 'katalonstudio/katalon' } }
      steps {
        sh 'katalonc  -projectPath="/var/jenkins_home/workspace/AutomatedTests_master/gui_test/DemoWebshopGUITest.prj" -browserType="Chrome" -testSuitePath="/var/jenkins_home/workspace/AutomatedTests_master/gui_test/GUI_Test_Suite" -apiKey="909a5194-ea06-4745-8a5e-59a676c786f3" '
      }
    }
  }
}