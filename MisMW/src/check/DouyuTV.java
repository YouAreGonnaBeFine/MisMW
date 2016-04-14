package check;

import http.HttpRequest;
import net.sf.json.JSONObject;

public class DouyuTV {

	public static void main(String[] args) {
		
		String url = "http://open.douyucdn.cn/api/RoomApi/room/9401";
		String game = "";
		String param = "";
		String result = HttpRequest.sendGameStatus(url, game, param);
		
		JSONObject objData = JSONObject.fromObject(result);

		JSONObject objRoom = objData.getJSONObject("data");
		
		String status = objRoom.getString("room_status");
		
		if(status!=null&&status.equals("1")){
			
			System.out.println("onLine");
		}else{
			
			System.out.println("offLine");
		}
	}

}
