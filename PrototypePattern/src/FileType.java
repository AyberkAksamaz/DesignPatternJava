
public class FileType {

	private long id;
	private String name;
	
	public FileType() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FileType [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
