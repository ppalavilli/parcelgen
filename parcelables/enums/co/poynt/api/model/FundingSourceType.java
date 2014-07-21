package co.poynt.api.model;

public enum FundingSourceType {

	CHEQUE("C"),
	CREDIT_DEBIT("R"),
	CASH("A");
	
	private String type;
	
	FundingSourceType(String type) {
		this.type = type;
	}
	public String type() {
		return this.type;
	}

	// if enum list gets really large we can use a HashMap
	// based solution.  but for small lists this is good enough
	public static FundingSourceType findByType(String type){
	    for(FundingSourceType v : values()){
	        if( v.type().equals(type)){
	            return v;
	        }
	    }
	    return null;
	}
}
