def call(){
    withSonarQubeEnv('sonar-server'){
        sh ''' $sonar_home/bin/sonar-scanner -Dsonar.projectName=Youtube \n
        -Dsonar.projectKey=Youtube
        '''
    }
}