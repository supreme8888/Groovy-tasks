def exec(str) {
	 return str.execute().text.trim()
}

println(exec("date"))