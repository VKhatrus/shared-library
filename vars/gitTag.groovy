#!/usr/bin/groovy
def call(config, body) {
    // evaluate the body block, and collect configuration into the object
    //def config = [:]
    body.delegate = config
    body.resolveStrategy = Closure.DELEGATE_FIRST
    //body()
    echo "\u001B[32mINFO: Publishing...\u001B[m"
    body()
    echo "\u001B[32mINFO: End Publish...\u001B[m"

   // In the bar DSL element
 //   echo 'I am bar'

    // Expecting a script element as a closure. The insanceof needs script approvals
    //assert config.script != null, 'A script element was not supplied'
    //assert config.script instanceof Closure, 'The script element supplied must be a closure'

    // Call the script closure
//    config.script.delegate = this
//    config.script.resolveStrategy = Closure.DELEGATE_FIRST
//    def result = config.script.call()

    // Returning the script result
//    return result

//    sh "git config user.email vitaliy.khatrus@ardas.biz"
//    sh "git config user.name Vitaliy Khatrus"

//    sh "git tag -fa v${config.releaseVersion} -m 'Release version ${config.releaseVersion}'"
//    sh "git push origin v${config.releaseVersion}"
      sh "echo ${config.releaseVersion}"
}
