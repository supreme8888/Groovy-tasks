def isIp(ip) {
	reg = /((\d{0,3}).(\d{0,3}).(\d{0,3}).(\d{0,3}))/
	return ip ==~ reg
}

println(isIp('10.2.3.123'))

return this
