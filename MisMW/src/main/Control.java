package main;

import java.util.List;

import check.DouyuTV;
import check.PandaTV;
import resource.Presenter;
import resource.Resource;

public class Control {

	public static void main(String[] args) {

		DouyuTV d = new DouyuTV();
		PandaTV p = new PandaTV();

		Resource r = new Resource();
		r.initPresenterList();
		List<Presenter> lisPresenter = r.getLisPresenter();

		for (Presenter presenter : lisPresenter) {

			if (presenter.getPlatform().equals("P")) {
				p.check(presenter);

			}
			if (presenter.getPlatform().equals("D")) {
				d.check(presenter);
			}

		}

		System.out.println();

	}

	public List<Presenter> getPresenterLis() {

		DouyuTV d = new DouyuTV();
		PandaTV p = new PandaTV();

		Resource r = new Resource();
		r.initPresenterList();
		List<Presenter> lisPresenter = r.getLisPresenter();

		for (Presenter presenter : lisPresenter) {

			if (presenter.getPlatform().equals("P")) {
				p.check(presenter);

			}
			if (presenter.getPlatform().equals("D")) {
				d.check(presenter);
			}

		}

		return lisPresenter;
	}

}
