package Resource;

public enum EnumResource {
	
	AddPlaceApi("/maps/api/place/add/"),
	GetPlace("/maps/api/place/get/json"),
	DeletePlaceApi("/maps/api/place/delete/");
	private String resource;
	
	 EnumResource(String resource) {
		// TODO Auto-generated constructor stub
		 this.resource=resource;
	}
	 
	 public String getResourceAPI() {
		 return resource;
	 }
}
