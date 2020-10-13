def encryptThis(string) {
  String[] str;
  str = string.split(' ');
  str = str.collect {it = (int) it[0] + it.substring(1).reverse()}
  return str.join(" ").trim()
}

return this