package org.vervebridge.proj.libmanagementsystem;

import java.sql.*;

public class Database {
    public static Connection connectDB() {
        try{
//            Class.forName("com.")
            Connection connect = DriverManager.getConnection("jdbc:sqlite:/home/kunal/VerveBridge/LibManagementSystem/src/main/resources/org/vervebridge/proj/libmanagementsystem/LibMgmt.db");
            return connect;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}