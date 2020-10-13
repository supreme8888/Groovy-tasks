def encryptThis(str) {
	result = []

	listOfWords = (List)str.split()

	listOfChar = listOfWords.each {
        	it = (List)it.split('')
        	it[0] = (int)it[0]
        	tmp = it[1]
        	it[1] = it[-1]
        	it[-1] = tmp
        	it_j = it.join()
        	result.add(it_j)
	        }

	result = result.join(' ')
}

println(encryptThis("Hello world"))

return this
