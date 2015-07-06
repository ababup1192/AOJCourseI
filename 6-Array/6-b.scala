import scala.io.StdIn

case class Card(suit: String, rank: Int) extends Ordered[Card] {
  override def toString():String = {
    s"$suit $rank"
  }

  def compare(that: Card): Int = {
    val (thisSuitIdx, thatSuitIdx) = (Card.suitSeq.indexWhere(_ == this.suit),
      Card.suitSeq.indexWhere(_ == that.suit))
    val suitComp = thisSuitIdx compare thatSuitIdx
    if(suitComp != 0){
      suitComp
    }else{
      this.rank compare that.rank
    }
  }

  def getNextCard: Option[Card] = {
    this match {
      case Card("D", 13) => None
      case Card(s, 13) =>
        Some(Card(Card.suitSeq(Card.suitSeq.indexWhere(_ == s)+1), 1))
      case Card(s, r) => Some(Card(s, r+1))
    }
  }
}

object Card{
  val suitSeq = Seq("S", "H", "C", "D")
}

object Main {
  def missingCardList(cardList: Seq[Card],
    card: Card = Card("S", 1), newCardList: Seq[Card] = Seq[Card]()): Seq[Card] = {
      if(cardList.contains(card) == false){
        card.getNextCard match {
          case None => (card +: newCardList).reverse
          case Some(next) => missingCardList(cardList, next, card +: newCardList)
        }
        }else{
          card.getNextCard match {
            case None => newCardList.reverse
            case Some(next) => missingCardList(cardList, next, newCardList)
          }
        }
  }


  def main(args: Array[String]): Unit = {
    StdIn.readInt()
    val inputs = Iterator.continually(StdIn.readLine()).takeWhile(_ != null).toList
    val cardList = for{
      in <- inputs
      val Array(suit, rankT, _*) = in.split(" ")
    }yield(Card(suit, rankT.toInt))
    missingCardList(cardList.sorted).foreach(println _)
  }
}

