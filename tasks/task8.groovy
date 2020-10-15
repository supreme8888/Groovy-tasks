import groovy.json.JsonSlurper
import groovy.json.JsonOutput

String parseAndFilterJson(String s){
def slurper = new JsonSlurper()
def temp = slurper.parseText(s)
def result = [:]
for ( i in temp)
  {
  if (!(i.value % 9))
     result.put(i.key, i.value)
}
return JsonOutput.toJson(result)
}

return this