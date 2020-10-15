def encryptThis(s){
    new_string = s.split(" ")
    new_string =  new_string.collect {
        a = it[0]
        b = it[1]
        c = it[-1]
        d = it[2..-2]
        (int)a + c + d + b
    }
    return new_string.join(" ")
}

return this