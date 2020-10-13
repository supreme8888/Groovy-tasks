def encryptThis(string) {
  string=string.trim()
  String[] str;
  str = string.split(' ');
  str = str.collect {
    fl = it.substring(1, 2)
    ll = it.substring(it.length() - 1)
    it = (int) it[0] + ll + it.substring(2,it.length() - 1) + fl
    }
  String result = str.join(' ').trim()
  return result.toString()  
}

return this