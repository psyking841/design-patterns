package example.command

object ClientApp extends App {
  val r = new Receiver
  val i = new Invoker
  i.setCommand(new ConcreteCommandA(r))
  i.setCommand(new ConcreteCommandB(r))
  i.executeCommand()
}
