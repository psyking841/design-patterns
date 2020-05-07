package example.factory.simplefactory.dbexample

object DbClient extends App {
  val dbClient = new DbAccess("postgres")
  dbClient.accessUser.getUser
}
