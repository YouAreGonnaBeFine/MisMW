package test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import http.HttpRequest;

public class PandaTV {
	
	public static void main(String[] args){
		
		String url = "http://api.m.panda.tv/ajax_get_liveroom_baseinfo";
		String game = "";
		String param = "roomid=10029";
		String result = HttpRequest.sendGameStatus(url, game, param);
		
		JSONObject objData = JSONObject.fromObject(result);

		JSONObject objRoom = objData.getJSONObject("data");
		
		JSONObject objInfo = objRoom.getJSONObject("info");
		
		JSONObject objVideo = objInfo.getJSONObject("videoinfo");
		
		String status = objVideo.getString("status");
		
		if(status!=null&&status.equals("2")){
			System.out.println("onLine");
		}else{
			
			System.out.println("offLine");
		}
		
		
		
	}

}
