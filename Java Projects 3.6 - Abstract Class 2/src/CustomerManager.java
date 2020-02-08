
public class CustomerManager {
    BaseDatabaseManager databaseManager;
    
    
   /* public void getData() {
        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();
    }*/
    
   /* public void getData() {
        MySqlDatabaseManager mySqlDatabaseManager = new MySqlDatabaseManager(); 
        mySqlDatabaseManager.getData();
    }*/
    
    public void getData() {
        databaseManager.getData();
    }
    
    
}
