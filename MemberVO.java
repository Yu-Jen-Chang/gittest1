package com.member.model;

import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;
import java.util.Arrays;

public class MemberVO implements Serializable{
	private Integer memno;
	private String name;
	private String nkname;
	private String sex;
	private Date birth;
	private String email;
	private String tel;
	private String phone;
	private String city;
	private String dist;
	private String adr;
	private Integer height;
	private Integer weight;
	private String school;
	private String job;
	private String salary;
	private String intro;
	private String orien;
	private String rel;
	private String favor;
	private String username;
	private String pw;
	private byte[] icon;
	private Integer coin;
	private String rate;
//	private Integer status;
	private Timestamp logintime;
	private String loc;
	private Integer continuedays;

	
	public Integer getMemno() {
		return memno;
	}
	public void setMemno(Integer memno) {
		this.memno = memno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNkname() {
		return nkname;
	}
	public void setNkname(String nkname) {
		this.nkname = nkname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getOrien() {
		return orien;
	}
	public void setOrien(String orien) {
		this.orien = orien;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getFavor() {
		return favor;
	}
	public void setFavor(String favor) {
		this.favor = favor;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public byte[] getIcon() {
		return icon;
	}
	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	public Integer getCoin() {
		return coin;
	}
	public void setCoin(Integer coin) {
		this.coin = coin;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Timestamp getLogintime() {
		return logintime;
	}
	public void setLogintime(Timestamp logintime) {
		this.logintime = logintime;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Integer getContinuedays() {
		return continuedays;
	}
	public void setContinuedays(Integer continuedays) {
		this.continuedays = continuedays;
	}
	@Override
	public String toString() {
		return "MemberVO [memno=" + memno + ", name=" + name + ", nkname=" + nkname + ", sex=" + sex + ", birth="
				+ birth + ", email=" + email + ", tel=" + tel + ", phone=" + phone + ", city=" + city + ", dist=" + dist
				+ ", adr=" + adr + ", height=" + height + ", weight=" + weight + ", school=" + school + ", job=" + job
				+ ", salary=" + salary + ", intro=" + intro + ", orien=" + orien + ", rel=" + rel + ", favor=" + favor
				+ ", username=" + username + ", pw=" + pw + ", icon=" + Arrays.toString(icon) + ", coin=" + coin
				+ ", rate=" + rate + ", status=" + status + ", logintime=" + logintime + ", loc=" + loc
				+ ", continuedays=" + continuedays + "]";
	}
	
}
