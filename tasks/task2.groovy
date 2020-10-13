def mulEvenOdd(array) {
    for(int i = 0; i < array.size; i++){
        if(array[i] % 2 == 0) array[i] = array[i] * 2;
        else array[i] = array[i] * 3
    }
  return array
}
