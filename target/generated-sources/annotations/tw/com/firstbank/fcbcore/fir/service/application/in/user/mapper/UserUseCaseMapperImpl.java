package tw.com.firstbank.fcbcore.fir.service.application.in.user.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.CreateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.DeleteUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.GetUsersRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.UpdateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.application.in.user.api.UpdateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.domain.user.User;
import tw.com.firstbank.fcbcore.fir.service.domain.user.UserId;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-03T15:06:23+0800",
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

    @Override
    public User toUserEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDtoToUserId( dto ) );
        user.setBusinessCategory( dto.getBusinessCategory() );
        user.setVerificationCode( dto.getVerificationCode() );
        user.setFirstName( dto.getFirstName() );
        user.setLastName( dto.getLastName() );
        user.setBirthday( dto.getBirthday() );
        user.setEmail( dto.getEmail() );
        user.setPhone( dto.getPhone() );

        return user;
    }

    @Override
    public UserDto toUserDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setNo( entityIdNo( entity ) );
        userDto.setBranchCode( entityIdBranchCode( entity ) );
        userDto.setBusinessCategory( entity.getBusinessCategory() );
        userDto.setVerificationCode( entity.getVerificationCode() );
        userDto.setFirstName( entity.getFirstName() );
        userDto.setLastName( entity.getLastName() );
        userDto.setBirthday( entity.getBirthday() );
        userDto.setEmail( entity.getEmail() );
        userDto.setPhone( entity.getPhone() );

        return userDto;
    }

    @Override
    public UserDto toUserDto(GetUserRequestCommand source) {
        if ( source == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setNo( source.getNo() );
        userDto.setBranchCode( source.getBranchCode() );

        return userDto;
    }

    @Override
    public GetUserResponseCommand toGetUserResponseCommand(String statusCode, UserDto dto) {
        if ( statusCode == null && dto == null ) {
            return null;
        }

        GetUserResponseCommand getUserResponseCommand = new GetUserResponseCommand();

        if ( dto != null ) {
            getUserResponseCommand.setNo( dto.getNo() );
            getUserResponseCommand.setBranchCode( dto.getBranchCode() );
            getUserResponseCommand.setBusinessCategory( dto.getBusinessCategory() );
            getUserResponseCommand.setVerificationCode( dto.getVerificationCode() );
            getUserResponseCommand.setFirstName( dto.getFirstName() );
            getUserResponseCommand.setLastName( dto.getLastName() );
            getUserResponseCommand.setBirthday( dto.getBirthday() );
            getUserResponseCommand.setEmail( dto.getEmail() );
            getUserResponseCommand.setPhone( dto.getPhone() );
        }
        getUserResponseCommand.setStatusCode( statusCode );

        return getUserResponseCommand;
    }

    @Override
    public UserId toUserId(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserId userId = new UserId();

        userId.setNo( dto.getNo() );
        userId.setBranchCode( dto.getBranchCode() );

        return userId;
    }

    @Override
    public UserDto toUserDto(DeleteUserRequestCommand source) {
        if ( source == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setNo( source.getNo() );
        userDto.setBranchCode( source.getBranchCode() );

        return userDto;
    }

    @Override
    public UserDto toUserDto(UpdateUserRequestCommand source) {
        if ( source == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setNo( source.getNo() );
        userDto.setBranchCode( source.getBranchCode() );
        userDto.setBusinessCategory( source.getBusinessCategory() );
        userDto.setVerificationCode( source.getVerificationCode() );
        userDto.setFirstName( source.getFirstName() );
        userDto.setLastName( source.getLastName() );
        userDto.setBirthday( source.getBirthday() );
        userDto.setEmail( source.getEmail() );
        userDto.setPhone( source.getPhone() );

        return userDto;
    }

    @Override
    public UpdateUserResponseCommand toUpdateUserRequestCommand(String statusCode, UserDto dto) {
        if ( statusCode == null && dto == null ) {
            return null;
        }

        UpdateUserResponseCommand updateUserResponseCommand = new UpdateUserResponseCommand();

        if ( dto != null ) {
            updateUserResponseCommand.setNo( dto.getNo() );
            updateUserResponseCommand.setBranchCode( dto.getBranchCode() );
            updateUserResponseCommand.setBusinessCategory( dto.getBusinessCategory() );
            updateUserResponseCommand.setVerificationCode( dto.getVerificationCode() );
            updateUserResponseCommand.setFirstName( dto.getFirstName() );
            updateUserResponseCommand.setLastName( dto.getLastName() );
            updateUserResponseCommand.setBirthday( dto.getBirthday() );
            updateUserResponseCommand.setEmail( dto.getEmail() );
            updateUserResponseCommand.setPhone( dto.getPhone() );
        }
        updateUserResponseCommand.setStatusCode( statusCode );

        return updateUserResponseCommand;
    }

    @Override
    public UserDto toUserDto(GetUsersRequestCommand source) {
        if ( source == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setBranchCode( source.getBranchCode() );

        return userDto;
    }

    protected UserId userDtoToUserId(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserId userId = new UserId();

        userId.setNo( userDto.getNo() );
        userId.setBranchCode( userDto.getBranchCode() );

        return userId;
    }

    private String entityIdNo(User user) {
        if ( user == null ) {
            return null;
        }
        UserId id = user.getId();
        if ( id == null ) {
            return null;
        }
        String no = id.getNo();
        if ( no == null ) {
            return null;
        }
        return no;
    }

    private String entityIdBranchCode(User user) {
        if ( user == null ) {
            return null;
        }
        UserId id = user.getId();
        if ( id == null ) {
            return null;
        }
        String branchCode = id.getBranchCode();
        if ( branchCode == null ) {
            return null;
        }
        return branchCode;
    }
}
