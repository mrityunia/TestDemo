//http://localhost:8080/env-vars.html/ to get env variable

pipeline {
   agent any
     
parameters{
    string(name: 'ORGNAME', defaultValue: 'Testing',description: 'this to select Org Details')
    choice(name : 'Version', choices:['1.12.0', '1.12.2', '1.12.3'],description: 'This is to select the choice value')
}
   environment {
   CODE_CHANGES=true
   }
tools{
maven 'maven 3.6.3'

}
   
   stages {
        stage('Clean') {
           when{
      expression{
      CODE_CHANGES==true
         echo 'Chnages happened'
      }
   }
         steps {
            echo 'Hello Clean'
            echo 'Code is changed'
            echo "ORG name os ${params.ORGNAME}"
         }
      }
      
      stage('Code Not changes'){
         when{
         expression{
        CODE_CHANGES!=true
         }
      }
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
      stage('parallel steps'){
      steps{
         parallel(
            a:{
            echo 'Parallel steps a'
            },
            b:{
            echo 'parallel steps b'
            }
         
         )
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
   echo 'Execute only when builds fail.'
   
   }
   }
}
