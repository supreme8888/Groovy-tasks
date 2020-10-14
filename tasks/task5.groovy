def isIp(string) {
	ip = /^([1-9]{1,3})\.([0-9]{1,3})\.([0-9]{1,3})\.([0-9]{1,3})$/
	return string ==~ ip
}

return this