package example.factory.factorymethod

import example.factory.simplefactory.Operator

trait IFactory {
  def getOperator: Operator
}
