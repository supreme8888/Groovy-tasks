def adults(data){
    return data.findAll { it.value >= 18 }
}
// println(adults([Kate: 24, Alan:16, Osvald: 18]))
return this