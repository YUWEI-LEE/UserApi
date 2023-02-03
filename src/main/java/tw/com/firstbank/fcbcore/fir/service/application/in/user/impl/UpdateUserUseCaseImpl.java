package tw.com.firstbank.fcbcore.fir.service.application.in.user.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.UserService;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.DeleteUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.UpdateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.UpdateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.UpdateUserUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper.UserUseCaseMapper;
import tw.com.firstbank.fcbcore.fir.service.domain.user.type.StatusCode;


@Slf4j
@AllArgsConstructor
@Service
public class UpdateUserUseCaseImpl implements UpdateUserUseCaseApi {


	private UserUseCaseMapper mapper;

	private UserService userService;

	@Override
	public UpdateUserResponseCommand execute(UpdateUserRequestCommand requestCommand) {
		UpdateUserResponseCommand resp = new UpdateUserResponseCommand();
		resp.setStatusCode(StatusCode.UNKNOWN_ERROR);
		try {

			resp = mapper.toUpdateUserRequestCommand(StatusCode.SUCCESS,
				userService.updateUser(mapper.toUserDto(requestCommand)));
		}catch (Exception ex){
			log.error("update User error",ex);
		}
		return resp;
	}
}
