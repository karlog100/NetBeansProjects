/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 *
 * @author computer
 */
public class SQLWorker {
    /**
     *
     * @param SQLStatement
     * @return
     */
    Connection connection = null;
    ResultSet rs = null;
    Statement stmt = null;
    List<List<String>> sqlResult = new ArrayList<>();
    public void startSQLConnection() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery", "root", "");
            stmt = connection.createStatement();
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void stopSQLConnection() {
        try {
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    /*
    public List<List<String>> main(String SQLStatement) {
        List<List<String>> result = new ArrayList<>();
        Connection connection = null;
        ResultSet rs = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery", "root", "");
             
            stmt = connection.createStatement();
            rs = stmt.executeQuery(SQLStatement);
            //ArrayList<ArrayList<String>> topArray = new ArrayList<ArrayList<String>>();
            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                List<String> row = new ArrayList<>(rsmd.getColumnCount()); // new list per row
                int i = 1;
                while (i <= rsmd.getColumnCount()) {  // don't skip the last column, use <=
                    row.add(rs.getString(i++));
            }
            result.add(row); // add it to the result
}
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    */
}
