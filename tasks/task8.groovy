import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(str) {
	println(str)
	def jsonSlurper = new JsonSlurper()
	def object = jsonSlurper.parseText str
	object = object.findAll{ it.value % 9 == 0 }

	jsonObject = JsonOutput.toJson(object)

	return jsonObject
}

println(parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}"))

return this
