import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val Array(a, b, _*) = StdIn.readLine().split(" ").map(_.toInt)
    println("%d %d %.8f".format(a / b, a % b, a.toDouble / b))
  }
}
