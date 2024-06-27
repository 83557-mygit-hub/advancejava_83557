package server;

public class Members {
	
	private int id;
	private String name;
	private String designation;
	
	public Members()
	{
		
	}

	@Override
	public String toString() {
		return "Members [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}

	public Members(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
