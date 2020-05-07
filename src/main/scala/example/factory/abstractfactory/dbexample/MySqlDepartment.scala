package example.factory.abstractfactory.dbexample

import example.factory.abstractfactory.dbexample.model.{Department, IDepartment}

class MySqlDepartment extends IDepartment {
  override def insert(department: Department): Unit = {
    print(s"Insert into my_sql_dep_table values (${department.id}, ${department.name})")
  }

  override def getDepartment: Department = {
    print("Get a record from my_sql_dep_table")
    Department(0, "ECE")
  }
}
