package example.observer

class ConcreteSubjectX(val name: String) extends Subject {
  var observers: Seq[Observer] = Seq.empty

  def attach(observer: Observer): Unit = observers +:= observer

  def detach(name: String): Unit = observers = observers.filter(_.name != name)

  override def notifai(): Unit = observers.foreach(o => println(o.update))
}
