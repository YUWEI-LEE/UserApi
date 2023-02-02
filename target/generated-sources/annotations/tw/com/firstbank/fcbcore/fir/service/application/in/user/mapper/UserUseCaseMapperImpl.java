package tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-02T10:21:53+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Homebrew)"
)
@Component
public class UserUseCaseMapperImpl implements UserUseCaseMapper {

    @Override
    public UserDto toUserDto(String no, CreateUserRequestCommand source) {
        if ( no == null && source == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        if ( source != null ) {
            userDto.setBranchCode( source.getBranchCode() );
            userDto.setBusinessCategory( source.getBusinessCategory() );
            userDto.setVerificationCode( source.getVerificationCode() );
            userDto.setFirstName( source.getFirstName() );
            userDto.setLastName( source.getLastName() );
            userDto.setBirthday( source.getBirthday() );
            userDto.setEmail( source.getEmail() );
            userDto.setPhone( source.getPhone() );
        }
        userDto.setNo( no );

        return userDto;
    }

    @Override
    public CreateUserResponseCommand toCreateUserResponseCommand(String statusCode, String no, String branchCode) {
        if ( statusCode == null && no == null && branchCode == null ) {
            return null;
        }

        CreateUserResponseCommand createUserResponseCommand = new CreateUserResponseCommand();

        createUserResponseCommand.setStatusCode( statusCode );
        createUserResponseCommand.setNo( no );
        createUserResponseCommand.setBranchCode( branchCode );

        return createUserResponseCommand;
    }
}
