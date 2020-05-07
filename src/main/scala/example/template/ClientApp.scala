package example.template

object ClientApp extends App {
  val a = new ConcreteClassA
  a.templateMethod

  val b = new ConcreteClassB
  b.templateMethod
}
