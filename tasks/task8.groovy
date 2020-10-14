import groovy.json.JsonSlurper

def parseAndFilterJson(j)
{

  def jsonSlurper = new JsonSlurper()
  def object = jsonSlurper.parseText(j)
  return(object.findAll{it.value % 9 == 0})

}

return this
