package example.factory.abstractfactory.dbexample

import example.factory.abstractfactory.dbexample.model.IUser

/**
 * See example.simplefactory.dbexample for simple factory implementation of this example.
 */
object DbClient extends App {
  // If we want to connect to different SQL db, just change this line; this is benefit one
  val factory: IFactory = new MySqlFactory
  // Or val factory: IFactory = new PostgresFactory
  // One benefit of factory abstract pattern is the client only needs to know IUser interface.
  val user: IUser = factory.createUser
  print(user.getUser)
}
