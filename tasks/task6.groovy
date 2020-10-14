def adults(map){
  mapnew = [:]
  map.each { key, value ->
     if (value >= 18){
     mapnew.put(key,value)
}
}
return mapnew
}
return this