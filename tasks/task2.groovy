def mulEvenOdd(myarray) {
    myarray = myarray.collect {
        it % 2 == 0 ? it * 2 : it * 3
    }
    return myarray
}

return this