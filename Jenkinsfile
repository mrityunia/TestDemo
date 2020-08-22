//http://localhost:8080/env-vars.html/ to get env variable

CODE_CHANGES=gitCodeChanges()
pipeline {
   agent any
parameters{
    string(name: 'ORGNAME', defaultValue: 'Testing',description: 'this to select Org Details')
    choice(name : 'Version', choices:['1.12.0', '1.12.2', '1.12.3'],description: 'This is to select the choice value')
}
tools{
maven 'maven 3.6.3'

}
   when{
      expression{
      CODE_CHANGES==true
      }
   }
   stages {
        stage('Clean') {
         steps {
            echo 'Hello Clean'
            echo 'Code is changed'
            echo "ORG name os ${params.ORGNAME}"
         }
      }
      when{
         expression{
        CODE_CHANGES!=true
         }
      }
      stage('Code Not changes'){
         steps{
         echo 'Code does not changed'
         }
      }
      
      stage('Build') {
      when{
      expression{
      params.ORGNAME !='Testing' || params.Version != '1.12.2'      
                }
        }
        steps {
             echo 'Hello Build only when the org name is not Testing'
             echo "ORG name os ${params.Version}"
             echo "Veriosn  ${params.Version}"
         }
      }
      stage('Deploy') {
         steps {
            echo 'Hello Deploy'
            echo "ORG name os ${params.Version}"
            sh "mvn -version"
         }
      }
   }
   post{
   always{
   echo 'Always Excute erespective of failure startus'
   echo "Current build number is ${env.BUILD_NUMBER}"
   
   }
   success{
   echo 'Execute only when builds pass'
   
   }
   failure{
   echo 'Execute only when builds fail'
   
   }
   }
}
