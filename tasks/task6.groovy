def adults(ppl) {
	return(ppl.findAll{ it.value >= 18 }) 
}

println(adults([Kate: 24, Alan: 16, Osvald: 18]))

return this
