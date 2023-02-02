package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;

@Mapper(componentModel = ComponentModel.SPRING)
public interface UserControllerMapper {


	CreateUserRequestCommand toCreateUserRequestCommand (CreateUserRequest source);

	CreateUserResponse toCreateUserResponse(CreateUserResponseCommand source);

}
