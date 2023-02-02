package tw.com.firstbank.fcbcore.fir.service.application.in.user;

import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tw.com.firstbank.fcbcore.fir.service.adapter.out.repository.UserRepository;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper.UserDto;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper.UserUseCaseMapper;
import tw.com.firstbank.fcbcore.fir.service.domain.user.User;

@AllArgsConstructor
@Service
public class UserService {

	private UserRepository userRepository;

	private UserUseCaseMapper mapper;
	public UserDto createUser(UserDto dto){

		return mapper.toUserDto(userRepository.save(mapper.toUserEntity(dto)));
	}


	public  String getUserNo(){
		Random random = new Random();
		int no = random.nextInt(0,100000);

		return String.format("%05d",no);
	}

}
