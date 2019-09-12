import groovy.json.JsonSlurper
def call(file_name){
    return new JsonSlurper().parse(new File(file_name))
}