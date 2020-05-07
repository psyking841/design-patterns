package example.proxy

class WebClient extends IClient {
  override def request(resource: Resource): Unit = print(s"Web client requests ${resource.name}")
}
