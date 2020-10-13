def adults(def map) {
    newMap = [:]
    for (entry in map) {
        if (entry.value >= 18 ) {
            newMap.put(entry.key, entry.value)
        }
    }
    return newMap
}

return this
