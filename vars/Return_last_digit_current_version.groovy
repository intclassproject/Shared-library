def call(version){
    return sh(script: "echo $version | cut -d$dot -f3", returnStdout: true).trim()
}