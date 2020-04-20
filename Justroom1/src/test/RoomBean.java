package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RoomBean implements Serializable 
{ 
	private String rowner,rmtname,rmtnbr,raddr;
	private Long phno;
	public RoomBean(){}
	public String getRowner() {
		return rowner;
	}
	public void setRowner(String rowner) {
		this.rowner = rowner;
	}
	public String getRmtname() {
		return rmtname;
	}
	public void setRmtname(String rmtname) {
		this.rmtname = rmtname;
	}
	public String getRmtnbr() {
		return rmtnbr;
	}
	public void setRmtnbr(String rmtnbr) {
		this.rmtnbr = rmtnbr;
	}
	public String getRaddr() {
		return raddr;
	}
	public void setRaddr(String raddr) {
		this.raddr = raddr;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}

}
