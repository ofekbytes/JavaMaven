package dataBase.sqlite;

public interface InterfaceUserList 
{
	public boolean fnCreateDataBase (String DataBaseName);
	public boolean fnCreateTable (String DataBaseName, String TabelName);
	
	
	
	public boolean fnEraseAllRecord (String DataBaseName, boolean blAreYouSure);
	public boolean fnEraseDatabaseFile(String DataBaseName, boolean blAreYouSure);
	
}
