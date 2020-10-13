// def urlText(string) {
//   return string.toURL().text
// }
def urlText(string) {
  string = "curl " + string
  string.execute().text.trim()
}

return this