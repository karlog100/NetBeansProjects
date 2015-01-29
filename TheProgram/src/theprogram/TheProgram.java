/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//notes:
//login and logout systems will be added later on
//for user management
//for data controll i want to use mysql as database
//I will use a local database as i dont trust the school internet to be stable
package theprogram;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import theprogram.tempplate;
/**
 *
 * @author computer
 */
public class TheProgram {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
      
    public static void main(String[] args) throws IOException, SQLException {
        // TODO code application logic here
        JFrame myTemp = new tempplate();
        myTemp.setVisible(true);
        System.out.println("start");    
        //SQLSelect.main("SELECT a.amount, u.First_name FROM accounts AS a LEFT JOIN user_information AS u ON a.user_id = u.id;");
        SQLSelect mySelect = new SQLSelect("SELECT a.amount, u.First_name FROM accounts AS a LEFT JOIN user_information AS u ON a.user_id = u.id;");
        System.out.println("sql end");

        for(int i = 0; i < mySelect.sqlResult.size(); i++) {
            for(int j = 0; j < mySelect.sqlResult.get(i).size(); j++) {
                System.out.print("  " + mySelect.sqlResult.get(i).get(j));
            }
            System.out.println();
        }
            
            
            /*
            
            System.outp.rintln("Well select what you want to do");
            System.out.println("You have the following options");
            System.out.println("1 change account");
            System.out.println("2 get cake");
            System.out.println("3 put cake into the bank");
            System.out.println("4 View you cake status");
            System.out.println("5 transfer cake");
            System.out.println("6 logout");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("");
            int userChoice;
            try {
            userChoice = Integer.parseInt(br.readLine());
            }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
            userChoice = 0;
            }
            switch(userChoice) {
            
            case 1:
            //needs some sort of login system
            break;
            case 2:
            //take selected amount of cake out of the bakery, if account
            //have sufficent funds
            break;
            case 3:
            //inset x amount of cake to the bakery on selected account
            break;
            case 4:
            //view your cake status
            break;
            case 5:
            // transfer cake from one account to another account in the bank
            break;
            case 6:
            // log the user out
            break;
            default:
            //input unknow try once more
            break;                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TheProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }    
}
