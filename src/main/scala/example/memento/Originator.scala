package example.memento

/**
 * Originator creates a memento
 */
case class Originator(state1: String, state2: String, state3: String) {
  def createMemento: Memento = Memento(state1, state2)

  def setMemento(memento: Memento): Originator = {
    this.copy(state1 = memento.state1, state2 = memento.state2)
  }

  def show: Unit = print(s"Current state is (state1, state2, state3) = ($state1, $state2, $state3)")
}
