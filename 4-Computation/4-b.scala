import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val r = StdIn.readLine().toDouble
    println("%.8f %.8f".format(Math.PI * r * r, 2 * Math.PI * r))
  }
}
