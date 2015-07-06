import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
      val inputs = StdIn.readLine().split(" ").map(_.toInt)
      val (a, b, c) = (inputs(0), inputs(1), inputs(2))
      if(a < b && b < c)println("Yes")
      else println("No")
  }
}
