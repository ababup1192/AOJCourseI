import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val inputs = Iterator.continually(StdIn.readLine()).takeWhile(_ != null)
    for{
      in <- inputs
      val Array(h, w, _*) = in.split(" ").map(_.toInt)
      }{
        if(h != 0 && w != 0){
          println((List.tabulate(h,  w){(i,  j) =>
            if(j == w-1) "#\n"
            else if(i == 0 || i == h-1 || j == 0 || j == w-1) "#"
            else "."
          }).flatten.mkString)
        }
      }
  }
}
