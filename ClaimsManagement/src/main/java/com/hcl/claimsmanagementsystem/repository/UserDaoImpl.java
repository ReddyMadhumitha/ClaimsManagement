package com.hcl.claimsmanagementsystem.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.validation.Valid;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.sql.Insert;
import org.springframework.stereotype.Repository;
import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.User;
import com.hcl.claimsmanagementsystem.util.HibernateUtil;

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
			System.out.println("Error occured during connection creation " + e.getMessage());
		}
	}

	@Override
	public boolean registerUser(@Valid User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		int i = (Integer) session.save(user);
		session.getTransaction().commit();
		HibernateUtil.shutdown();

		if (i == 0) {
			return true;
		}
		return false;
	}

	

	@Override
	public boolean loginUser(@Valid Credential Credential) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		boolean userFound = false;
		String SQL_QUERY = " from User as a where a.userId=?0 and a.password=?1";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0, Credential.getUserId());
		query.setParameter(1, Credential.getPassword());
		List list = ((org.hibernate.query.Query) query).list();

		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}

		// session.close();
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		return userFound;
		// return false;
	}

}
