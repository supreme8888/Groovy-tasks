
def urlText(str){
    def a = new URL(str)
    return a.text.trim().toString()
}

return this
