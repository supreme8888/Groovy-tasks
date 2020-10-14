def gstring(string, int n){
    template = ["1()","2()","3()"]
    for (int i=0; i<template.size(); i++){
        if (template[i] == "$n()"){
            template[i] = "$n($string)"
        }   
    }
    return template.join(" ").trim()
}
return this