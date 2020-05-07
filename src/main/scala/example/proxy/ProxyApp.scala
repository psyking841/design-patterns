package example.proxy

object ProxyApp extends App {
  // Simulate a resource
  val resource = new Resource("resource")

  val p = new Proxy
  p.request(resource)
}
