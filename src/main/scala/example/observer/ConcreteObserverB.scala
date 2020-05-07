package example.observer

class ConcreteObserverB(override val name: String) extends Observer {
  override def update: Unit = println(s"Concrete observer B $name updated!")
}
