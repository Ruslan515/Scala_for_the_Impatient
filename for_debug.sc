val time_zone = java.util.TimeZone.getAvailableIDs()
time_zone.map(_.split("/")(0))
val s = time_zone.map(_.split("/")(0)).toList.groupBy(identity).mapValues(_.size)
s.maxBy(_._2)._1


