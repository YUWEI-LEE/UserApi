package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class GetUserResponse {

	//前端傳進來如果為null，這個值就不用傳進來
	@JsonInclude(Include.NON_NULL)
	private String statusCode;

	private String no;

	private String branchCode;

	private String businessCategory;

	private String verificationCode;

	private String firstName;

	private String lastName;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date birthday;

	private String email;

	private String phone;





}
