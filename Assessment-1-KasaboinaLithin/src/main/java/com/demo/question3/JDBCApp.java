package com.demo.question3;

import java.sql.*;

public class JDBCApp {
    public static void main(String[] args)throws Exception {


        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/lithin","root","root");
        PreparedStatement pst=conn.prepareStatement("select id,name from student");
        if(conn!=null){
            System.out.println("Mariadb connected");
            System.out.println(conn.getClass().getName());
        }

        ResultSet rs=pst.executeQuery("Select * from student");

        while (rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("name"));
        }



    }
}

