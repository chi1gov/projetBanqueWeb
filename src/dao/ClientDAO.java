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
	
	public String getAdresse(String nom, String prenom){
		Connection con;
		try {
			con = this.getConnection();
			PreparedStatement pst = con.prepareStatement("SELECT ADRESSE FROM PARTICULIER WHERE NOM = ? AND PRENOM = ?");
			pst.setString(1, nom);
			pst.setString(2, prenom);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				return rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void setAdresse(String nom, String prenom, String adresse){
		Connection con;
		try {
			con = this.getConnection();
			PreparedStatement pst = con.prepareStatement("UPDATE PARTICULIER SET ADRESSE=? WHERE NOM = ? AND PRENOM = ?");
			pst.setString(1, adresse);
			pst.setString(2, nom);
			pst.setString(3, prenom);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
