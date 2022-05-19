package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile kullan�c� eklendi: "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile kullan�c� g�ncellendi: "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile kullan�c� silindi: "+user.getFirstName());
		
	}

	@Override
	public User get(String email) {
		System.out.println("Hibernate ile kullan�c� getirildi. ");

		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("Hibernate ile kullan�c� listesi getirildi. ");
		return null;
	}

}
