String gstring(String s, int n){
  def result = "1() 2() 3()"
  def list = result.split(" ")
  list[n-1] = "$n($s)".toString()
return list.join(" ").trim()

}

return this