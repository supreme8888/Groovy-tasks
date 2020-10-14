import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(j)
{

  def jsonSlurper = new JsonSlurper()
  def object = jsonSlurper.parseText(j)
  new_j=object.findAll{it.value % 9 == 0}
  def output = JsonOutput.toJson(new_j)
  return(output)

}

return this
