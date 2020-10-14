import groovy.json.JsonSlurper
def parseAndFilterJson(string){
    def result = (new groovy.json.JsonSlurper().parseText(string))
    return (new groovy.json.JsonBuilder(result.findAll{it.value % 9 == 0}).toString())
}
return this