/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Class DBHelper
 * Database baglantilarinin gerceklesecegi, kullanilacak olan database in
 * fonksiyonlarinin kullanilarak kendi database baglanma , sorgulama ve 
 * ihtiyac duyulursa diger database islerinin yapilacagi
 * ( Drop, Alter vs) classtir.
 */

package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cihan
 */
public class DBHelper {
    
    String dbName = null ;
    Connection connection = null;
    Statement stmt = null;
    ResultSet rs = null;
    String query = null;

    public DBHelper( String aDbName) {
  
        setConnection(aDbName, "root", "");
        dbName = aDbName ;
    }
    
    //database baglanmak icin gerekli database yonetici idsi ve passwordunu
    //alir ve databasede connection acar
    public boolean setConnection( String aDbName, String userName , String password ){
        //TODO
        try {
            System.out.println("database baglaniyor!!");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"+aDbName, userName, password);
            System.out.println("Connection basarili");
            stmt = connection.createStatement();
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
            return false ;
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: "+ cE.toString());
            return false;
        }
        
    }

    public boolean createTable( String name , ArrayList<String> columns  ) {
        //TODO
        query =  "CREATE TABLE " + name ;
        for( int i = 0 ; i < columns.size() ; ++i ){
            query += " " + columns.get(0) ;
        }
        
        try {
            rs = stmt.executeQuery( query );
            return true;
        } catch ( Exception e ) {
            System.out.println( "Error: " + e.toString() );
            return false;
        }
        
    }
    
    public boolean dropTable( String name ){
        query = "DROP TABLE " + name;
        
        try {
            rs = stmt.executeQuery( query );
            return true;
        } catch ( Exception e ) {
        }
        return false ;
    }
    
    public ResultSet recordSelect( String tableName ,String columns, String where, String condition /*. will be upgraded..*/){
        query = "SELECT "+columns+" FROM "+tableName ; //+" WHERE "+where+" "+condition;
        System.out.println("Query : " + query) ;//debug message
        try {
            rs = stmt.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println("ERROR: " +e.toString());
        }
        
        return null ;
    }
    
    public ResultSet recordDelete( String tableName , String where /*String condition /*. will be upgraded..*/ ){
        query = "DELETE FROM "+tableName+" WHERE "+where ;
        System.out.println("recor delete query : " + query);
        try {
            stmt.executeUpdate(query);
            return rs;
        } catch (Exception e) {
            System.out.println("ERROR: " +e.toString());
        }
        
        return null ;
    }
    
    public ResultSet recordUpdate( String tableName , String where, String condition /*. will be upgraded..*/){
        //TODO
        return null ;
    }
    
    public boolean recordInsert(String tableName ,ArrayList<String> columnNames, ArrayList<String> values ){
        query = "INSERT INTO " + tableName + " (";
        
        for (int i = 0; i < columnNames.size() ; i++) {
            query += columnNames.get(i) +",";
        }
        query = query.substring(0, query.length()-1);
        query += ") VALUES (" ;
        
        for (int i = 0; i < values.size() ; i++) {
            query += "'"+values.get(i)+"'" +",";
        }
        query = query.substring(0, query.length()-1);
        query += ")";
        
        System.out.println("Record Insert Qeury: " + query );
        try {
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }
    
}//end class DBHelper