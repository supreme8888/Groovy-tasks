def encryptThis(str) {
        result = ''
        listOfWords = str.split()
        listOfWords.collect {
                first = (int)it[0]
                last = it[1]
                second = it[-1]
                others = it[2..-2]
                result += first + second + others + last + ' '
        }

        return result.trim()
}

println(encryptThis("Hello world"))

return this