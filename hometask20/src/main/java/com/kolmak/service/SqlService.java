package com.kolmak.service;

import java.sql.*;

public class SqlService {

    public void write(Connection connection, String text) throws SQLException {
        String sqlReq = "INSERT INTO strings (text) VALUES (?)";
        try (PreparedStatement ps = connection.prepareStatement(sqlReq)) {
            ps.setString(1, text);
            ps.executeUpdate();
        }
    }

    public void readAll(Connection connection) throws SQLException {
        String sqlReq = "SELECT * from  strings";
        try (PreparedStatement ps = connection.prepareStatement(sqlReq)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("text"));
            }
        }
    }

}
