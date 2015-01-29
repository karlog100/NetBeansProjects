/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theprogram;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author computer
 */
public class SQLSelect extends SQLWorker {
    
    SQLSelect(String selectStatement) throws SQLException {
        //sqlResult = main(selectStatement);
        startSQLConnection();  
        List<List<String>> result = new ArrayList<>();
        System.out.println("this part is working fine");
        rs = stmt.executeQuery(selectStatement);
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
        sqlResult = result;    
        stopSQLConnection();
    }
}