var t = Map("h" -> 42, "m" -> 33)

t = t.updated("s", 15)
println(t("s"))
