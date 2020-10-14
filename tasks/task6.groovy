def adults(ppl) {
	return(ppl.findAll{ it.value >= 18 }) 
}

println(adults([Ka: 24, Al: 16, Os: 18]))

return this
