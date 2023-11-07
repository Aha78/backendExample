package com.example.backend;

import java.sql.*;
import java.util.Vector;

 public class detailsDao {
    Connection connection = null;
    Vector<Details> detailsList = new Vector<>();

    public detailsDao() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/db1", "root", "");
    }

    public DetailsRow getDetails() throws SQLException {
        Statement stmt = this.connection.createStatement();
        ResultSet rs = stmt.executeQuery("select  SensorId, AVG(Temperature),  count(Temperature)  from cubesensors_data GROUP BY Sensorid");

        while (rs.next()) {
            Details details = new Details();
            details.sensorId = rs.getString(1);
            details.avgTemp = rs.getFloat(2)/100;
            details.count =rs.getInt(3);
            detailsList.add(details);

        }

        DetailsRow row = new DetailsRow();
        row.sensors = detailsList;
        return row;
    }

}
