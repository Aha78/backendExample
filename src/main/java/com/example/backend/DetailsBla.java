package com.example.backend;

import java.sql.SQLException;

public class DetailsBla {
    public DetailsRow getDetails() throws SQLException, ClassNotFoundException {
        detailsDao  details=new detailsDao();
        return details.getDetails();
    }

}
