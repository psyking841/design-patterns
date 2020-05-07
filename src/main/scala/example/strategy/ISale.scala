package example.strategy

trait ISale {
  def acceptCash(m: Double): Double
}
