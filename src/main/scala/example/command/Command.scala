package example.command

abstract class Command(receiver: Receiver) {
  def executeCommand: Unit
}
