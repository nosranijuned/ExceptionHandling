
public class EHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int di = 100/0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Code is running.............");
		}
	}
}
