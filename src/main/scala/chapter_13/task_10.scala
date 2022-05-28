/*
Метод java.util.TimeZone.getAvailableIDs возвращает часовые
пояса, такие как Africa/Cairo и Asia/Chungking. На каком кон-
тиненте больше всего часовых поясов? Подсказка: groupBy
 */
package chapter_13

object task_10 extends App {
    val time_zone = java.util.TimeZone.getAvailableIDs()
    val ans = (
        time_zone
            .map(_.split("/")(0))
            .toList
            .groupBy(identity)
            .mapValues(_.size)
        ).maxBy(_._2)._1
    println(ans)
}
