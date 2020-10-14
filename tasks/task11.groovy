def String gstring(String variable1, int variable2) {
    str1 = "1() 2() 3()"
    array = str1.split(" ")
    array.eachWithIndex { it, index ->
        var = it.split("")
        if (var[0].toInteger() == variable2) {
            array[index] = var[0] + var[1] + variable1 + var[2]
        }
    }
    return(array.join(" "))
}

return this