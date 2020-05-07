package example.adapter

/**
 * Adapter pattern is to replace the operation in Adaptee
 */
object AdapterClient extends App {
  val a = new Adapter(new Adaptee)
  print(a.request)
}
