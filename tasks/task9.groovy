def exec(string){
    def command_exec = ""
    command_exec = string.execute()
    string = command_exec.text.trim()
    return string
}
return this
