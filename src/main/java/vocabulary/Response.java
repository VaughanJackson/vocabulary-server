package vocabulary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Basic response providing an indication as to
 * whether the response was handled successfully or not.
 * @author vaughanjackson
 */
/*@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor*/
public class Response {
	
	/** Flag indicating whether the request was handled successfully or not. */
	private boolean isSuccess;

	// TODO 1 Find out why I had to add these methods manually to get JSON serialization
	//        to work correctly, despite using above Lombok annotations.
    public Response(final boolean isSuccess) {
        super();
        this.isSuccess = isSuccess;
    }
    
    public Response() {
        super();
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(final boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
	
}
