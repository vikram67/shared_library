 def call(Map params) {
    def projectName = params.ProjectName
    def projectVersion = params.ProjectVersion

    // Your function logic here
    echo "Project Name: ${ProjectName}"
    echo "Project Version: ${ProjectVersion}"
    echo "Jenkins Account: ${JenkinsAccount.account}"
}
