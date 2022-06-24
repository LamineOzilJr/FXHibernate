package test;

import sn.isi.dao.IUser;
import sn.isi.dao.UserImpl;
import sn.isi.entities.User;

public class Test {
	
	public static void main(String[] args) {
		
		User u = new User();
		u.setEmail("lamine@gmail.com");
		u.setPassword("passer");
		u.setNom("Ozil");
		u.setPrenom("Basse");
		
		IUser userdao = new UserImpl();
		//int result = userdao.add(u);
		//System.out.println(result);
	}

}
