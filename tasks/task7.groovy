def encryptThis(string){
 str = ''
 a = string.split(' ')
  for (i in a){
    str += (int)i[0]+i[-1]+i[2..-2]+i[1]+' '
  }
 return (str)
}

return this