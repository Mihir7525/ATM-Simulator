package atm.simulator.system;
import java.sql.*;
public class Connected {
    Connection connection;
    Statement statement;
    public Connected(){
        try{
        connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsimulatorSystem","root","Mihir@123");
        statement = connection.createStatement();
    }catch (Exception e){
            e.printStackTrace();
        }
    }
}
