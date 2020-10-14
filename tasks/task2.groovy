def mulEvenOdd(l) {
	return(l.collect {
		if(it%2 == 1)
			it*3
		else
			it*2
	})
}

println(mulEvenOdd([4,5,6]))

return this
