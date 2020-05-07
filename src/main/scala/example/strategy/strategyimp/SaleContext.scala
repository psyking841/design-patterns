package example.strategy.strategyimp

import example.strategy.ISale

class SaleContext(strategy: ISale) {
  def getResult(m: Double): Double = strategy.acceptCash(m)
}
