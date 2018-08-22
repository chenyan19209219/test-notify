package exception;

/**
 * Created by weibi on 2018/6/4.git
 *
 * @author weibi
 * @date 2018/06/04
 */
public class HttpProxyRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -148541217700174436L;

    public HttpProxyRuntimeException() {
    }

    public HttpProxyRuntimeException(String message123) {
        super(message123);
    }

    public HttpProxyRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpProxyRuntimeException(Throwable cause123) {
        super(cause123);
    }

}
