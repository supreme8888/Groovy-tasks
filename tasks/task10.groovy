def urlText(url) {
    def test = new URL(url).text.trim()
    return test.toString()
}
return this
