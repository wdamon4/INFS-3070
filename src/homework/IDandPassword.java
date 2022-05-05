package homework;

import java.util.HashMap;

public class IDandPassword {

	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPassword(){
		
		logininfo.put("uccs", "1234");
		
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
	
}
