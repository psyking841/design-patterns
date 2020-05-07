package example.template

class ConcreteClassB extends AbstractClass {
  override def abstractMethodA: Unit = println("Implementation of method A in Concrete Class B")

  override def abstractMethodB: Unit = println("Implementation of method B in Concrete Class B")
}
