package SQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLite {

	public static void main(String[] args) {
		
		
		Connection povezava = null;
		Statement stmt = null;
		
		try {
			
			Class.forName("org.sqlite.JDBC");
			
			//JDBC je za povezat s programom
			//"~/testnaBaza.db"  -> ~ je home folder
			povezava = DriverManager.getConnection("jdbc:sqlite:tesnaDB.db");
			
			String createDB = "CREATE TABLE osebe "+
							"(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
								"ime CHAR(30), "+
								"priimek CHAR(30) NOT NULL, "+
								"naslov CHAR(30), "+
								"mesto CHAR(30), "+
								"posta CHAR(4), "+
								"letoRojstva INTEGER);";
			
			stmt = povezava.createStatement();
			
			
			
			//NACIN VNOSA 1:
			String vnos = "INSERT INTO osebe(ime, priimek, naslov, mesto, posta, letoRojstva)"+
						   "VALUES ('Test', 'Surname', 'Ulica 77', 'Izola', '6310', 1980);";
			
			String vnos2 = "INSERT INTO osebe(ime, priimek, naslov, mesto, posta, letoRojstva)"+
					   "VALUES ('Miha', 'Kranjski', 'Ulica 66', 'Koper', '6310', 1990);";
			
			//NACIN VNOSA 2:
			String ime = "Pajo";
			String priimek = "Pajevski";
			String naslov = "Ulica 12";
			
			String sqlInsertPajo = "INSERT INTO osebe (ime, priimek, naslov)" + 	
									"VALUES ('"+ ime+  "', '"+ priimek + "', '" + naslov + "');";
			
			String igorIme = "Igor";
			String igorPriimek = "Muhovski";
			String igorNaslov = "Ulica 500";
			
			String sqlInsertIgor = "INSERT INTO osebe (ime, priimek, naslov)" + 	
					"VALUES ('"+ igorIme+  "', '"+ igorPriimek + "', '" + igorNaslov + "');";
			
		
			
			
		
			
			// DROP TABLE:
//			String removeTable = "DROP TABLE osebe;";
//			stmt.executeUpdate(removeTable);
			
			
//			//CREATE TABLE:
//			stmt.executeUpdate(createDB);	
			
			//INSERT VALUES:			
			stmt.executeUpdate(sqlInsertIgor);
			stmt.executeUpdate(sqlInsertPajo);
			stmt.execute(vnos);
			
		
			
			//QUERY / POIZVEDBA:
			
			//NI POMEMBNO KAKO KLICEMO VRSTNI RED
	
			String sqlQueryAll = "SELECT * FROM osebe;";
			
			ResultSet rs = stmt.executeQuery(sqlQueryAll);
			
//			while(rs.next() ) {
//				
//				int id = rs.getInt("id");
//				String imeOsebe = rs.getString("ime");
//				String priimekOsebe = rs.getString("priimek");
//				String naslovOsebe = rs.getString("naslov");
//				String mesto = rs.getString("mesto");
//				String posta = rs.getString("posta");
//				int letoRojstva = rs.getInt("letoRojstva");
//				
//				System.out.println("ID: "+ id);
//				System.out.println("IME: " + imeOsebe);
//				System.out.println("PRIIMEK: "+ priimekOsebe);
//				System.out.println("Naslov: "+ naslovOsebe);
//				System.out.println("Mesto: "+ mesto);
//				System.out.println("Posta: "+ posta);
//				System.out.println("Datum Rojstva: "+ letoRojstva);
//				System.out.println();
//			}

			//KONEC POIZVEDBE			
			/*
			//SAMO IME:
			String selectIme = "SELECT ime FROM osebe;";			
			rs = stmt.executeQuery(selectIme);
			
			while(rs.next() ) {
				
				String imeOsebe2 = rs.getString("ime");				
				System.out.println("IME JE : " + imeOsebe2);
			}						
			
			//KONEC POIZVEDBE
			
			//WHERE POIZVEDBA:
			String selectWhere = "SELECT * FROM osebe "+
								 "WHERE ime = 'Igor' "+
								 "ORDER BY ime DESC, letoRojstva ASC;";
			
			
			rs = stmt.executeQuery(selectWhere);
			
			while(rs.next() ) {
				
				System.out.println("****");
				
				int id = rs.getInt("id");
				String imeOsebe = rs.getString("ime");
				String priimekOsebe = rs.getString("priimek");
				String naslovOsebe = rs.getString("naslov");
				String mesto = rs.getString("mesto");
				String posta = rs.getString("posta");
				int letoRojstva = rs.getInt("letoRojstva");
				
				System.out.println("ID: "+ id);
				System.out.println("IME: " + imeOsebe);
				System.out.println("PRIIMEK: "+ priimekOsebe);
				System.out.println("Naslov: "+ naslovOsebe);
				System.out.println("Mesto: "+ mesto);
				System.out.println("Posta: "+ posta);
				System.out.println("Datum Rojstva: "+ letoRojstva);
				System.out.println();
				
			}
			//KONEC POIZVEDBE
			*/
			String sqlSpremeniIme = "UPDATE osebe "+
									"SET ime = 'franc' "+
									"WHERE id = 1";
			
			stmt.executeUpdate(sqlSpremeniIme);
			
			String brisi = "DELETE FROM osebe "+
							"WHERE ime LIKE '%Ig%'";
			
			stmt.executeUpdate(brisi);
			
			rs = stmt.executeQuery(sqlQueryAll);
			
			while(rs.next() ) {
				
				int id = rs.getInt("id");
				String imeOsebe = rs.getString("ime");
				String priimekOsebe = rs.getString("priimek");
				String naslovOsebe = rs.getString("naslov");
				String mesto = rs.getString("mesto");
				String posta = rs.getString("posta");
				int letoRojstva = rs.getInt("letoRojstva");
				
				System.out.println("ID: "+ id);
				System.out.println("IME: " + imeOsebe);
				System.out.println("PRIIMEK: "+ priimekOsebe);
				System.out.println("Naslov: "+ naslovOsebe);
				System.out.println("Mesto: "+ mesto);
				System.out.println("Posta: "+ posta);
				System.out.println("Datum Rojstva: "+ letoRojstva);
				System.out.println();
			}
						
				
			
			

			povezava.close();
			
			
		} catch (Exception e) {
			System.out.println("Prislo je do napake: "+ e.getMessage()+"\n"+e.toString());
		}
		
		

	}

}
