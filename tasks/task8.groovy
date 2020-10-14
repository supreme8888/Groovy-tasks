import groovy.json.JsonOutput

def String parseAndFilterJson(variable) {
    def parser = new groovy.json.JsonSlurper()
    def parsedJSON = parser.parseText(variable)

    map = parsedJSON.findAll {
        int sum = 0
        x = it.value.toString().split("")
        x.each { value ->
            sum += value.toInteger()
        }
        sum == 9
    }
    return(JsonOutput.toJson(map))
}

return this