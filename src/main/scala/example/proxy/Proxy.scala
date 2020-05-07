package example.proxy

class Proxy extends IClient {
  var webClient: IClient = _
  override def request(resource: Resource): Unit = {
    if(Option(webClient).isEmpty) webClient = new WebClient
    webClient.request(resource)
  }
}
