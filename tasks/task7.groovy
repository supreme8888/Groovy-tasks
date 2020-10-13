def encryptThis(string) {
  string=string.trim()
  String[] str;
  str = string.split(' ');
  str = str.collect {
    fl = it[1]
    ll = it[it.length() - 1]
    it = (int) it[0] + ll + it.substring(2,it.length() - 1) + fl
    }
  String result = str.join(' ').trim()
  return result.toString()  
}

return this