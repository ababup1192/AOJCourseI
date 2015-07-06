import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
      val inputs = StdIn.readLine().split(" ").map(_.toInt)
      val (a, b) = (inputs(0), inputs(1))
      if(a < b) println("a < b")
      else if(a > b) println("a > b")
      else println("a == b")
  }
}