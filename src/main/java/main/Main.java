package main;

import database.DatabaseConnector;
import java.util.Date;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) throws SQLException {
        //w1_1, w1_2, w1_3, w1_4, w1_5, w1_6, w1_7, w1_8, w1_9, w1_10, w1_11, w2_1, w2_2, w2_3, w2_4, w2_5, w2_6, w2_7, w2_8, w2_9, w2_10, w2_11
        ResultSet t = DatabaseConnector.getInstance().sendSQLStatement("SELECT * FROM Temperaturdaten");
        int max = t.getMetaData().getColumnCount();

        for (int i = 3; i<=max;i++){
            System.out.println(t.getMetaData().getColumnLabel(i));
        }
    }
}
