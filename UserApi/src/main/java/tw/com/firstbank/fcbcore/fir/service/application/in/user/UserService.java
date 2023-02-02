package tw.com.firstbank.fcbcore.fir.service.application.in.user;

import java.util.Random;
import org.springframework.stereotype.Service;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper.UserDto;

@Service
public class UserService {

	public UserDto createUser(UserDto dto){

		return null;
	}


	public  String getUserNo(){
		Random random = new Random();
		int no = random.nextInt(0,100000);

		return String.format("%05d",no);
	}

}
