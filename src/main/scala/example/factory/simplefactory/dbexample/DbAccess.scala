package example.factory.simplefactory.dbexample

import example.factory.abstractfactory.dbexample.model.{IDepartment, IUser}
import example.factory.abstractfactory.dbexample.{
  MySqlDepartment,
  MySqlUser,
  PostgresDepartment,
  PostgresUser
}

class DbAccess(db: String = "mysql") {

  val accessUser: IUser = db match {
    case "mysql"    => new MySqlUser
    case "postgres" => new PostgresUser
  }

  val accessDepartment: IDepartment = db match {
    case "mysql"    => new MySqlDepartment
    case "postgres" => new PostgresDepartment
  }
}
