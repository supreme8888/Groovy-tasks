def fib(int n) {
	int count = 3
	int tmp = 0
	int crnt = 1
	int nxt = 1
	if(n == 1 || n == 2)
		return 1
	else { 
		while(count <= n) {
			tmp = nxt
			nxt += crnt
			crnt = tmp	
			count++ 
		}
		return nxt
	}
}

println(fib(4))

return this
