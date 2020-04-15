package ru.amir.spring.testDB;

import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testDB {
    public static void main(String[] args) {
        String JDBCurl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String user = "springstudent";
        String password = "springstudent";
        try {
            Connection connection = DriverManager.getConnection(JDBCurl, user, password);
            System.out.println("Connection is established");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
