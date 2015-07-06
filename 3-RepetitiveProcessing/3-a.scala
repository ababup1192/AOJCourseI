import scala.io.StdIn

object Helpers {
  implicit class IntWithTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit =
        if(current > 0) {
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    import Helpers._
    1000 times println("Hello World")
  }
}
