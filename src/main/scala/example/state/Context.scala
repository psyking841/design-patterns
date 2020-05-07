package example.state

class Context {
  private var _state: State = _
  private var _hour: Int = _

  //getters and setters
  def state: State = _state
  def state_=(value: State): Unit = _state = value
  def hour: Int = _hour
  def hour_= (value: Int): Unit = _hour = value
  def proceed: Unit = state.handle(this)
}
