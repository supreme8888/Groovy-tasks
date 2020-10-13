def gstring(string, int n) {
  res = [ "1()", "2()", "3()"]
  res[n-1] = "${n}(${string})"
  return res.join(" ").trim()
}

return this