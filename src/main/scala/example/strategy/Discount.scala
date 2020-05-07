package example.strategy

class Discount(pct: Double) extends ISale {
  override def acceptCash(m: Double): Double = m * pct
}
