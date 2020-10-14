def mulEvenOdd(list){
  list1 = []
  list.each{
    if (it%2==0){it=it*2}
    else{it=it*3}
    list1+=[it]
    }
  return list1
}
return this
