def urlText(str) {
	"curl $str".execute().text.trim()
}

println(urlText("http://httpstat.us/200"))

return this