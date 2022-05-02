/*
Напишите фрагмент кода на Scala, который читает файл и вы-
водит в консоль все слова, содержащие 12 или более символов.
Дополнительные баллы начисляются тем, кто сможет сделать
это в одной строке кода.
 */
package chapter_09
import scala.io.Source

object task_03 extends App {
    val file_name = "src/main/scala/chapter_09/for_03.txt"
    val source = Source.fromFile(file_name)
    val tokens = source.mkString.split("\\s+")
    for (word <- tokens if (word.length >= 12)) println(word)

    println("=============================================")

//    val source1 = Source.fromFile(file_name)
    for (word <- Source.fromFile(file_name).mkString.split("\\s+") if (word.length >= 12)) println(word)

    println("=============================================")
//    val source2 = Source.fromFile(file_name)
//    println(source2.mkString)
//    val pattern = "\\S{12,}".r
//    for (matchS <- pattern.findAllIn(source2.mkString)) println(matchS)


}
