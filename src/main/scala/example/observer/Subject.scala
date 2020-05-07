package example.observer

trait Subject {
  val name: String
  def notifai(): Unit
}
