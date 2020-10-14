import groovy.json.JsonSlurper

def parseAndFilterJson(string) {
  def jsonSlurper = new JsonSlurper().parseText(string)
  jsonSlurper = jsonSlurper.findAll{ it.value % 9 == 0 }
  def parseJson = new groovy.json.JsonBuilder(jsonSlurper)
  return parseJson.toString()
}

return this