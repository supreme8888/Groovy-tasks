def urlText(string) {
    curlURL = "curl " + string
    curlURL.execute().text.trim()
}

return this