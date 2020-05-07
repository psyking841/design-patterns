package example.state

object ClientApp extends App {
  // Init to state to morning
  val c = new Context
  c.state = new MorningState
  c.hour = 9
  c.proceed
  c.hour = 12
  c.proceed
  c.hour = 14
  c.proceed
}
