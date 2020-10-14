def exec(string){
    def proc = string.execute()
    return proc.text.trim()
}
return this