package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;
import eCommerce.entities.concretes.UserLoginDto;

public interface AuthService {
	void register(User user);
	void login(UserLoginDto userLoginDto);
	Boolean userExists(String email);
}
