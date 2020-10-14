import groovy.json.JsonSlurper
import groovy.json.JsonOutput


def parseAndFilterJson(str) {
     mapnew = [:]
	 def jsonSlurper = new JsonSlurper()
	 def object = jsonSlurper.parseText str
     object.each { key, value ->
     if (value %9 ==0){
     mapnew.put(key,value)
     newjson = JsonOutput.toJson(mapnew)
}
}
    return newjson
  
}
    return this