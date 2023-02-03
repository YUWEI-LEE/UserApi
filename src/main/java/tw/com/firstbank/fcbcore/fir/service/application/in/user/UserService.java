package tw.com.firstbank.fcbcore.fir.service.application.in.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

	public List<UserDto> getAllUsers(){
		List<UserDto> result = new ArrayList<>();
		userRepository.findAll().forEach(user -> result.add(mapper.toUserDto(user)));
		return result;
	}

	public List<UserDto> getUserByBranchCode(String branchCode){
		List<UserDto> result = new ArrayList<>();
		userRepository.findByIdBranchCode(branchCode).forEach(user -> result.add(mapper.toUserDto(user)));
		return result;
	}
	public UserDto getUser(UserDto dto){

		return mapper.toUserDto(
			userRepository.findById(mapper.toUserId(dto)).orElse(null));
	}

	public void deleteUser(UserDto dto){
		userRepository.deleteById(mapper.toUserId(dto));
	}

	public UserDto updateUser(UserDto dto){
		if(userRepository.findById(mapper.toUserId(dto)).isEmpty()){
			throw new RuntimeException("No Customer Data.");
		}
		return mapper.toUserDto(userRepository.save(mapper.toUserEntity(dto)));
	}

	public  String getUserNo(){
		Random random = new Random();
		int no = random.nextInt(0,100000);

		return String.format("%05d",no);
	}
}
