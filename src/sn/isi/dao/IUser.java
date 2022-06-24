package sn.isi.dao;

import sn.isi.entities.User;

public interface IUser extends Repository<User> {
	public User login(String email, String password);
}
