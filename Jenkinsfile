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
//     stage('Performance test'){
//         agent { docker { image 'justb4/jmeter' } }
//         steps {
//             dir("/var/jenkins_home/workspace/AutomatedTests_master@3/performance_test"){
//                 sh 'jmeter -n -t Test_Plan.jmx -l jmeter.jtl'
//             }
//         }
//     }
    stage('Performance test') {
      agent { docker { image 'python' } }
      environment {
                  NLW_TOKEN = "c6f47a52a29cbf5372026818a51e560750f3ab533f57fa57"
                }
      steps {
        dir("/var/jenkins_home/workspace/AutomatedTests_master/performance_test"){
          sh 'mkdir neoload-cli && cd neoload-cli'
          git 'https://github.com/Neotys-Labs/neoload-cli'
          sh 'pip install neoload'
          sh 'neoload login $NLW_TOKEN'
          sh 'cd ..'
          sh 'neoload project -p performancetest.yaml upload performance-test'
          sh 'neoload run --scenario sanityScenario'
        }
      }
    }
    stage('GUI test') {
      agent { docker { image 'katalonstudio/katalon' } }
      steps {
//         sh '/opt/katalonstudio/configuration/resources/drivers/chromedriver_linux64/chromedriver --config -webui.autoUpdateDrivers=true'
        sh 'katalonc  -projectPath="${pwd}/gui_test/DemoWebshopGUITest.prj" -browserType="Chrome" -testSuitePath="GUI_Test_Suite" -apiKey="909a5194-ea06-4745-8a5e-59a676c786f3" '
      }
    }
  }
}
