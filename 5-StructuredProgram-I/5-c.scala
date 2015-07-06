import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val inputs = Iterator.continually(StdIn.readLine()).takeWhile(_ != null)
    for{
      in <- inputs
      val Array(h, w, _*) = in.split(" ").map(_.toInt)
      }{
        if(h != 0 && w != 0){
          for{i <- 0 until h; j <- 0 until w}{
            if((i % 2 == 0 && j % 2 == 0) ||
              (i % 2 != 0 && j % 2 != 0)) print("#")
            else print(".")
            if(j == w-1) println()
          }
          println()
        }
      }
  }
}
