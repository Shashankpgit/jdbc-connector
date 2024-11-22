package org.sunbird.obsrv.connector

import org.sunbird.obsrv.connector.model.Models.ConnectorContext

class MySQLSource extends IJDBCSource {

  override def getDriver(): String = "com.mysql.cj.jdbc.Driver"

}