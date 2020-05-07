package example.strategy

import example.strategy.simplefactoryimp.POSSystem
import example.strategy.strategyimp.SaleContext

/**
 * A simple POS system that calculates the accepting cash based on different pomotions
 */
object POSSystemClient extends App {

  // Option 1: Using Factory pattern
  val res = POSSystem.getSale("spend 300 get 100 back").acceptCash(450)
  // The downside of using factory pattern here is you have to adding items to the factory class if there is new promotion

  // Option 2: Using Strategy pattern
  val res1 = new SaleContext(new Discount(0.8))
  val res2 = new SaleContext(new CashBack(300, 100))
  val res3 = new SaleContext(new CashBack(500, 200))
  res1.getResult(300)
  res2.getResult(450)
  res3.getResult(550)
}
