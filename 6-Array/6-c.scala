import scala.io.StdIn

object Main{
  def main(args: Array[String]): Unit = {

    val input = scala.io.Source.stdin.getLines().toList.map(_.split(" ").map(_.toInt))
    val buildingTable = List.tabulate(4, 3, 10) { (i, j, k) =>
      input.collect {case Array(b, f, r, v) if b - 1 == i && f - 1 == j && r - 1 == k => v}.sum
    }

    for{
      (building, bidx) <- buildingTable.zipWithIndex
      } {
        println(building.map(" " + _.mkString(" ")).mkString("\n"))
        if(bidx != 4 - 1){
          println("####################")
        }
      }
  }
}
