pipeline {
  agent none
  stages {
//     stage('Unit test') {
//     agent { docker { image 'maven' } }
//       steps{
//         dir("${pwd}/unit_test"){
//           echo pwd()
//           sh 'mvn jacoco:report'
//         }
//       }
//     }
//     stage('API test') {
//       agent { docker { image 'node:14-alpine' } }
//       steps {
//         dir("${pwd}/api_test"){
//           sh 'npm install -g newman'
//           sh 'npm install -g newman-reporter-htmlextra'
//           sh 'newman run NopService.postman_collection.json --reporters=cli,htmlextra'
//         }
//       }
//     }
    stage('Performance test') {
      agent { docker { image 'python' } }
      environment {
                  NLW_TOKEN = "0c9c7b4c0f77a56f08a931e2346a6319cc5af0d7921f8e65"
                }
      steps {
        dir("/var/jenkins_home/workspace/AutomatedTests_master@2/performance_test"){
          sh 'mkdir neoload-cli && cd neoload-cli'
          git 'https://github.com/Neotys-Labs/neoload-cli'
          sh 'pip install neoload'
          sh 'neoload login $NLW_TOKEN'
          sh 'cd ..'
          sh 'neoload project -p performancetest.yaml upload performance-test'
          withDockerContainer(args: '-p 7100:7100 -e NEOLOADWEB_TOKEN=$NLW_TOKEN -e ZONE=Uy1ss -e LG_PORT=7100', image: 'neotys/neoload-loadgenerator') {
              // some block
          }
          sh 'neoload run --scenario sanityScenario'
//           neoloadRun project: '/var/jenkins_home/workspace/AutomatedTests_master@2/performance_test/Tricentis.nlp', displayGui: 'true', scenario: 'sanityScenario', trendGraphs: ['AvgResponseTime', 'ErrorRate']
        }
      }
    }
    stage('GUI test') {
      agent { docker { image 'katalonstudio/katalon' } }
      steps {
        sh '/opt/katalonstudio/configuration/resources/drivers/chromedriver_linux64/chromedriver --config -webui.autoUpdateDrivers=true'
        sh 'katalonc  -projectPath="${pwd}/gui_test/DemoWebshopGUITest.prj" -browserType="Chrome" -testSuitePath="GUI_Test_Suite" -apiKey="909a5194-ea06-4745-8a5e-59a676c786f3" '
      }
    }
  }
}