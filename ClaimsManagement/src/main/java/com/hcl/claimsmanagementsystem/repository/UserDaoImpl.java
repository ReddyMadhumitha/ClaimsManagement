package com.hcl.claimsmanagementsystem.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.User;

/**
 * @author reddy-madhumitha
 *
 */
@Repository
public class UserDaoImpl implements UserDao {
    static Connection conn = null;
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLAIM_REGISTRATION", "root", "root");
		} catch (Exception e) {
			System.out.println("Error occured during connection creation " + e);
		}
	}

	public boolean register(User user) {
		try {
			PreparedStatement pst = conn
					.prepareStatement("insert into user(roleId,userId,password) values(?,?,?)");
			pst.setInt(1, user.getRoleId());
			pst.setInt(2, Integer.parseInt(user.getUserId()));
			pst.setString(3, user.getPassword());

			pst.executeUpdate();

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error occured during insert user record" + e.getMessage());
		}

		return false;
	}
	

	public boolean login(Credential credential) {
		try {
			PreparedStatement pst = conn
					.prepareStatement("select * from user where userId=? and password=?");
			pst.setString(1, credential.getUserId());
			pst.setString(2, credential.getPassword());
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
}

