def encryptThis(string){
    nextString = " "
    for (i in string.split(" ")) {
        nextString += (int)i[0] + i[-1] + i[2..-2] + i[1] + " "
    }
    return nextString.trim()
}

return this
