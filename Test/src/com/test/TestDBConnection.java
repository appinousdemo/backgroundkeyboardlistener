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
            Connection connection = DriverManager.getConnection("jdbc:mysql://13.126.197.196:3306/support","po","danam@po");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select id,code from hdz_tickets");
            while ( rs.next() ) {
                String lastName = rs.getString("id");
                System.out.println(lastName);
            }
            connection.close();
            System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());
        } catch (Exception e) {
System.out.println("Unable to make connection with DB");
            e.printStackTrace();
        }
    }
}