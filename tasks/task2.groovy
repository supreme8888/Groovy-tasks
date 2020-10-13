def mulEvenOdd(a) {
 a = a.collect { it % 2 == 0 ? it * 2 : it * 3 }
 return a
}
a=[1,2,3]
print (mulEvenOdd(a))