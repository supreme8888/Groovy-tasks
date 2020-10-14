def encryptThis(variable) {
    str = variable.split(' ')
    str.eachWithIndex { itstr, indexstr ->
        word = itstr.split("")
        length = word.length
        word.eachWithIndex { itword, indexword ->
            if (indexword == 0) {
                word[indexword] = (int)itword
            }
            else if (indexword == (word.length - 1)) {
              lastchar = word[indexword]
              word[indexword] = word[1]
              word[1] = lastchar
            }
        }
      print(word.join("") + " ")
    }
  println("")
  
}

return this