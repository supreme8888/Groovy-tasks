def gstring(string, int number) {
  defaultString = "1() 2() 3()"
  array = defaultString.split(" ")
  array[number - 1] = "$number($string)".toString()
  return array.join(" ").trim()
}

return this