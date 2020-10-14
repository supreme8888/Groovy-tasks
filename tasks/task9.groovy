def exec(l)
{
def sout = new StringBuilder()
 def proc = "$l".execute()
return((proc.text).trim())
}

return this
