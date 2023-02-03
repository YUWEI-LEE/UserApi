package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.impl.UserControllerImpl;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.mapper.UserControllerMapper;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.DeleteUserUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersByBranchCodeUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersUseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.UpdateUserUseCaseApi;

@ExtendWith({MockitoExtension.class})
public class UserControllerApiTest {

	private UserControllerApi userApi;

	@Mock
	private UserControllerMapper mapper;

	@Mock
	private CreateUserUseCaseApi createUserUseCaseApi;
	@Mock
	private GetUserUseCaseApi getUserUseCaseApi;
	@Mock
	private DeleteUserUseCaseApi deleteUserUseCaseApi;
	@Mock
	private UpdateUserUseCaseApi updateUserUseCaseApi;
	@Mock
	private GetUsersUseCaseApi getUsersUseCaseApi;
	@Mock
	private GetUsersByBranchCodeUseCaseApi getUsersByBranchCodeUseCaseApi;

	public void setUp(){
		userApi = new UserControllerImpl(mapper,createUserUseCaseApi,
			getUserUseCaseApi,deleteUserUseCaseApi,updateUserUseCaseApi,getUsersUseCaseApi,getUsersByBranchCodeUseCaseApi);
	}

}
