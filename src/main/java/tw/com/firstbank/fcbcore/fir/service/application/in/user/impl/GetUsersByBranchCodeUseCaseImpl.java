package tw.com.firstbank.fcbcore.fir.service.application.in.user.impl;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.UserService;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersByBranchCodeUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper.UserUseCaseMapper;
import tw.com.firstbank.fcbcore.fir.service.domain.user.type.StatusCode;

@Slf4j
@AllArgsConstructor
@Service
public class GetUsersByBranchCodeUseCaseImpl implements GetUsersByBranchCodeUseCaseApi {

	private UserUseCaseMapper mapper;
	private UserService userService;
	@Override
	public GetUsersResponseCommand execute(GetUsersRequestCommand requestCommand) {
		GetUsersResponseCommand resp = new GetUsersResponseCommand();
		resp.setStatusCode(StatusCode.UNKNOWN_ERROR);
		try{
			List<GetUserResponseCommand> userslist  = new ArrayList<>();
			userService.getUserByBranchCode(requestCommand.getBranchCode()).forEach(userDto -> userslist.add(mapper.toGetUserResponseCommand(null,userDto)));
			resp.setUsers(userslist);
			resp.setStatusCode(StatusCode.SUCCESS);
		}catch (Exception ex){
			log.error("Get Users By BranchCode Error",ex);
		}
		return resp;
	}
}
