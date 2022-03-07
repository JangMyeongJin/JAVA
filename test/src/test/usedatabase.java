package test;

public class usedatabase {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("connect");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("Error loading driver: " + cnfe);
		}
	}
}
