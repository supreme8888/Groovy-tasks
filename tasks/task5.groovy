def isIp(ip) {
        ip = ip.split('\\.', -1)
	String new_ip = ip
        if(Eval.me(new_ip).size == 4)
                return true
        else
                return false

}

println(isIp('10.2.3.123'))

return this

