def mulEvenOdd(array) {
	array = array.collect { it % 2 == 0 ? it * 2 : it * 3 }
  	return array
}

return this