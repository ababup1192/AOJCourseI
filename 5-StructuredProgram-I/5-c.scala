import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val inputs = Iterator.continually(StdIn.readLine()).takeWhile(_ != null)
    for{
      in <- inputs
      val Array(h, w, _*) = in.split(" ").map(_.toInt)
      }{
        if(h != 0 && w != 0) println(List.tabulate(h, w) { (i, j) =>
          val simbol = if ((i % 2 == 0 && j % 2 == 0) ||
            (i % 2 != 0 && j % 2 != 0)) "#"
          else "."
          val EOS = if(j == w - 1) "\n" else ""
          simbol + EOS
        }.flatten.mkString)
      }
  }
}
