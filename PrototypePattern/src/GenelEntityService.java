
public class GenelEntityService {

	public FileType findFileTypeId(Long id) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		FileType fileType = new FileType();
		fileType.setId(id);
		
		String name;
		if (id.compareTo(1L) == 0) {
			name = "Personal";
		} else if (id.compareTo(2L) == 0) {
			name = "Corparate";
		} else {
			name = "Genel";
		}
		
		fileType.setName(name);
		
		return fileType;
	}
	
	public Category findCategoryId(Long id) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Category category = new Category();
		category.setId(id);
		
		String name;
		if (id.compareTo(1L) == 0) {
			name = "Private";
		} else if (id.compareTo(2L) == 0) {
			name = "Business";
		} else {
			name = "Genel";
		}
		
		category.setName(name);
		
		return category;
	}
	
	
	public File findFileById(Long id) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		File file = new File();
		file.setId(id);
		file.setFileType(findFileTypeId(id));
		file.setCategory(findCategoryId(id));
		
		String name;
		String data;
		if (id.compareTo(1L) == 0) {
			name = "Letter";
			data = "Dear Gandalf....!";
		} else if (id.compareTo(2L) == 0) {
			name = "Report";
			data = "According to report .....";
		} else {
			name = "Rules";
			data = "Bla bla lba..";
		}
		
		file.setData(data);
		file.setName(name);
		
		return file;
	}
}
