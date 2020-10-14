def gstring(string, int n) {
  n = n -1
  new_dict = [ "1()", "2()", "3()"]
  new_dict[n] = "${n}(${string})"
  return new_dict.join("")
}
return this
