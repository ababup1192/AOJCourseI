import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val Array(a, b, c, _*) = StdIn.readLine().split(" ").map(_.toInt)
    println(Stream.range(a, b+1).filter(c % _ == 0).length)
  }
}
