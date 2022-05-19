package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.User;
import eCommerce.entities.concretes.UserLoginDto;

public class AuthManager implements AuthService {

	private UserService userService;
	
	public AuthManager(UserService userService) {
	
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(userExists(user.getEmail())) {
			System.out.println("Bu email zaten kay�tl�, l�tfen ba�ka bir email ile kay�t olunuz.");
		}else {
		userService.add(user);
		}
		
	}

	@Override
	public void login(UserLoginDto userLoginDto) {
		
		if(!userExists(userLoginDto.getEmail())) {
			System.out.println("B�yle bir kullan�c� bulunmuyor..(email kay�tl� de�il)");
			return;
		}
		
		User user= userService.get(userLoginDto.getEmail());
		if(user.getPassword()!=userLoginDto.getPassword()) {
			System.out.println("Girdi�iniz �ifre yanl��");
		}else {
			System.out.println("Sisteme ba�ar�yle giri� yapt�n�z");
		}
		
		
	}

	@Override
	public Boolean userExists(String email) {
		if( userService.get(email)!=null) {
			return true;
		}
		return false;
	}

}
