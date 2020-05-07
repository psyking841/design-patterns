package example.proxy

/**
 * Client class that want to access the resource
 */
trait IClient {
  def request(resource: Resource): Unit
}


