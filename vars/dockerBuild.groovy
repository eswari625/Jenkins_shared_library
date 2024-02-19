def call(String userName, String imageName){
    sh 'docker build -t ${imageName} .'
    sh 'docker tag ${imageName} ${userName}/${imageName}:latest'
    withDockerRegistry([url:'https://index.docker.io/v1/', credentialsId:'docker']){
        sh 'docker push ${userName}/${imageName}:latest'
    }
}