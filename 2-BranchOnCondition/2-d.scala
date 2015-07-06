import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
      val Array(w, h, x, y, r, _*) = StdIn.readLine().split(" ").map(_.toInt)
      if(x - r >= 0 && x + r <= w && y - r >=0 && y + r <= h) println("Yes")
      else println("No")
  }
}
