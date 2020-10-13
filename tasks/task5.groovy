def isIp(string) {
	ipregex = /(\d{0,3}).(\d{0,3}).(\d{0,3}).(\d{0,3})/
	return string ==~ ipregex
}

return this