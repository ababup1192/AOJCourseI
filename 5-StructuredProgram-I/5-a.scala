import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val inputs = Iterator.continually(StdIn.readLine()).takeWhile(_ != null)
    for{
      in <- inputs
      val Array(h, w, _*) = in.split(" ").map(_.toInt)
      }{
        /*
        if(h != 0 && w != 0){
          val array = Array.ofDim[Int](h, w)
          array.zipWithIndex.foreach{
            case (e, idx) => e.foreach{_ => print("*")}
            if(idx == h-1)println("\n") else println()
          }
        }
        */
        if(h != 0 && w != 0){
          for{i <- 0 until h; j <- 0 until w}{
            print("#")
            if(j == w-1)println()
          }
          println()
        }
      }
  }
}