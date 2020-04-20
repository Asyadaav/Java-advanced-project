package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RegBean implements Serializable 
{
private String uName,pWord,fName,lName,addr,mId;
private Long phno;
public RegBean(){}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public String getpWord() {
	return pWord;
}
public void setpWord(String pWord) {
	this.pWord = pWord;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getmId() {
	return mId;
}
public void setmId(String mId) {
	this.mId = mId;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno2) {
	this.phno = phno2;
}
}
