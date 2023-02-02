package tw.com.firstbank.fcbcore.fir.service.application.in.user.impl;

import org.springframework.stereotype.Service;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserUseCaseApi;

@Service
public class GetUserUseCaseImpl implements GetUserUseCaseApi {


	@Override
	public GetUserResponseCommand execute(GetUserRequestCommand command) {
		return null;
	}
}
