def mulEvenOdd(variable) {
    variable.eachWithIndex { it, index ->
        if (it % 2 == 0) { 
            variable[index] = it * 2
        }
        else {
            variable[index] = it * 3
        }
    }
    return variable
}

return this
