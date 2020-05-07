package example.factory.factorymethod
import example.factory.simplefactory.{Operator, SubtractOperator}

class SubtractOperatorFactory(a: Int, b: Int) extends IFactory {
  override def getOperator: Operator = new SubtractOperator(a, b)
}
