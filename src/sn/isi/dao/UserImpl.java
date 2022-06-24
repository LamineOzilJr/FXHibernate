package sn.isi.dao;

import org.hibernate.query.Query;

import sn.isi.entities.User;

public class UserImpl extends RepositoryImpl<User> implements IUser {

	public UserImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public User login(String email, String password) {
		try {
			return (User) session.createQuery("from User u where u.email = :em and u.password = :pwd")
					.setString("em", email)
					.setString("pwd", password)
					.uniqueResult();
		} catch (Exception e) {
			return null;
		}
	}
}
