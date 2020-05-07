package example.state

trait State {
  /**
   */
  def handle(context: Context): Unit
}
