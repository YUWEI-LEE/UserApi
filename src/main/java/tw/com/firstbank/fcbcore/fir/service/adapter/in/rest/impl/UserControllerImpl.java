package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.DeleteUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUsersResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.UpdateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.UpdateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.UserControllerApi;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.mapper.UserControllerMapper;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.impl.CreateUserUseCaseImpl;

@AllArgsConstructor
@RestController
public class UserControllerImpl implements UserControllerApi {


	private CreateUserUseCaseApi createUserUseCaseApi;

	private UserControllerMapper mapper;

	@Override
	public GetUserResponse getUsers() {
		return null;
	}

	@GetMapping("/{branchCode}/{no}")
	@Override
	public GetUserResponse getUser(@PathVariable String branchCode,@PathVariable String no) {
		GetUserResponse getUserResponse = new GetUserResponse();
		getUserResponse.setStatusCode("0000");
		return getUserResponse;
	}


	@PostMapping("")
	@Override
	public CreateUserResponse createUser(CreateUserRequest request) {

		return mapper.toCreateUserResponse
			(createUserUseCaseApi.execute(mapper.toCreateUserRequestCommand(request)));
	}

	@Override
	public UpdateUserResponse updateUser(String no, UpdateUserRequest request) {
		return null;
	}

	@Override
	public DeleteUserResponse deleteUser(String no) {
		return null;
	}
}
