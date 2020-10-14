def adults(a)
{
  b=[:]
  a.each{key, value ->
    value > 17 ? b.put(key,value) : value

  }

  return "$b"
}

return this
