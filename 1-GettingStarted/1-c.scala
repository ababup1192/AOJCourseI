import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val Array(a, b, _*) = StdIn.readLine().split(" ").map(_.toInt)
    println(s"${a * b} ${a * 2 + b * 2}")
  }
}