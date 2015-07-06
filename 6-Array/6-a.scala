import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    StdIn.readInt()
    val list = StdIn.readLine().split(" ")
    println(list.reverse.mkString(" "))
  }
}
