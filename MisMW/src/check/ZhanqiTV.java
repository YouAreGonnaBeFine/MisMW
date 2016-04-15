package check;

import http.HttpRequest;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import room.ZhanQiRoom;

public class ZhanqiTV {

	public static void main(String[] args) {
		String url = "http://www.zhanqi.tv/api/static/game.lives/9/500-1.json";
		String game = "";
		String param = "";
		String result = HttpRequest.sendGameStatus(url, game, param);

		JSONObject objResult = JSONObject.fromObject(result);

		JSONObject objData = objResult.getJSONObject("data");
		
		JSONArray ArrRoom = objData.getJSONArray("rooms");

		List<ZhanQiRoom> roomList = new ArrayList<ZhanQiRoom>();
		
		
		
		for (int i = 0; i < ArrRoom.size(); i++) {
			
			ZhanQiRoom room = new ZhanQiRoom();
			
			room.setId(ArrRoom.getJSONObject(i).getString("id"));
			room.setNickname(ArrRoom.getJSONObject(i).getString("nickname"));
			room.setTitle(ArrRoom.getJSONObject(i).getString("title"));
			System.out.println(room.getNickname()+"-正在直播！");
			roomList.add(room);
		}
		
		System.out.println("查询结束");
	}

}
