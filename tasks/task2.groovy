def mulEvenOdd(l) {
	return(l.collect{it%2 == 1 ? it*3 : it*2})
}

println(mulEvenOdd([4,5,6]))

return this
