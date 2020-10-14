def adults(Map map){
map.retainAll{it -> it.value >= 18}
return map
}

return this