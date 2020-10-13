  def mulEvenOdd(my_list){
      	
      for(int i in my_list) {
         List res_list = []
         my_res = i % 2 == 0 ? i* 2 : i * 3
         res_list << my_res
      }
	return(res_list)	
   }

return this
