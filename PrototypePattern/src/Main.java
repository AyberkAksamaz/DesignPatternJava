
public class Main {

	public static void main(String[] args) {
		GenelEntityService service = new GenelEntityService();
		
		File file = service.findFileById(1L);
		System.out.println(file);
	}

}
