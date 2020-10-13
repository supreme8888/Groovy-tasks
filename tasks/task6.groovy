def adults(def map){
    def newmap = [:]
    for ( e in map ){
        if ( e.value >= 18 ){
            newmap << e
        }
    }
    return newmap
}
return this