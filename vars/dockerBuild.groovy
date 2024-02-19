def call(String userName, String imageName){
    sh 'docker build --build-arg api_key=da434dafe9msh324fa2fbe65c8d8p116d2djsnfda8f3de11af -t ${imageName} .'
    sh 'docker tag ${imageName} ${userName}/${imageName}:latest'
    withDockerRegistry([url:'https://index.docker.io/v1/', credentialsId:'docker']){
        sh 'docker push ${userName}/${imageName}:latest'
    }
}