package com.jdbc

/**
 * Created by Kishore_Yakkala on 12/24/2015.
 */
object HeaderTable extends App{


  var dbConf = "(description=(load_balance=on)(failover=on)(address_list=(address=(protocol=tcp)(host=ausmg11cdedbscn.us.dell.com)(port=1521)))(connect_data=(failover_mode=(type=select)(method=basic)(retries=20)(delay=15))(service_name=otc3te_sql)))"
  var uname = "service_oci"
  var passwd = "eDPRgUX_J3VOI7"

  val db = Database

}
