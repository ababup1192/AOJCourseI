import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val inputs = Iterator.continually(StdIn.readLine()).takeWhile(_ != null)
    inputs.toList.zipWithIndex.foreach{
      case ("0", _) =>
      case (e, idx) => println(s"Case ${idx+1}: $e")
    }
  }
}
