package example.factory

import example.factory.factorymethod.{AddOperatorFactory, IFactory, SubtractOperatorFactory}
import example.factory.simplefactory.Calculator

object CalculatorClient extends App {
  println(Calculator.getOperator("+")(1, 2).getResult)
  println(Calculator.getOperator("-")(3, 2).getResult)

  /**
   * The benefit of factory method pattern is that now you don't need to modify Calculator object.
   * To add new operator, you just create new class that inherits IFactory.
   */
  var operator: IFactory = new AddOperatorFactory(1, 2)
  operator.getOperator.getResult
  operator = new SubtractOperatorFactory(3, 2)
  operator.getOperator.getResult
}
