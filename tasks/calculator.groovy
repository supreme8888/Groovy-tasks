def intermediateValue(brac) {
  a = (int)brac[0] - 48
  op = brac[1]
  b = (int)brac[2] - 48
  
  switch(op) {
    case '-': return a - b; break
    case '+': return a + b; break
    case '*': return a * b; break
    case '/': return a.intdiv(b); break
  }
}

def exec(str) {
  brac = str.find(/\(([^)]*)\)/)
  brac_txt = brac

  if(brac) {
    brac = brac.split("")[1..-2]
    str = str.replace(brac_txt, (String)intermediateValue(brac))
  }
   
  str = (List)str.split("")

  for (i = 0; i < str.size(); i++) {
    switch(str[i]) {
      case '*':
        ind = str.indexOf('*')
        tmp = ((int)str[ind-1] - 48) * ((int)str[ind+1]-48)
        str[i] = (String)tmp
        str[ind-1] = 'del'
        str[ind+1] = 'del'
        i++
        break
      case '/':
        ind = str.indexOf('/')
        tmp = ((int)str[ind-1] - 48) / ((int)str[ind+1]-48)
        str[i] = (String)tmp
        str[ind-1] = 'del'
        str[ind+1] = 'del'
        i++
        break
    }
  }
   
  str -= ['del']
  
  for (i = 0; i < str.size(); i++) {
    switch(str[i]) {
      case '+':
        ind = str.indexOf('+')
        tmp = ((int)str[ind-1] - 48) + ((int)str[ind+1] - 48)
        str[i] = (String)tmp
        str[ind-1] = 'del'
        str[ind+1] = 'del'
        i++
        break
      case '-':
        ind = str.indexOf('-')
        tmp = ((int)str[ind-1] - 48) - ((int)str[ind+1] - 48)
        str[i] = (String)tmp
        str[ind-1] = 'del'
        str[ind+1] = 'del'
        i++
        break
    }
  }
    
  str -= ['del'] 
  result = str[0]
  return result
}

println(exec("1+9/3"))

return this