package Resource;

public class CRUDResource {

	String addPlace = "/maps/api/place/add/json";
	String getPlace ="/maps/api/place/get/json";
	String deletePlace="/maps/api/place/delete/json";
	
	public String addPlaceApi() {
		return addPlace;
	}
	public String deletePlaceApi() {
		return deletePlace;
	}
}
