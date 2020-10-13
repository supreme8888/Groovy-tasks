def gstring(string, int n) {
    list = []
    for (i in 1..3) {
        i == n ? list.add("$i($string)") : list.add("$i()")
        }
    return list.join(' ')
}

return this
