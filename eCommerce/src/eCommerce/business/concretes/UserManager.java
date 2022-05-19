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
		//i� kontrol kodlar�
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		//i� kontrol kodlar�
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		//i� kontrol kodlar�
		userDao.delete(user);
		
	}

	@Override
	public User get(String email) {
		//i� kontrol kodlar�
		
		return userDao.get(email);
	}

	@Override
	public List<User> getAll() {
		//i� kontrol kodlar�
		 return userDao.getAll();
	}

}
