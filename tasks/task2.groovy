def mulEvenOdd(List list){
  def result = []
  for (i in list)
  {
    if (i%2 == 0)
       result << i*2;
    if (i%2 == 1)
       result << i*3;
    }
   return result

}
return this