package example.strategy

class CashBack(spend: Int, back: Int) extends ISale {
  override def acceptCash(m: Double): Double = {
    val factor = (m/spend).toInt
    val cashBack = factor * back
    m - cashBack
  }
}
