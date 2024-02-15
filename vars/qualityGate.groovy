def call(credentials){
    waitForQualityGate abortPipeline: false, credentialsId: credentials
}