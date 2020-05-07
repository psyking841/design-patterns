package example.observer

trait Observer {
  val name: String
  def update: Unit
}
