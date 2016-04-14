package inspect;

import java.util.ArrayList;
import java.util.List;

import room.DouYuRoom;
import room.Sign;
import http.HttpRequest;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Inspect {

	public static void main(String[] args) {

		String url = "http://open.douyucdn.cn/api/RoomApi/live/";
		String game = "HOW";
		String param = "limit=99";
		String result = HttpRequest.sendGameStatus(url, game, param);

		JSONObject objRoom = JSONObject.fromObject(result);

		JSONArray ArrRoom = objRoom.getJSONArray("data");

		List<DouYuRoom> roomList = new ArrayList<DouYuRoom>();

		for (int i = 0; i < ArrRoom.size(); i++) {

			DouYuRoom room = new DouYuRoom();

			room.setRoom_id(ArrRoom.getJSONObject(i).getString("room_id"));
			room.setRoom_src(ArrRoom.getJSONObject(i).getString("room_src"));
			room.setCate_id(ArrRoom.getJSONObject(i).getString("cate_id"));
			room.setRoom_name(ArrRoom.getJSONObject(i).getString("room_name"));
			room.setOwner_uid(ArrRoom.getJSONObject(i).getString("owner_uid"));
			room.setOnline(ArrRoom.getJSONObject(i).getString("online"));
			room.setNickname(ArrRoom.getJSONObject(i).getString("nickname"));
			room.setUrl(ArrRoom.getJSONObject(i).getString("url"));
			room.setGame_url(ArrRoom.getJSONObject(i).getString("game_url"));
			room.setGame_name(ArrRoom.getJSONObject(i).getString("game_name"));

			roomList.add(room);
		}

		List<Sign> signedList = new ArrayList<Sign>();

		signedList.add(new Sign("32892", "涛妹"));
		signedList.add(new Sign("16789", "安德罗妮"));
		signedList.add(new Sign("13861", "不二"));

		for (int i = 0; i < signedList.size(); i++) {

			for (int j = 0; j < roomList.size(); j++) {

				if (signedList.get(i).getId().equals(roomList.get(j).getRoom_id())) {
					signedList.get(i).setOnLine(true);
					continue;
				}

			}

		}
		
		
		
		for (int i = 0; i < signedList.size(); i++){
			if(signedList.get(i).isOnLine())
				System.out.println(signedList.get(i).getName() + "正在直播");
		}
		System.out.println("----------------------");
		for (int i = 0; i < signedList.size(); i++){
			if(!signedList.get(i).isOnLine())
				System.out.println(signedList.get(i).getName() + "已经离线");
		}		
		
		
		

	}

}
