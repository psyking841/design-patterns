package example.factory.abstractfactory.dbexample

import example.factory.abstractfactory.dbexample.model.{IUser, User}

class PostgresUser extends IUser {
  def insert(user: User): Unit = {
    print(s"Insert into postgres_user_table values (${user.id}, ${user.name})")
  }

  def getUser: User = {
    print("Get a record from postgres_user_table")
    User(0, "shengyi")
  }
}
