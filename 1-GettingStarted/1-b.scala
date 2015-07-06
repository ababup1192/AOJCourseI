import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    println(Math.pow(StdIn.readInt(), 3).toInt)
  }
}