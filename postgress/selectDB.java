public class SelectDB {
	DBConnection con = new DBConnection();

	public void selectDB() {

		String SQL = "select campoA from tabela";
		try (Connection conn = con.DBConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL)) {
			displayResult(rs);
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private void displayResult(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.println(rs.getString("campoA"));

		}
	}
}