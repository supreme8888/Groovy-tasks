def encryptThis(string) {
    newString = ''
    for (element in string.split(' ')) {
        newString += (int)element[0] + element[-1] + element[2..-2] + element[1] + ' '
    }
    return newString.trim()
}

return this
