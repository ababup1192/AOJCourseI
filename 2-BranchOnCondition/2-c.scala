import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
      val sortedList = StdIn.readLine().split(" ").map(_.toInt).sorted
      println(sortedList.mkString(" "))
  }
}
