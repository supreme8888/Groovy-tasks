def gstring(string, int n) {
  res = [ "1()", "2()", "3()"]
  for (i = 0; i < 2; i++) {
    if(i == n - 1) {
      res[i] = "${n}(${string})"
    }
  }
  return res.join(" ")
}

return this