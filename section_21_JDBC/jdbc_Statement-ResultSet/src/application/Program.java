package application;

import db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        // teste connection with database
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}