def encryptThis(string){
    string = string.split(" ")
    def finalres = " "
        for (i in string)
        { finalres = finalres + (int)i[0] + i[-1] + i[2..-2] + i[1] + " "} 
    return finalres
}
return this
