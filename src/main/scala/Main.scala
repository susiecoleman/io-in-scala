import java.io.{File, PrintWriter}

import scala.io.Source

object Main {

  def main(args: Array[String]): Unit = {
//    FileRead.readLine("data.txt")
//    FileRead.readAll("data.txt")
//    FileRead.filterLine("data.txt", _ == "A")
//    FileWrite.writeFile("d.txt", "Hello")
  }

}

object FileRead {
  def readLine(fileName: String) = {
    val s1 = Source.fromFile(fileName).getLines
    s1.foreach(println)
  }

  def filterLine(fileName: String, filter: String => Boolean) = {
    val s1 = Source.fromFile(fileName).getLines
    s1.filter(filter).foreach(println)
  }

  def readAll(fileName: String) = {
    val s1 = Source.fromFile(fileName).mkString
    println(s1)
  }
}

object FileWrite {
  def writeFile(fileName: String, text: String) = {
    val writer = new PrintWriter(new File(fileName))
    writer.write(text)
    writer.close()
  }
}