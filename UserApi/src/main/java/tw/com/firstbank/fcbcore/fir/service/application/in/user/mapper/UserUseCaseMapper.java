package tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper;

import java.util.Date;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.Mappings;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;

@Mapper(componentModel = ComponentModel.SPRING)
public interface UserUseCaseMapper {

//	@Mappings(
//		{
//			@Mapping(source = "no" ,target = "no")
//			@Mapping(source = "source.branchCode" ,target = "branchCode"),
//			@Mapping(source = "source.businessCategory" ,target = "businessCategory"),
//			@Mapping(source = "source.verificationCode" ,target = "verificationCode"),
//			@Mapping(source = "source.firstName" ,target = "firstName"),
//			@Mapping(source = "source.lastName" ,target = "lastName"),
//			@Mapping(source = "source.birthday" ,target = "birthday"),
//			@Mapping(source = "source.email" ,target = "email"),
//			@Mapping(source = "source.phone" ,target = "phone")
//		}
//	)
	@Mapping(source = "no" ,target = "no")
	UserDto toUserDto (String no, CreateUserRequestCommand source);


	CreateUserResponseCommand toCreateUserResponseCommand(String statusCode,String no,String branchCode);


}
