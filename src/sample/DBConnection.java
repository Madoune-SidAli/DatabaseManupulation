package sample;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class DBConnection {


    private String password;

    public static Connection ConnectDB(){

                String url = "jdbc:mysql://localhost:3306/etudiants";
                String username = "root";
                String password = "";

                System.out.println("Connecting database...");
        Connection connection = null;
                try {
                    connection = DriverManager.getConnection(url, username, password);
                    //connection.close();
                    System.out.println("Connected!");
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }
                    return connection;
            }

    public static void main(String[] args) {
        Connection con = ConnectDB();

    }

        }



