package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.DeleteUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUsersResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.UpdateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.UpdateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.DeleteUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.DeleteUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.UpdateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.UpdateUserResponseCommand;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-03T15:06:23+0800",
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
    public GetUserRequestCommand toGetUserRequestCommand(String branchCode, String no) {
        if ( branchCode == null && no == null ) {
            return null;
        }

        GetUserRequestCommand getUserRequestCommand = new GetUserRequestCommand();

        getUserRequestCommand.setBranchCode( branchCode );
        getUserRequestCommand.setNo( no );

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

    @Override
    public DeleteUserRequestCommand toDeleteUserRequestCommand(String branchCode, String no) {
        if ( branchCode == null && no == null ) {
            return null;
        }

        DeleteUserRequestCommand deleteUserRequestCommand = new DeleteUserRequestCommand();

        deleteUserRequestCommand.setBranchCode( branchCode );
        deleteUserRequestCommand.setNo( no );

        return deleteUserRequestCommand;
    }

    @Override
    public DeleteUserResponse toDeleteUserResponse(DeleteUserResponseCommand source) {
        if ( source == null ) {
            return null;
        }

        DeleteUserResponse deleteUserResponse = new DeleteUserResponse();

        deleteUserResponse.setStatusCode( source.getStatusCode() );

        return deleteUserResponse;
    }

    @Override
    public UpdateUserRequestCommand toUpdateUserRequestCommand(String no, UpdateUserRequest source) {
        if ( no == null && source == null ) {
            return null;
        }

        UpdateUserRequestCommand updateUserRequestCommand = new UpdateUserRequestCommand();

        if ( source != null ) {
            updateUserRequestCommand.setBranchCode( source.getBranchCode() );
            updateUserRequestCommand.setBusinessCategory( source.getBusinessCategory() );
            updateUserRequestCommand.setVerificationCode( source.getVerificationCode() );
            updateUserRequestCommand.setFirstName( source.getFirstName() );
            updateUserRequestCommand.setLastName( source.getLastName() );
            updateUserRequestCommand.setBirthday( source.getBirthday() );
            updateUserRequestCommand.setEmail( source.getEmail() );
            updateUserRequestCommand.setPhone( source.getPhone() );
        }
        updateUserRequestCommand.setNo( no );

        return updateUserRequestCommand;
    }

    @Override
    public UpdateUserResponse toUpdateUserResponse(UpdateUserResponseCommand source) {
        if ( source == null ) {
            return null;
        }

        UpdateUserResponse updateUserResponse = new UpdateUserResponse();

        updateUserResponse.setStatusCode( source.getStatusCode() );
        updateUserResponse.setNo( source.getNo() );
        updateUserResponse.setBranchCode( source.getBranchCode() );
        updateUserResponse.setBusinessCategory( source.getBusinessCategory() );
        updateUserResponse.setVerificationCode( source.getVerificationCode() );
        updateUserResponse.setFirstName( source.getFirstName() );
        updateUserResponse.setLastName( source.getLastName() );
        updateUserResponse.setBirthday( source.getBirthday() );
        updateUserResponse.setEmail( source.getEmail() );
        updateUserResponse.setPhone( source.getPhone() );

        return updateUserResponse;
    }

    @Override
    public GetUsersResponse toGetUsersResponse(GetUsersResponseCommand source) {
        if ( source == null ) {
            return null;
        }

        GetUsersResponse getUsersResponse = new GetUsersResponse();

        getUsersResponse.setStatusCode( source.getStatusCode() );
        getUsersResponse.setUsers( getUserResponseCommandListToGetUserResponseList( source.getUsers() ) );

        return getUsersResponse;
    }

    @Override
    public GetUsersRequestCommand toGetUsersRequestCommand(String branchCode) {
        if ( branchCode == null ) {
            return null;
        }

        GetUsersRequestCommand getUsersRequestCommand = new GetUsersRequestCommand();

        getUsersRequestCommand.setBranchCode( branchCode );

        return getUsersRequestCommand;
    }

    protected List<GetUserResponse> getUserResponseCommandListToGetUserResponseList(List<GetUserResponseCommand> list) {
        if ( list == null ) {
            return null;
        }

        List<GetUserResponse> list1 = new ArrayList<GetUserResponse>( list.size() );
        for ( GetUserResponseCommand getUserResponseCommand : list ) {
            list1.add( toGetUserResponse( getUserResponseCommand ) );
        }

        return list1;
    }
}
