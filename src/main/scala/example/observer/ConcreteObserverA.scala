package example.observer

class ConcreteObserverA(override val name: String) extends Observer {
  override def update: Unit = println(s"Concrete observer A $name updated!")
}
