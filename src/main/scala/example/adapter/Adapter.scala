package example.adapter

/**
 * Note adapter is a subclass of Target
 * @param adaptee
 */
class Adapter(adaptee: Adaptee) extends Target {
  //Replace adapt request using adaptee's
  override def request: Unit = adaptee.specailRequest
}
