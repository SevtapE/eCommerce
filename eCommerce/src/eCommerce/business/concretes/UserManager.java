package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		//iþ kontrol kodlarý
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		//iþ kontrol kodlarý
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		//iþ kontrol kodlarý
		userDao.delete(user);
		
	}

	@Override
	public User get(String email) {
		//iþ kontrol kodlarý
		
		return userDao.get(email);
	}

	@Override
	public List<User> getAll() {
		//iþ kontrol kodlarý
		 return userDao.getAll();
	}

}
