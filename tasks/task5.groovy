def isIp(string) {
	ValidIpAddressRegex = /([0-9]{1,3}[\.]){3}[0-9]{1,3}/
	return string ==~ ValidIpAddressRegex
}
return this
