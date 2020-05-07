package example.state

class AfternoonState extends State {
  override def handle(context: Context): Unit = {
    //    println("Afternoon")
    //    new Context(new MorningState)
    //  }
    if (context.hour > 12) {
      println(s"Hour ${context.hour} Afternoon!")
    } else {
      context.state = new MorningState
      context.proceed
    }
  }
}
