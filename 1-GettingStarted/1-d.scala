import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val time = StdIn.readInt()
    val h = time / 3600
    val m = (time % 3600) / 60
    val s = (time % 3600) % 60
    println(s"$h:$m:$s")
  }
}