package resource;

import java.util.ArrayList;
import java.util.List;

public class Resource {

	private List<Presenter> lisPresenter = new ArrayList<Presenter>();

	public List<Presenter> initPresenterList() {

		lisPresenter.add(new Presenter("D", "16789", "��������"));
		lisPresenter.add(new Presenter("D", "57321", "bill"));
		lisPresenter.add(new Presenter("P", "10003", "����"));
		lisPresenter.add(new Presenter("P", "10027", "����"));
		lisPresenter.add(new Presenter("Z", "12063", "����"));

		return lisPresenter;
	}

	public List<Presenter> getLisPresenter() {
		return lisPresenter;
	}

}
