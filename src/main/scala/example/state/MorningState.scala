package example.state

class MorningState extends State {
  override def handle(context: Context): Unit = {
    if(context.hour < 12) {
      println(s"Hour ${context.hour} Morning!")
    } else {
      context.state = new NoonState
      context.proceed
    }
  }
}
