/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BanDoc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class BanDocDAO {

    private Connection conn;

    public BanDocDAO() {
        String url = "jdbc:mysql://localhost:3306/sinhvien";
        String user = "root";
        String password = "";
        
    }

    public boolean addNewReader(BanDoc b) {
        return false;
    }
}
