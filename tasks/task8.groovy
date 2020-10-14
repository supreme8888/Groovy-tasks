import groovy.json.JsonSlurper
def parseAndFilterJson(str){
   def object = new JsonSlurper().parseText(str)
   map = [:]
   object.each { 
       it.value % 9 == 0 ? map.put(it.key, it.value) : true
    }
   return groovy.json.JsonOutput.toJson(map).toString()
}

// println(parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}"))

return this
