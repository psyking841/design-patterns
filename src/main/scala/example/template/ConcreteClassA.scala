package example.template

class ConcreteClassA extends AbstractClass {
  override def abstractMethodA: Unit = println("Implementation of method A in Concrete Class A")

  override def abstractMethodB: Unit = println("Implementation of method B in Concrete Class A")
}
