def urlText(str){
    def a = new URL(str)
    return a.text.trim().toString()
}

// println(urlText("http://google.com/"))
return this