
public class File {

	private long id;
	private String name;
	private FileType fileType;
	private Category category;
	private String data;
	
	public File() {
		
	}

	public File(long id, String name, FileType fileType, Category category, String data) {
		super();
		this.id = id;
		this.name = name;
		this.fileType = fileType;
		this.category = category;
		this.data = data;
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

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "File "
				+ "id=" + id + "\n" +
				"name=" + name + "\n" +
				"fileType=" + fileType + "\n" +
				"category=" + category + "\n" +
				"data="+ data + "\n";
	}
	
	
}
