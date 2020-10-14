def gstring(s, n)
{
 def_s="1() 2() 3()"
 new_st=def_s.split(" ")

  new_st[n-1]="$n($s)".toString()
  return new_st.join(" ").trim()

}
return this
