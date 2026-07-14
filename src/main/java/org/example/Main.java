package org.example;
import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String URL ="jdbc:mysql://localhost:3306/student";
        String USER = "root";
        String PASSWORD = "bishal123@";
        try {

            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);

            Statement smt=connection.createStatement();
            ResultSet rs=smt.executeQuery("select * from student_data");
            //4th Step(Execute Query)
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }


        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
