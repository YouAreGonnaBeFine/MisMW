package resource;

import java.util.ArrayList;
import java.util.List;

public class Resource {

	private List<Presenter> lisPresenter = new ArrayList<Presenter>();

	public List<Presenter> initPresenterList() {

		lisPresenter.add(new Presenter("D", "16789", "安德罗妮"));
		lisPresenter.add(new Presenter("D", "57321", "bill"));
		lisPresenter.add(new Presenter("P", "10003", "星苏"));
		lisPresenter.add(new Presenter("P", "10027", "瓦娘"));
		lisPresenter.add(new Presenter("Z", "12063", "华陀"));

		return lisPresenter;
	}

	public List<Presenter> getLisPresenter() {
		return lisPresenter;
	}

}
