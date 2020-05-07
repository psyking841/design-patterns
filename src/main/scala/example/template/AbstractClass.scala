package example.template

trait AbstractClass {
  def abstractMethodA: Unit
  def abstractMethodB: Unit

  def templateMethod: Unit = {
    abstractMethodA
    abstractMethodB
  }
}
