package example.command

class Invoker {
  private var commands: Seq[Command] = Seq.empty

  def setCommand(command: Command): Unit = {
    commands :+= command
  }

  // TODO add a remove command method

  def executeCommand(): Unit = {
    commands.foreach(_.executeCommand)
  }
}
