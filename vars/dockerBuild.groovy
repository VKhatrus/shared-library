def call(String project, String hubUser) {
//def call() {
//    sh "docker image build -t ${hubUser}/${project}:beta-${env.BRANCH_NAME}-${env.BUILD_NUMBER} ."
    sh "docker image build -t ${hubUser}/${project}:${env.RELEASE_VERSION} \."
    withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    sh "docker image push ${hubUser}/${project}:${env.RELEASE_VERSION}"
}
