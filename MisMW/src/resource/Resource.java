package resource;

import java.util.ArrayList;
import java.util.List;

public class Resource {
	
	private static List<Presenter> lisPresenter = new ArrayList<Presenter>();
	
	
	public static List<Presenter> initPresenterList(){
		
		lisPresenter.add(new Presenter("D","16789","°²µÂÂŞÄİ"));
		lisPresenter.add(new Presenter("D","57321","bill"));
		lisPresenter.add(new Presenter("P","10003","ĞÇËÕ"));
		lisPresenter.add(new Presenter("P","10027","ÍßÄï"));
		lisPresenter.add(new Presenter("Z","12063","»ªÍÓ"));
		
		return lisPresenter;
	}

	public static List<Presenter> getLisPresenter() {
		return lisPresenter;
	}

}
