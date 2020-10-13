import groovy.json.JsonSlurper
def parseAndFilterJson(string) {
  jsonSlurper = new JsonSlurper()
  def obj = jsonSlurper.parseText(string)
  obj = obj.findAll{ it.value % 9 == 0}
  def builder = new groovy.json.JsonBuilder(obj)
  return builder
}

return this