package example.factory.simplefactory

class AddOperator(a: Int, b: Int) extends Operator {
  override val op1: Int = a
  override val op2: Int = b
  override def getResult: Int = op1 + op2
}
