package com.action;

public class StrutsAction {
 private String name;
 private String psw;
 private User user;	
 private  String msg;

	public String execute(){
		msg="后台向页面传递的值";
		
		System.out.println("最简单的struts程序");
		System.out.println("name==>"+name);
		System.out.println("pse==>"+psw);
		System.out.println("name1==>"+user.getName1().toString());
		System.out.println("psw1==>"+user.getPsw1().toString());
		return "success";
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
