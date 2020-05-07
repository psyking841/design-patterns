package example.strategy

class NormalSale extends ISale {
  override def acceptCash(m: Double): Double = m
}
