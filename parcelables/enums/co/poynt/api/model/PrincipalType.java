package co.poynt.api.model;

public enum PrincipalType {
	CUSTOMER("C"),
	BUSINESS_USER("B"),
	DEVELOPER("D"),
	ADMIN_USER("A"),
	EXTERNAL_ADMIN("E"),
	DEVICE("V"),
	APPLICATION("P");
	
	private String type;
	
	PrincipalType(String type) {
		this.type = type;
	}
	public String type() {
		return this.type;
	}

	public static PrincipalType findByType(String type){
	    for(PrincipalType v : values()){
	        if( v.type().equals(type)){
	            return v;
	        }
	    }
	    return null;
	}
	
	public static boolean isDeviceId(String id) {
		return id.startsWith("urn:tid");
	}
	
	public static boolean isSensorId(String id) {
		return id.startsWith("urn:sid");
	}

	public static boolean isApplicationId(String id) {
		return id.startsWith("urn:aid");
	}
}
