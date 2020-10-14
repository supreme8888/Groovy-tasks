def gstring(s, int n)
{
 def_s="1() 2() 3()"
 StringBuffer sb = new StringBuffer(def_s);

 poin=def_s.indexOf("$n")
 new_st=sb.insert(poin+2,"$s")
 t="$new_st"
 return(t.trim())

}
return this
