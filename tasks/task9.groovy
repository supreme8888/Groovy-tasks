def exec(str) {
	 result = str.execute().text.toString()
	 return result.trim()
}

println(exec("date"))