def mulEvenOdd(list) {
    for (int i=0; i<list.size(); i++) {
	    if(list[i] % 2 == 0) {
            list[i] = list[i]*2;
        } 
        else {
            list[i] = list[i]*3;
        }
    }
    return list
}
return this