def encryptThis(string) {
      arr = string.split(" ")
      arr = arr.collect {
          a = it[0]
          b = it[1]
          c = it[-1]
          d = it[2..-2]
          (int)a + c + d + b
    }

    return arr.join(" ")
}

return this
