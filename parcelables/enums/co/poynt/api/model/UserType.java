package co.poynt.api.model;
//Use co.poynt.security.api.PrincipalType instead
@Deprecated
public enum UserType {

	CUSTOMER("C"),
	BUSINESS_USER("B"),
	DEVELOPER("D"),
	ADMIN_USER("A"),
	EXTERNAL_ADMIN("E"),
	ACQUIRER("Q"),
	DEVICE("V"),
	APPLICATION("P");
	
	private String type;
	
	UserType(String type) {
		this.type = type;
	}
	public String type() {
		return this.type;
	}

	// if enum list gets really large we can use a HashMap
	// based solution.  but for small lists this is good enough
	public static UserType findByType(String type){
	    for(UserType v : values()){
	        if( v.type().equals(type)){
	            return v;
	        }
	    }
	    return null;
	}
}
