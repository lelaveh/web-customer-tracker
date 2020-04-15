package ru.amir.spring.testDB;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@WebServlet("/TestDbServlet")
public class TestDbServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String JDBCurl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String user = "springstudent";
        String password = "springstudent";
        String driver = "com.mysql.jdbc.Driver";
        try {
            response.getWriter().println("Connecting to database...");
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(JDBCurl, user, password);
            response.getWriter().println("Connection with " + JDBCurl + " is established");
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
