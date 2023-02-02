package tw.com.firstbank.fcbcore.fir.service.application.in.core;

import java.util.List;

public interface UserCaseApi <T extends RequestCommand,K extends ResponseCommand>{

	K execute(T command);
}
