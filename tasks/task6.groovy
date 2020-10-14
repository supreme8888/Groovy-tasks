def adults(ppl) {
	ppl.findAll{ it.value >== 18 }
	return ppl 
}

println(adults([Ka: 24, Al: 16, Os: 18]))

return this
