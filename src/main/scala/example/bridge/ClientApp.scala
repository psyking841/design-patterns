package example.bridge

object ClientApp extends App {
  val a = new APhone(new PhoneAppAForA, new PhoneAppBForA)
  val b = new GPhone(new PhoneAppAForG, new PhoneAppBForG)
  a.phoneApps.foreach(_.run())
  b.phoneApps.foreach(_.run())
}
