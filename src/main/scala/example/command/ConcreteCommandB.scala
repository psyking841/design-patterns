package example.command

class ConcreteCommandB(receiver: Receiver) extends Command(receiver) {
  override def executeCommand: Unit = {
    receiver.actionB
  }
}
