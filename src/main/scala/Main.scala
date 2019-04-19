import java.io.{File, PrintWriter}

import scala.io.Source

object Main {

  def main(args: Array[String]): Unit = {
    //    FileRead.readLine("files/data.txt")
    //    FileRead.readAll("files/data.txt")
    //    FileRead.filterLine("files/data.txt", _ == "A")
    //    FileRead.take("files/data.txt", 2)
    //    FileRead.slice("files/data.txt", 1, 2)

    //    FileWrite.writeFile("d.txt", "Hello")
  }

}

object FileRead {
  def readLine(fileName: String) = {
    val source = Source.fromFile(fileName)
    source.getLines.toList.map(println)
    source.close
  }

  def filterLine(fileName: String, filter: String => Boolean) = {
    val source = Source.fromFile(fileName)
    source.getLines.toList.filter(filter).foreach(println)
    source.close()
  }

  def readAll(fileName: String) = {
    val source = Source.fromFile(fileName)
    println(source.mkString)
    source.close()
  }

  def take(fileName: String, numOfLines: Int) = {
    val source = Source.fromFile(fileName)
    val iterator = source.getLines().take(numOfLines)
    while (iterator.hasNext) {
      println(iterator.next())
    }
    source.close()
  }

  def slice(fileName: String, from: Int, until: Int) = {
    val source = Source.fromFile(fileName)
    val iterator = source.getLines().slice(from, until)
    while (iterator.hasNext) {
      println(iterator.next())
    }
    source.close()
  }
}

object FileWrite {
  def writeFile(fileName: String, text: String) = {
    val writer = new PrintWriter(new File(fileName))
    writer.write(text)
    writer.close()
  }
}