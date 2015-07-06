import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readLine()
    val inputs = StdIn.readLine().split(" ").map(_.toInt).toList
    val min = inputs.foldLeft(Int.MaxValue)(Math.min(_, _))
    val max = inputs.foldLeft(Int.MinValue)(Math.max(_, _))
    val sum = inputs.foldLeft(0L)(_ + _)
    println(s"$min $max $sum")
  }
}
