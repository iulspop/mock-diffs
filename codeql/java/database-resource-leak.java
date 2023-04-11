package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    private Connection conn;

    public DatabaseManager(Connection conn) {
        this.conn = conn;
    }

    public void executeQuery(String query) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            // do stuff with results
            processResults(rs);
        }
    }

    private void processResults(ResultSet rs) {
        // Process the results from the query
    }
}
