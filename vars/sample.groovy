def function(){
    echo "this is a sample groovy script"
    
}
return this

// in jenkinsfile, we can add below steps to calal up this script
// def gv //this comes above pipeline
//create a stage to load this script // gv=load "sample.groovy"
//in a stage we can call this function like below
//gv.function()
