package example.factory.factorymethod
import example.factory.simplefactory.{AddOperator, Operator}

class AddOperatorFactory(a: Int, b: Int) extends IFactory {
  override def getOperator: Operator = new AddOperator(a, b)
}
