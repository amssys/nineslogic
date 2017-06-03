package nines.logic.main;

public class InputRequests {

	private String requestId;

	private NinesRequest requestParameters;

	private String sourceId;

	private String stage;

	private String user;

	private String userAgent;

	private String userArn;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public NinesRequest getRequestParameters() {
		return requestParameters;
	}

	public void setRequestParameters(NinesRequest requestParameters) {
		this.requestParameters = requestParameters;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getUserArn() {
		return userArn;
	}

	public void setUserArn(String userArn) {
		this.userArn = userArn;
	}
}
