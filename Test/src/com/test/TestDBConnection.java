package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDBConnection {

    public static void main(String[] args) {
        //String Url = "jdbc:mysql://localhost:3306/sonoo;DatabaseName=DBname;user=dbUsername;Password=dbPassword";
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Trying to connect");
            Connection connection = DriverManager.getConnection("jdbc:mysql://43.255.154.58:3306/appinous","siva","Welcome@123");
            /*Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select userid,password from profile");
            while ( rs.next() ) {
                String lastName = rs.getString("password");
                System.out.println(lastName);
               
            }*/
            
            System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                    );
            System.out.println("Creating table in given database...");
            Statement stmt = connection.createStatement();
            //stmt.executeUpdate("DROP TABLE profile");
           /* String sql = "CREATE TABLE profile " +
                         "(userid VARCHAR(8) not NULL, " +
                         " password VARCHAR(16), " + 
                         " name VARCHAR(255), " + 
                         " mbl VARCHAR(16), " + 
                         " PRIMARY KEY ( userid ))"; 

            stmt.executeUpdate(sql);*/
            
            System.out.println("Created table in given database...");
           String sql = "INSERT INTO profile " +
                    "VALUES ('SIVA0005', 'siva.k96', 'Sivabharathi', 8695464670)";
       stmt.executeUpdate(sql);
      
       System.out.println("Inserted records into the table...");
            connection.close();
        } catch (Exception e) {
System.out.println("Unable to make connection with DB");
            e.printStackTrace();
        }
    }
}