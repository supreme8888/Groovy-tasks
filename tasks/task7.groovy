def encryptThis(string) {
  string=string.trim()
  String[] str;
  str = string.split(' ');
  str = str.collect {it = (int) it[0] + it.substring(1).reverse()}
  String result = str.join(" ").trim()
  return result.toString()  
}

return this