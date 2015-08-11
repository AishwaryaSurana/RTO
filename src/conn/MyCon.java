/*
 * To change this license 
header, choose License Headers 
in Project Properties.
 * To 
change this template file, 
choose Tools | Templates
 * and 
open the template in the editor.
 
*/

package conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyCon 
{
   static Connection con;
 
  public static Connection getConnection()
   {
    try
       {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rto","root","");
      }
       
    catch(Exception e)
    {
      System.out.println(e);
    }
       return con;
   }
}
