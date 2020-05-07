package example.strategy.simplefactoryimp

import example.strategy.{CashBack, Discount, ISale, NormalSale}

object POSSystem {
  def getSale(sale: String): ISale = {
    sale match {
      case "normal" => new NormalSale
      case "50% discount" => new Discount(0.5)
      case "spend 300 get 100 back" => new CashBack(300, 100)
    }
  }
}
