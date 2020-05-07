package example.factory.abstractfactory.dbexample.model

trait IUser {
  def insert(user: User): Unit

  def getUser: User
}
