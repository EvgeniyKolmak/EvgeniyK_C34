package com.kolmak;


import com.kolmak.service.SqlService;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        SqlService sqlService = new SqlService();

        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/stringDB",
                "postgres",
                "postgres"
        )) {

            Scanner scanner = new Scanner(System.in);

            while(true) {
                String line = scanner.nextLine();

                if(line.isEmpty()) {
                    break;
                }
                sqlService.write(connection, line);
            }

            System.out.println("--------------------------------");
            sqlService.readAll(connection);
        }
    }
}