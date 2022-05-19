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
			System.out.println("Bu email zaten kayýtlý, lütfen baþka bir email ile kayýt olunuz.");
		}else {
		userService.add(user);
		}
		
	}

	@Override
	public void login(UserLoginDto userLoginDto) {
		
		if(!userExists(userLoginDto.getEmail())) {
			System.out.println("Böyle bir kullanýcý bulunmuyor..(email kayýtlý deðil)");
			return;
		}
		
		User user= userService.get(userLoginDto.getEmail());
		if(user.getPassword()!=userLoginDto.getPassword()) {
			System.out.println("Girdiðiniz þifre yanlýþ");
		}else {
			System.out.println("Sisteme baþarýyle giriþ yaptýnýz");
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
