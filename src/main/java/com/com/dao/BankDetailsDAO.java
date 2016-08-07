package com.com.dao;

/**
 * Created by senura on 8/7/2016.
 */

import com.connection.ConnectionFactory;
import com.model.BankDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BankDetailsDAO {

    public void insertData(BankDetails bd) {
        ConnectionFactory.getConnection();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO `bank`.`new_table` (`desc`,`address`) VALUES (?,?)");
            ps.setString(1, bd.getDesc());
            ps.setString(2, "hhh");
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BankDetailsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getdata(BankDetails bd){
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps1 = con.prepareStatement("SELECT * FROM `bank`.`new_table` WHERE id=?");
            ps1.setInt(1, bd.getId());
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                rs1.getString("id");
                rs1.getString("desc");
            }
        }catch (SQLException ex){
            Logger.getLogger(BankDetailsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public void getAlldata(BankDetails bd){

        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps2 = con.prepareStatement("SELECT * FROM `bank`.`new_table`");
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                rs2.getString("id");
                rs2.getString("desc");
            }
            
        }catch (SQLException ex){
            Logger.getLogger(BankDetailsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
