def encryptThis(string){
    array = string.split(" ")
    newstring = ""
    for (e in array){
        newstring = newstring + ((int)e[0]) + e[-1] + e[2..-2] + e[1] + " "
    }
    return newstring
}
return this