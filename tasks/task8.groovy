import groovy.json.JsonSlurper

def parseAndFilterJson(string) {
  def jsonSlurper = new JsonSlurper().parseText(string)
  def JsonBuilder = new groovy.json.JsonBuilder(string) 
  parseJson = JsonBuilder(jsonSlurper.findAll{ it.value % 9 == 0 })
  return parseJson.toString()
}

return this