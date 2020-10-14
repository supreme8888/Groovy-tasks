import groovy.json.JsonSlurper
def parseAndFilterJson(string) {
  def obj = new JsonSlurper().parseText(string)
  obj = obj.findAll{ it.value % 9 == 0}
  def builder = new groovy.json.JsonBuilder(obj)
  return builder.toString()
}

return this
