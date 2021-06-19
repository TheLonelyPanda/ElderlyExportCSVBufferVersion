package th.co.eecsv.db;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbControl {
	
	public Connection getConnectionOra(){		
			Connection conn = null;
			String db_name = "";
			try {
				String url = "jdbc:postgresql://psql-proj-aging-prod-devtest.postgres.database.azure.com:5432/aging_prod";
	            Properties props = new Properties();
	            props.setProperty("user","projagingadmin@psql-proj-aging-prod-devtest");
	            props.setProperty("password", "QeiF@a@d3&%u&T$xqUxnZ7pULTqp*5$l");
	            props.setProperty("ssl","false");
	            conn = DriverManager.getConnection(url, props);
					 db_name = "aging_prod";
				System.out.println("Connect Database : "+ db_name +" Success");
				System.out.println(conn);
				 return conn;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ERROR-Connect Database "+ db_name +" Fail");
				e.printStackTrace();
			}
		return null;
	}

	private Properties loadGlobalConfig(String configFile) throws Exception{
		File file = new File(configFile);
		Properties prop = new Properties();
		System.out.println("Load properties config "+configFile);
		try {
			prop.load(new FileInputStream(file));
			System.out.println("Load Global properties config success ");
		} catch (Exception e) {
			System.out.println("ERROR-Load Global properties config fail ");
			e.printStackTrace();
			throw e;
		}	
		return prop;
	}	

	
	public void destroyConnection(Connection conn){
		try {			
			if(conn != null)conn.close();
			System.out.println("Close Connection Database Success");
		} catch (Exception e) {
			System.out.println("ERROR-");
			e.printStackTrace();
		}
	}
}
