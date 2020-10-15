def gstring(intr, int n) {
  str = "1() 2() 3()"
  String d = Integer.toString(n)
  k = (str.indexOf(d))
  a = str.split("")
  a[k+1]="("+intr.toString()
  return(a.join(''))
}
return this