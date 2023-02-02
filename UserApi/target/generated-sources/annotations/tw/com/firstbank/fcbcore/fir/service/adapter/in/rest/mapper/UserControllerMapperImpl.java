package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-02T10:21:53+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Homebrew)"
)
@Component
public class UserControllerMapperImpl implements UserControllerMapper {

    @Override
    public CreateUserRequestCommand toCreateUserRequestCommand(CreateUserRequest source) {
        if ( source == null ) {
            return null;
        }

        CreateUserRequestCommand createUserRequestCommand = new CreateUserRequestCommand();

        createUserRequestCommand.setBranchCode( source.getBranchCode() );
        createUserRequestCommand.setBusinessCategory( source.getBusinessCategory() );
        createUserRequestCommand.setVerificationCode( source.getVerificationCode() );
        createUserRequestCommand.setFirstName( source.getFirstName() );
        createUserRequestCommand.setLastName( source.getLastName() );
        createUserRequestCommand.setBirthday( source.getBirthday() );
        createUserRequestCommand.setEmail( source.getEmail() );
        createUserRequestCommand.setPhone( source.getPhone() );

        return createUserRequestCommand;
    }

    @Override
    public CreateUserResponse toCreateUserResponse(CreateUserResponseCommand source) {
        if ( source == null ) {
            return null;
        }

        CreateUserResponse createUserResponse = new CreateUserResponse();

        createUserResponse.setStatusCode( source.getStatusCode() );
        createUserResponse.setNo( source.getNo() );
        createUserResponse.setBranchCode( source.getBranchCode() );

        return createUserResponse;
    }
}
