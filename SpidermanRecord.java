
public class SpidermanRecord {
	
	private String name;
	private int issueNum;
	private String issueDate;
	private String issueName;
	private Double issueValue;
	private String mintCond;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(int issueNum) {
		this.issueNum = issueNum;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueName() {
		return issueName;
	}
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}
	public Double getIssueValue() {
		return issueValue;
	}
	public void setIssueValue(Double IssueValue) {
		this.issueValue = IssueValue;
	}
	public String getMintCond() {
		return mintCond;
	}
	public void setMintCond(String mintCond) {
		this.mintCond = mintCond;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(issueNum);
		sb.append(issueDate);
		sb.append(issueName);
		sb.append(issueValue);
		sb.append(mintCond);
		sb.append( System.getProperty("line seperator"));
		return sb.toString();
	}
}

	
