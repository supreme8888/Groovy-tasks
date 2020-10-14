def gstring(str, pos) {
	switch(pos) { 
    case 1: 
    return "1($str) 2() 3()"
    case 2:
    return "1() 2($str) 3()"
    case 3: 
    return "1() 2() 3($str)"
    default:
    "Please, choose a position from 1..3"
} 
}

println(gstring("test", 2))

return this