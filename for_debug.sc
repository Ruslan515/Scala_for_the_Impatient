val list_strings = Array("Tom", "Fred", "Harry")
val list_hash = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
list_strings.flatMap(n => list_hash.get(n))
