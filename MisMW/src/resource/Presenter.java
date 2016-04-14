package resource;

public class Presenter {
	
	public Presenter(String platform, String id, String name) {
		super();
		this.platform = platform;
		this.id = id;
		this.name = name;
	}

	private String platform;

	private String id;

	private String name;

	private String title;

	private boolean isOnLine;

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isOnLine() {
		return isOnLine;
	}

	public void setOnLine(boolean isOnLine) {
		this.isOnLine = isOnLine;
	}
	
	
	

}
