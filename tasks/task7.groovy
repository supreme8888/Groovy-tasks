def encryptThis(str) {
        result = []

        listOfWords = str.split()
        listOfWords.collect {
                it = (List)it.split("")
                it[0] = (int)it[0]
                tmp = it[1]
                it[1] = it[-1]
                it[-1] = tmp
                result.add(it.join())
        }

        result = result.join(" ")
        return result
}

println(encryptThis("Hello world"))

return this