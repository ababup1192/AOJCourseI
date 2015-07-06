import scala.io.StdIn

case class Expr(l:Int, op: String, r:Int)

object Main {
  def calc(str:String):Option[Int] = {
    if(str.trim.isEmpty == false){
      val inputs = str.split(" ")
      Expr(inputs(0).toInt, inputs(1), inputs(2).toInt) match {
        case Expr(l, "+", r) => Some(l + r)
        case Expr(l, "-", r) => Some(l - r)
        case Expr(l, "*", r) => Some(l * r)
        case Expr(l, "/", r) => Some(l / r)
        case _ => None
      }
    }else{
      None
    }
  }

  def main(args: Array[String]): Unit = {
    Iterator.continually(StdIn.readLine()).takeWhile(_ != null).foreach{
      calc(_).foreach(println _)
    }
  }
}
