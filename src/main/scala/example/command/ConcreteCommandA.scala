package example.command

class ConcreteCommandA(receiver: Receiver) extends Command(receiver) {
  override def executeCommand: Unit = {
    receiver.actionA
  }
}
