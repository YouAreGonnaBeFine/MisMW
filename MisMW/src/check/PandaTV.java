package check;

import resource.Presenter;
import net.sf.json.JSONObject;
import http.HttpRequest;

public class PandaTV {

	public static void main(String[] args) {

		String url = "http://api.m.panda.tv/ajax_get_liveroom_baseinfo";
		String game = "";
		String param = "roomid=10029";
		String result = HttpRequest.sendGameStatus(url, game, param);

		JSONObject objResult = JSONObject.fromObject(result);

		JSONObject objData = objResult.getJSONObject("data");

		JSONObject objInfo = objData.getJSONObject("info");

		JSONObject objVideo = objInfo.getJSONObject("videoinfo");

		String status = objVideo.getString("status");

		if (status != null && status.equals("2")) {
			System.out.println("onLine");
		} else {

			System.out.println("offLine");
		}
	}

	public Presenter check(Presenter p) {

		String url = "http://api.m.panda.tv/ajax_get_liveroom_baseinfo";
		String game = "";
		String param = "roomid=" + p.getId();
		String result = HttpRequest.sendGameStatus(url, game, param);

		JSONObject objResult = JSONObject.fromObject(result);

		JSONObject objData = objResult.getJSONObject("data");

		JSONObject objInfo = objData.getJSONObject("info");

		JSONObject objVideo = objInfo.getJSONObject("videoinfo");
		JSONObject objRoom = objInfo.getJSONObject("roominfo");

		String status = objVideo.getString("status");
		String title = objRoom.getString("name");

		if (status != null && status.equals("2")) {
			p.setOnLine(true);
			p.setTitle(title);
			System.out.println("onLine");
		} else {
			p.setOnLine(false);
			System.out.println("offLine");
		}

		return p;
	}

}
