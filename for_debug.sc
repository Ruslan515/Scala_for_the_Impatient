val buf = scala.collection.mutable.ListBuffer.empty[String]
buf += "aa"
buf += "bb"
buf += "cc"
buf += "tt"
buf += "zz"

val odd_buf = scala.collection.mutable.ListBuffer.empty[String]
0.until(buf.size, 2).foreach(i => odd_buf += buf(i))
println(odd_buf)

