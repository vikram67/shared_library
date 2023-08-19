def call(Map params) {
    def projectName = params.ProjectName
    def projectVersion = params.ProjectVersion
    def jenkinsAccount = params.JenkinsAccount

    echo "Project Name: ${projectName}"
    echo "Project Version: ${projectVersion}"
    echo "Jenkins Account: ${jenkinsAccount}"
}
