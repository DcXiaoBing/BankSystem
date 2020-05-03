import java.sql.*;
/**
 * a class responsible for creat tables
 */
public class TableCreator {
    public static void main(String[] args) {
        DBInitializor g = new DBInitializor();
        g.run();
    }
}

/**
 * a inner class for creat databse
 */
class DBInitializor{
    public void run(){
        creatDatabase();
        creatCustomerTable();
        creatLoginAccountTable();
        creatBalanceTable();
        creatLoanTable();
        creatCollateralTable();
        creatCurrencyTable();
        creatBankAccountTable();
        creatTransactionTable();
        creatStockTable();
        creatPositionTable();
    }

    // use try catch to automatically handle the close
    public void creatDatabase(){
        String deleteIfExist = "DROP DATABASE IF EXISTS bank_database";
        String creatDatabase = "CREATE DATABASE IF NOT EXISTS bank_database";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL_CREAT, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(deleteIfExist);
                stmt.executeUpdate(creatDatabase);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void creatCustomerTable(){
        // customer id starts at 100000001
        String sql = "CREATE TABLE IF NOT EXISTS user (" +
        "id INTEGER not NULL auto_increment, " + 
        "name VARCHAR(50) not NULL DEFAULT 'name', " +
        "PRIMARY KEY (id)" +
        ") Engine = INNODB auto_increment = 100000001 DEFAULT CHARSET = UTF8";
        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void creatLoginAccountTable() {
        String sql = "CREATE TABLE IF NOT EXISTS login_account (" + 
        "id INTEGER not NULL auto_increment, " + 
        "user_name VARCHAR(30) not NULL, " + 
        "password VARCHAR(30) not NULL, " + 
        "user_id INTEGER not NULL , " + 
        "PRIMARY KEY (id), " +
        "FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE " + 
        ") Engine = INNODB DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void creatBalanceTable(){
        String sql = "CREATE TABLE IF NOT EXISTS balance (" + 
        "id INTEGER not NULL auto_increment, " + 
        "account_id INTEGER not NULL, " + 
        "usd DOUBLE not NULL DEFAULT 0, " +
        "cny DOUBLE not NULL DEFAULT 0, " +
        "eur DOUBLE not NULL DEFAULT 0, " +
        "PRIMARY KEY (id), " +
        "FOREIGN KEY (account_id) REFERENCES user(id) ON DELETE CASCADE " + 
        ") Engine = INNODB DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void creatLoanTable(){
        String sql = "CREATE TABLE IF NOT EXISTS loan (" + 
        "id INTEGER not NULL auto_increment, " + 
        "user_id INTEGER not NULL, " + 
        "total_amount DOUBLE not NULL DEFAULT 0, " +
        "rest DOUBLE not NULL DEFAULT 0, " +
        "intrest DOUBLE not NULL DEFAULT 0, " +
        "monthly_pay DOUBLE not NULL DEFAULT 0, " +
        "PRIMARY KEY (id), " +
        "FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE" + 
        ") Engine = INNODB DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void creatCollateralTable(){
        String sql = "CREATE TABLE IF NOT EXISTS collateral (" + 
        "id INTEGER not NULL auto_increment, " + 
        "loan_id INTEGER not NULL, " + 
        "total_amount DOUBLE not NULL DEFAULT 0, " +
        "rest DOUBLE not NULL DEFAULT 0, " +
        "intrest DOUBLE not NULL DEFAULT 0, " +
        "monthly_pay DOUBLE not NULL DEFAULT 0, " +
        "PRIMARY KEY (id), " +
        "FOREIGN KEY (loan_id) REFERENCES loan(id) ON DELETE CASCADE" +
        ") Engine = INNODB DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void creatCurrencyTable() {
        String sql = "CREATE TABLE IF NOT EXISTS currency (" + 
        "name char(3) not NULL, " + 
        "rate DOUBLE not NULL DEFAULT 0, " +
        "PRIMARY KEY (name)" +
        ") Engine = INNODB DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void creatBankAccountTable(){
        String sql = "CREATE TABLE IF NOT EXISTS bank_account (" + 
        "id INTEGER not NULL auto_increment, " + 
        "type CHAR(1) not NULL DEFAULT 'C', " +
        "user_id INTEGER not NULL, " + 
        "nickname VARCHAR(50) not NULL DEFAULT '', " +
        "PRIMARY KEY (id), " +
        "FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE " + 
        ") Engine = INNODB auto_increment = 100000001 DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void creatTransactionTable(){
        String sql = "CREATE TABLE IF NOT EXISTS transaction (" + 
        "id INTEGER not NULL auto_increment, " + 
        "date INTEGER not NULL, " +
        "from_account_id INTEGER not NULL, " + 
        "to_account_id INTEGER not NULL DEFAULT 0, " + // 0 means withdrawal
        "PRIMARY KEY (id), " +
        "FOREIGN KEY (from_account_id) REFERENCES bank_account(id) ON DELETE CASCADE," + 
        "FOREIGN KEY (to_account_id) REFERENCES bank_account(id) ON DELETE CASCADE " + 
        ") Engine = INNODB DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void creatStockTable(){
        String sql = "CREATE TABLE IF NOT EXISTS stock (" + 
        "id INTEGER not NULL auto_increment, " + 
        "stock_symbol VARCHAR(10) not NULL, " +
        "PRIMARY KEY (id)" +
        ") Engine = INNODB DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void creatPositionTable(){
        String sql = "CREATE TABLE IF NOT EXISTS position (" +
        "id INTEGER not NULL auto_increment, " + 
        "date INTEGER not NULL, " +
        "type CHAR(1) not NULL DEFAULT 'S', " + // S - sell, B - buy
        "stock_id INTEGER not NULL, " +
        "PRIMARY KEY (id), " +
        "FOREIGN KEY (stock_id) REFERENCES stock(id) ON DELETE CASCADE " +
        ") Engine = INNODB DEFAULT CHARSET = UTF8";

        try(Connection conn = DriverManager.getConnection(DatabasParameter.JDBC_URL, DatabasParameter.JDBC_USER, DatabasParameter.JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}