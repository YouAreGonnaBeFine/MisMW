package check;

import resource.Presenter;
import http.HttpRequest;
import net.sf.json.JSONObject;

public class DouyuTV {
	
	public static final String DOUYU_STATUS_ONLINE = "1";
	
	public static final String DOUYU_STATUS_OFFLINE = "2";

	public static void main(String[] args) {
		
		String url = "http://open.douyucdn.cn/api/RoomApi/room/9401";
		String game = "";
		String param = "";
		String result = HttpRequest.sendGameStatus(url, game, param);
		
		JSONObject objData = JSONObject.fromObject(result);

		JSONObject objRoom = objData.getJSONObject("data");
		
		String status = objRoom.getString("room_status");
		
		if(status!=null&&status.equals(DouyuTV.DOUYU_STATUS_ONLINE)){
			
			System.out.println("onLine");
		}else{
			
			System.out.println("offLine");
		}
	}

	
	public Presenter check(Presenter p){
		
		String url = "http://open.douyucdn.cn/api/RoomApi/room/"+p.getId();
		String game = "";
		String param = "";
		String result = HttpRequest.sendGameStatus(url, game, param);
		
		JSONObject objData = JSONObject.fromObject(result);

		JSONObject objRoom = objData.getJSONObject("data");
		
		String status = objRoom.getString("room_status");
		String title = objRoom.getString("room_name");
		
		if(status!=null&&status.equals(DouyuTV.DOUYU_STATUS_ONLINE)){
			
			p.setOnLine(true);
			p.setTitle(title);
		}else{
			
			p.setOnLine(false);
		}		
		
		return p;
	}
}
