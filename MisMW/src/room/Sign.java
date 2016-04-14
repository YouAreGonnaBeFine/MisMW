package room;

public class Sign {

	public Sign(String id,String name) {
		
		this.name = name;
		this.id = id;
	}

	private String id;
	
	private String name;
	
	private boolean isOnLine = false;

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

	public boolean isOnLine() {
		return isOnLine;
	}

	public void setOnLine(boolean isOnLine) {
		this.isOnLine = isOnLine;
	}

}
