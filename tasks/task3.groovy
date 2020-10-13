def isSublist(list, sublist) {
  sublist.every { list.contains(it) }
}

return this