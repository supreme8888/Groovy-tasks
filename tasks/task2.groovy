def mulEvenOdd(l) {
	def res = []
	l.each {
		if(it%2 == 1)
			res.add(it*3)
		else
			res.add(it*2)
	}
	return res
}

println(mulEvenOdd([4,5,6]))

return this
