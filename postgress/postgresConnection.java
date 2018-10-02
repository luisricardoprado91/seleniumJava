public class DBConnection {
private String url;
	private String user;
	private String password;
	private Connection con = null;

	public Connection DBConnection() {
		url = "jdbc:postgresql://localhost:442/nomedobanco";
		user = "usuario";
		password = "senha";

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
}