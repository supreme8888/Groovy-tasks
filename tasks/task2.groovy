def mulEvenOdd(l) {
	return(l.collect { it%2 == 0 ? it*2 : it*3 })
}

println(mulEvenOdd([4,5,6]))

return this
