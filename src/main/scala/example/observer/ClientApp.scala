package example.observer

object ClientApp extends App {
  val a = new ConcreteObserverA("observerA")
  val b = new ConcreteObserverB("observerB")
  val c = new ConcreteSubjectX("subject1")
  c.attach(a)
  c.attach(b)
  c.notifai()
}
