package tw.com.firstbank.fcbcore.fir.service.application.in.user.impl;

import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.UserService;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper.UserUseCaseMapper;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper.UserUseCaseMapperImpl;
import tw.com.firstbank.fcbcore.fir.service.domain.user.type.StatusCode;
@Slf4j
@AllArgsConstructor
@Service
public class CreateUserUseCaseImpl implements CreateUserUseCaseApi {


	private UserUseCaseMapper mapper;
	private UserService userService;

	@Transactional
	@Override
	public CreateUserResponseCommand execute(CreateUserRequestCommand requestCommand) {
		CreateUserResponseCommand resp = new CreateUserResponseCommand();
		resp.setStatusCode(StatusCode.UNKNOWN_ERROR);
		try{
			String no = getUserNo();
			userService.createUser(mapper.toUserDto(no,requestCommand));
			resp = mapper.toCreateUserResponseCommand(StatusCode.SUCCESS,no ,requestCommand.getBranchCode());

		}catch (Exception ex){
			log.error("Create User error",ex);
		}

		return resp;
	}

	public String getUserNo(){
		return userService.getUserNo();
	}
}
