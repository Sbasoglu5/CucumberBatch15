package DBTest;

import java.sql.*;

public class DatabaseTest2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String username = "syntax_hrm";
        String password = "syntaxhrm123";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection has been created for Batch 15");
            Statement statement=conn.createStatement();
            //ResultSet rset=statement.executeQuery("select FirstName, LastName from person");
            ResultSet rset=statement.executeQuery("select firstname, lastname, age, city "+"from person where city is not null;");
            /*while (rset.next()){
                String fName=rset.getString("FirstName");
                String lName=rset.getString("LastName");
                //System.out.println(fName+" "+lName);
            }*/
            //ResultSetMetaData - object that contains information about the result
            //information such as in the table how many columns there are
            //name of the columns, rows, and number of the rows
            ResultSetMetaData metaData=rset.getMetaData();
            //print all the columns header values
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                String columnName =metaData.getColumnName(i);
                System.out.println(columnName);
            }
            // we want to loop through every column and every row
            while (rset.next()){
                for (int i = 1; i <= metaData.getColumnCount() ; i++) {
                    String value=rset.getString(metaData.getColumnName(i));
                    System.out.println(value);
                }
                //just to change the line statement added below
                System.out.println();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
