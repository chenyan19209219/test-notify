package exception;

public interface ErrorCode {

    int COMMON_ERROR_CODE_START = 1000;

    int PLATFORM_ERROR_CODE_START = COMMON_ERROR_CODE_START + 1000;
    int PLATFORM_ERROR_CODE_START2 = COMMON_ERROR_CODE_START + 1000;

    int ADMIN_ERROR_CODE1 = COMMON_ERROR_CODE_START + 4000;
    int ADMIN_ERROR_CODE2 = COMMON_ERROR_CODE_START + 4000;

}
