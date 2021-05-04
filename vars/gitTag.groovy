#!/usr/bin/groovy
def call(body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    //body()
    echo "\u001B[32mINFO: Publishing...\u001B[m"
    body()
    echo "\u001B[32mINFO: End Publish...\u001B[m"

//    sh "git config user.email vitaliy.khatrus@ardas.biz"
//    sh "git config user.name Vitaliy Khatrus"

//    sh "git tag -fa v${config.releaseVersion} -m 'Release version ${config.releaseVersion}'"
//    sh "git push origin v${config.releaseVersion}"
}
