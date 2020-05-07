package example.memento

object Client extends App {
  val original = Originator("a","b","c")
  original.show
  val coordinator = CareTaker(original.createMemento)

  //modify Originator
  val original2 = Originator(state1 = "x", state2 = "y", state3 = original.state3)
  original2.show

  val original3 = original.setMemento(coordinator.memento)
  original3.show
}
