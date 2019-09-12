def call(current_version, last_digit_current_version){
    sh(script: "echo $current_version | cut -d$dot -f1", returnStdout: true).trim() + dot + sh(script: "echo $current_version |cut -d$dot -f2", returnStdout: true).trim() + dot + (Integer.parseInt(last_digit_current_version) + 1)
}