package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUserResponse;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserResponseCommand;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-02T14:05:42+0800",
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

    @Override
    public GetUserRequestCommand toGetUserRequestCommand(String no, String branchCode) {
        if ( no == null && branchCode == null ) {
            return null;
        }

        GetUserRequestCommand getUserRequestCommand = new GetUserRequestCommand();

        return getUserRequestCommand;
    }

    @Override
    public GetUserResponse toGetUserResponse(GetUserResponseCommand source) {
        if ( source == null ) {
            return null;
        }

        GetUserResponse getUserResponse = new GetUserResponse();

        getUserResponse.setStatusCode( source.getStatusCode() );
        getUserResponse.setNo( source.getNo() );
        getUserResponse.setBranchCode( source.getBranchCode() );
        getUserResponse.setBusinessCategory( source.getBusinessCategory() );
        getUserResponse.setVerificationCode( source.getVerificationCode() );
        getUserResponse.setFirstName( source.getFirstName() );
        getUserResponse.setLastName( source.getLastName() );
        getUserResponse.setBirthday( source.getBirthday() );
        getUserResponse.setEmail( source.getEmail() );
        getUserResponse.setPhone( source.getPhone() );

        return getUserResponse;
    }
}
