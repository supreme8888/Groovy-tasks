def isIp(ip) {
	ip = ip.split('\\.', -1)
	new_ip = (List)ip
	if(new_ip.size == 4)
		return true
	else
		return false

}

println(isIp('10.2.3.123'))

return this

