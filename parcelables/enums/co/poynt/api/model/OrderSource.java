package co.poynt.api.model;

public enum OrderSource {
	INSTORE("I"),
	WEB("W"),
	MOBILE("M"),
	CALLIN("L"),
	CATALOG("T");
	
	private String source;
	
	OrderSource(String source) {
		this.source = source;
	}
	public String source() {
		return this.source;
	}

	// if enum list gets really large we can use a HashMap
	// based solution.  but for small lists this is good enough
	public static OrderSource findBySource(String source){
		for(OrderSource v : values()){
	        if( v.source().equals(source)){
	            return v;
	        }
	    }
	    return null;
	}
}
