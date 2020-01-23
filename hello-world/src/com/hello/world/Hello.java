package com.hello.world;

public class Hello {

	 private String message = "JSF WEB PROJECT USING JAVAX-FACES-2.4.0.JAR";
	 
	 
	 private String text = "JSF Web project demo";
	 
     private String line ="Please use the link mentioned in the description box to download the code/project";
     
     private String email;
     
     private String password;
     
     private String rememberMe;
     
    private String errormessage;
    
    
    
	public String getErrormessage() {
		return errormessage;
	}


	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}


	public String getRememberMe() {
		return rememberMe;
	}


	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line = line;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}
	 
	 
	
	
	public String login() {
		
		
		System.out.println("Login clicked"  );
		
		System.out.println("Entered email : " + getEmail());
		
		System.out.println("Entered password : " + getPassword()  );
		
		System.out.println("Is remember : " + getRememberMe());
		
		
		if(getEmail()!=null && getPassword()!=null) {
			
			if(getPassword()=="admin123") {
				setErrormessage("");
			}else {
				setErrormessage("Incorrect password!!");
			}
			
		}
		
		return "";
	}
	 
	
}
