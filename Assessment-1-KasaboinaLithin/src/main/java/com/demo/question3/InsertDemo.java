package com.demo.question3;

import java.sql.*;

public class InsertDemo{
    public static void main(String[] args) {
        String insert_sql = "insert into student(id,name) values(?,?)";

        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/lithin", "root", "root");
                PreparedStatement pst = conn.prepareStatement(insert_sql);
        ) {

            conn.setAutoCommit(false);

            pst.setInt(1,1);
            pst.setString(2,"Lithin");
            pst.addBatch();

            pst.setInt(1,2);
            pst.setString(2,"Manisha");
            pst.addBatch();

            pst.setInt(1,3);
            pst.setString(2,"Kasaboina");
            pst.addBatch();

            pst.setInt(1,4);
            pst.setString(2,"Kasab");
            pst.addBatch();

            pst.setInt(1,5);
            pst.setString(2,"sonu");
            pst.addBatch();

            try {
                pst.executeBatch();
                conn.commit();
            }
            catch (SQLException e) {
                conn.rollback();
                conn.setAutoCommit(true);
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}