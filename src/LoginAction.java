import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userName;
	private String password;
	private String message;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() {
		if (userName.equals("jft") && (password.equals("jft"))) {
			message = "welcome " + userName;
			return Action.SUCCESS;
		} else {
			addActionError("Not a valid user");
			return Action.LOGIN;
		}
	}

	public void validate() {
		if (userName == null || userName.trim().equals(""))
			addFieldError(userName, "User Name can not be blank");
		if (password == null || password.trim().equals(""))
			addFieldError(password, "Password can not be blank");
	}

}
