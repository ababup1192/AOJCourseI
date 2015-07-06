import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val inputs = Iterator.continually(StdIn.readLine()).takeWhile(_ != null)
    for{
      in <- inputs
      val Array(a, b) = in.split(" ").map(_.toInt)
    }(a, b) match {
      case (0,  0) =>
      case (a,  b) if a <= b => println(s"$a $b")
      case (a,  b) if a > b => println(s"$b $a")
    }
  }
}