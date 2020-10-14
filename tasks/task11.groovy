def gstring(string, int n) {
  str = "1() 2() 3()"
  list = str.split(" ")
  def a = "$n($string)"
  list[n-1] = a.toString()
  return list.join(" ").trim()
}

// println(gstring("aaa",3))
return this
