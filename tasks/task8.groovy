import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def parseAndFilterJson(str) {
	println(str)
	def jsonSlurper = new JsonSlurper()
	def object = jsonSlurper.parseText str
	object = object.findAll{ it.value % 9 == 0 }
	jsonObj = JsonOutput.toJson(object)
	
return jsonObj

}

#println(parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}"))

return this
