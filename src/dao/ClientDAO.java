package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientDAO extends DAO{
	private String nom;
	private String prenom;
	
	public ClientDAO(){
		super();
	}

	public boolean identification(String nom, String prenom){
		Connection con;
		try {
			con = this.getConnection();
			Statement st = con.createStatement();
			PreparedStatement pst = con.prepareStatement("SELECT COUNT(*) FROM PARTICULIER WHERE NOM = ? AND PRENOM = ?");
			pst.setString(1, nom);
			pst.setString(2, prenom);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				if(rs.getInt(1)==1)
					return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
