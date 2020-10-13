def mulEvenOdd(data) {
    data = data.collect {
        if (it % 2 == 0){
            it * 2
        }
        else {
            it * 3
        }
    }
  	return data
}
println (mulEvenOdd([1, 2, 4, 5]))
return this