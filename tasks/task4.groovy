def fib(k){
  i = 0
  j = 1
  posl = [i,j]
  while (i < k-1){ 
   posl+=(posl[i] + posl[j])
   i++
   j++
}
 return posl[k] 
}
return this
