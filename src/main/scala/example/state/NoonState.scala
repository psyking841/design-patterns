package example.state

class NoonState extends State {
  override def handle(context: Context): Unit = {
    if (context.hour == 12) {
      println(s"Hour ${context.hour} Noon!")
    } else {
      context.state = new AfternoonState
      context.proceed
    }
  }
}
