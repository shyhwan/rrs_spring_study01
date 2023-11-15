package kr.co.rrs.vo;

public class UserVo {
	private String userId;
	private String userNm;
	private String userPw;
	private int hpNum;
	private String email;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getHpNum() {
		return hpNum;
	}
	public void setHpNum(int hpNum) {
		this.hpNum = hpNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
