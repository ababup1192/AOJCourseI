import scala.io.StdIn
import scala.collection.mutable.Map

object Main{
  def main(args: Array[String]): Unit = {
    val houses = Map.empty[Int, Array[Array[Int]]]
    (1 to 4).foreach{ b =>
      houses += (b -> Array.fill(3)(Array.fill(10)(0)))
    }

    val n = StdIn.readInt()
    (1 to n).foreach{ _ =>
      val Array(b, f, r, v, _*) = StdIn.readLine().split(" ").map(_.toInt)
      houses.get(b).foreach(building => {building(f-1)(r-1) += v})
    }

    (1 to 4).foreach{ b =>
      def buildingPrint(bl: Array[Array[Int]]){
        bl.foreach(f => println(" " + f.mkString(" ")))
      }

      if(b != 4){
        buildingPrint(houses(b))
        println("####################")
      }else{
        buildingPrint(houses(b))
      }
    }
  }
}
