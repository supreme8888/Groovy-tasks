import groovy.json.*

def parseAndFilterJson(string) {
    newMap = [:]
    def jsonSlurper = new JsonSlurper()
    def object = jsonSlurper.parseText(string)
    for (entry in object) {
        String str = String.valueOf(entry.value)
        int a = Integer.parseInt(str[0])
        int b = Integer.parseInt(str[1])
        if (a + b == 9 ) {
            newMap.put(entry.key, entry.value)
        }
    }
    def json = JsonOutput.toJson(newMap).toString()
}

return this
