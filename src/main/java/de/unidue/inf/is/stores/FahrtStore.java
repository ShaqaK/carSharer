package de.unidue.inf.is.stores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import de.unidue.inf.is.domain.fahrt;
import de.unidue.inf.is.utils.DBUtil;

public class FahrtStore {
	private Connection connection;
	private boolean complete;
	
	public FahrtStore() throws StoreException {
        try {
            connection = DBUtil.getConnection();
            connection.setAutoCommit(false);
        }
        catch (SQLException e) {
            throw new StoreException(e);
        }
    }
	public ArrayList<fahrt> getOffenfahrt(){
		ArrayList<fahrt> Result = new ArrayList<>();
		try {
			PreparedStatement preparedstatement = connection.prepareStatement("select * from fahrt where status = offen");
			ResultSet rst = preparedstatement.executeQuery();
			while(rst.next()) {
				fahrt tmpf = new fahrt(0,0,null,null,0,null,0,0,null,0);
				tmpf.setFid(rst.getInt("fid"));
				tmpf.setFahrtkosten(rst.getInt("fahrtkosten"));
				tmpf.setStartort(rst.getString("startort"));
				tmpf.setZielort(rst.getString("zielort"));
				tmpf.setMaxPlaetze(rst.getInt("maxPlaetze"));
				tmpf.setBeschreibung(rst.getString("beschreibung"));
				tmpf.setTransportmittel(rst.getInt("transportmittel"));
				tmpf.setAnbieter(rst.getInt("anbieter"));
				tmpf.setStatus(rst.getString("status"));
				tmpf.setFahrtdatumzeit(rst.getTimestamp("fahrtdatumzeit"));
				Result.add(tmpf);
			}
				
			} catch(SQLException e){
				e.printStackTrace();
			}
			return Result;
			}
	

}

