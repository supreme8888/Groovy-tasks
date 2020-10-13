def main(def someList) {
    newList = []
    for (int i in someList) {
        result = i % 2 == 0 ? i * 2 : i * 3
        newList.add(result)
    }
    return newList
}

return this
