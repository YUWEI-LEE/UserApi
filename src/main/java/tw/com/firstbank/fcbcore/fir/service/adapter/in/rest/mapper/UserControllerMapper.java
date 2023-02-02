package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUsersResponse;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserResponseCommand;

@Mapper(componentModel = ComponentModel.SPRING)
public interface UserControllerMapper {


	CreateUserRequestCommand toCreateUserRequestCommand (CreateUserRequest source);

	CreateUserResponse toCreateUserResponse(CreateUserResponseCommand source);

	GetUserRequestCommand toGetUserRequestCommand (String branchCode,String no);

	GetUserResponse toGetUserResponse (GetUserResponseCommand source);

}
