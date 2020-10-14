def encryptThis(s){
  r=[]
  for (w in s.split(' ').each{it})
  {
    l=w.length()
    new_w=((int) w[0] + w[l-1] + w[2..l-2] + w[1])
    r.add(new_w)
  }
  return(r.join(' '))


}
return this
