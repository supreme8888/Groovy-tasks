import groovy.json.JsonSlurper
def parseAndFilterJson(string) {
  def newstring = new JsonSlurper().parseText(string)
  def result = new groovy.json.JsonBuilder(newstring = newstring.findAll{ it.value % 9 == 0})
  return result.toString()
}
return this
