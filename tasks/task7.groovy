def encryptThis(string){
    vs = string.split(" ")
    vs = vs.collect {
        a = it[0]
        b = it[1]
        c = it[-1]
        d = it[2..-2]
        (int)a + b + c + d
    }
    return vs.join(" ")
}

//println(encryptThis("Hello world"))
//println(a)
//println(b)
//println(c)
//println(d)

return this


