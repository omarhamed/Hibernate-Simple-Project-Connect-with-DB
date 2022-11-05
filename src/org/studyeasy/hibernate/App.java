package org.studyeasy.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			// ===========================================
			// INSERT ROW INTO DATABASE
			// Create object of entity class type
			// Users user = new Users("omar3", "sara", "omar3", "omar3");
			// Start transaction
			// session.beginTransaction();
			// Perform operation
			// session.save(user);
			// Commit the transaction
			// session.getTransaction().commit();
			// System.out.println("Row Added!");
			// ===========================================

			// ===========================================
			// SELECT ROW INTO DATABASE
			// Create object of entity class type
			// Users user = new Users();
			// Start transaction
			// session.beginTransaction();
			// Perform operation
			// user = session.get(Users.class, 1);
			// Commit the transaction
			// session.getTransaction().commit();
			// System.out.println(user);
			// ===========================================

			// ===========================================
			// UPDATE ROW IN DATABASE
			// Create object of entity class type
			// Users user = new Users();
			// Start transaction
			// session.beginTransaction();
			// Perform operation
			// user = session.get(Users.class, 1);
			// Updating Object
			// user.setUsername("omarHamed2345");
			// Commit the transaction
			// session.getTransaction().commit();
			// System.out.println(user);
			// ===========================================

			// ===========================================
			// DELETE ROW IN DATABASE
			// Create object of entity class type
			// Users user = new Users();
			// Start transaction
			// session.beginTransaction();
			// Perform operation
			// user = session.get(Users.class, 1);
			// Updating Object
			// session.delete(user);
			// Commit the transaction
			// session.getTransaction().commit();
			// System.out.println(user);
			// ===========================================

			// ===========================================
			// LISTING USERS (HIBERNATE QUERY LANGUAGE)
			// Start transaction
			// session.beginTransaction();
			// Perform operation
			// List<Users> users = session.createQuery("from users").getResultList();
			// for (Users user : users) {
			// System.out.println(user);
			// }
			// Commit the transaction
			// session.getTransaction().commit();
			// ===========================================

			// ===========================================
			// LISTING USERS (HIBERNATE QUERY LANGUAGE) using WHERE Clause
			// Start transaction
			// session.beginTransaction();
			// Perform operation
			// List<Users> users = session.createQuery("from users Where first_name =
			// 'ahmed' OR password = 'sara'").getResultList();
			// for (Users user : users) {
			// System.out.println(user);
			// }
			// Commit the transaction
			// session.getTransaction().commit();
			// ===========================================

			// ===========================================
			// UPDATEING USER (HIBERNATE QUERY LANGUAGE) using WHERE Clause
			// Start transaction
			// session.beginTransaction();
			// Perform operation
			// session.createQuery("update users set first_name = 'sara3ras' where user_id = 2").executeUpdate();
			// ===========================================

			// ===========================================
			// UPDATEING USER (HIBERNATE QUERY LANGUAGE) using WHERE Clause
			// Start transaction
			session.beginTransaction();
			// Perform operation
			session.createQuery("delete from users where user_id = 2").executeUpdate();
			// Commit the transaction
			session.getTransaction().commit();
			// ===========================================
		} finally {
			session.close();
			factory.close();
		}
	}
}
