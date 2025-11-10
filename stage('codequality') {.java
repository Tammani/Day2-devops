stage('codequality') {
    step {
        withsonarQubeEnv('sonarQube') {
            sh mvn sonar:sonar -Dsonar.projectKey=my_project_key -Dsonar.host.url=http://sonarqube.example.com -Dsonar.login=$SONARQUBE_TOKEN
        }
    }
}