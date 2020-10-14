def mulEvenOdd(List list){
  def result = []
    list.each {
    (it%2) ? result << it*2 : result << it*3
    }
   return result

}

return this