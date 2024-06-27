package server;

public class Bugs {

	private int id;
	private String title;
	private String description;
	private String status;
	private int assigned_to;
	public Bugs(String title, String description, String status, int assigned_to) {
		super();
		this.title = title;
		this.description = description;
		this.status = status;
		this.assigned_to = assigned_to;
	}
	@Override
	public String toString() {
		return "Bugs [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", assigned_to=" + assigned_to + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(int assigned_to) {
		this.assigned_to = assigned_to;
	}
	public Bugs()
	{
		
	}
	
	
	
}
