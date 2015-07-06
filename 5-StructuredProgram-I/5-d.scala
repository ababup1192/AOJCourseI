import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    call(n, 3)
  }
  def call(n:Int, i:Int){
    if(i % 3 == 0){
      print(" " + i)
    }else{
      def loop(x: Int){
        if(x % 10 == 3){
          print(" " + i)
        }else{
          if(x != 0){
            loop(x / 10)
          }
        }
      }
      loop(i)
    }
    if(i == n){
      println()
    }else{
      call(n, i+1)
    }
  }
}
