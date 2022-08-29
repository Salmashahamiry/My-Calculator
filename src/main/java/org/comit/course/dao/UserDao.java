package org.comit.course.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.comit.course.controller.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public List<User> getData() {

		List<User> users = new ArrayList<>();

		// String driver = "com.mysql.cj.jdbc.Driver";

		String dbUrl = "jdbc:mysql://localhost:3306/usersdb";
		String dbUsername = "root";
		String dbPassword = "root";

		// String sql = "SELECT * FROM USER";
		String sql = "SELECT * FROM USER WHERE ID_USER= ?";

		// Loading and registering drivers
		// Class.forName(driver);

		try (Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setInt(1, 2);

			ResultSet rs = st.executeQuery();
			while (rs.next()) {

				int idUser = rs.getInt("ID_USER");
				String firstName = rs.getString("FIRST_NAME");
				String lastName = rs.getString("LAST_NAME");
				String username = rs.getString("USERNAME");
				String password = rs.getString("PASSWORD");
				Date birth = rs.getDate("BIRTH");
				String status = rs.getString("STATUS");

				User user = new User();

				user.setIdUser(idUser);
				user.setFirstName(firstName);
				// user.setLastName(lastName);
				user.setUsername(username);
				user.setPassword(password);
				user.setBirth(birth);
				// user.setStatus(status.charAt(0));

				users.add(user);
			}

		} catch (SQLException ex) {
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		users.forEach(System.out::println);

		return users;
	}
}
