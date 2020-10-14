def urlText(string) {
    def get = new URL(string).text
    def resoult = get.trim().toString()
    return resoult
}
return this
