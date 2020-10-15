def adults(Map map){
def result = [:]
  for (i in map)
    if (i.value >= 18)
      result.put(i.key, i.value)
return result
}

return this