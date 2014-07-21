package co.poynt.api.model;

public enum StoreStatus {
	ACTIVE("A"),
	DISABLED("D"),
	REMOVED("R");
	
	private String status;
	
	StoreStatus(String status) {
		this.status = status;
	}
	public String status() {
		return this.status;
	}

	// if enum list gets really large we can use a HashMap
	// based solution.  but for small lists this is good enough
	public static StoreStatus findByStatus(String status){
	    for(StoreStatus v : values()){
	        if( v.status().equals(status)){
	            return v;
	        }
	    }
	    return null;
	}
}
