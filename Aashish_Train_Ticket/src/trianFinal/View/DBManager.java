package trianFinal.View;

/**
 *
 * @author Aashish Kulkarni
 */
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;

public final class DBManager {

    String URL = "jdbc:derby://localhost:1527/TrainGUI_DB";
    String driver = "derby.jar";
    String USER_NAME = "pdc";
    String PASSWORD = "pdc";

    Connection conn;

    public DBManager() {

        System.out.println("DB Manager");

        establishConnection();

    }

    public Connection getConnection() {
        return this.conn;
    }

    public void establishConnection() {             //establish connection
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + " Get Connected Successfully ....");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }

    public boolean registerUser(String username, String password, String Name, int age, String EmailID) {

        //Register new user
        boolean success = false;

        System.out.println(" Hello ");

        try {

            String query = "INSERT INTO PDC.LOGIN VALUES(?,?,?,?,?)";       //SQL statement implemented

            if (!checkUsername(username, password)) {

                PreparedStatement aStatement = conn.prepareStatement(query);  //prepared statemented used here

                aStatement.setString(1, username);
                aStatement.setString(2, password);
                aStatement.setString(3, EmailID);
                aStatement.setInt(4, age);
                aStatement.setString(5, Name);

                aStatement.executeUpdate();

                System.out.println(Name + " added to the database ... ");       //User added to the database
                success = true;
            } else if (checkUsername(username, password)) {

                System.out.println("Username: " + username + " already exists in the database ...");

            } else {
                System.out.println("ERROR.. Please try again..");
            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        return success;

    }

    public boolean checkUsername(String username, String password) {
        // Checking username and password
        boolean flag = false;

        System.out.println("checkUser function");
        String query = "SELECT USERNAME, PASSWORD FROM PDC.LOGIN WHERE USERNAME=? AND PASSWORD=?";  //SQL statement implemented

        try {
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();    //executing the query

            if (rs.next()) {

                System.out.println("found user");
                flag = true;

            } else {

                System.out.println("no such user");
                flag = false;

            }
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
        return flag;
    }

    public void closeConnections() {
        if (conn != null) {
            try {                       //closing the connection
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ResultSet queryDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

    public void updateDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;

        try {
            statement = connection.createStatement();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ResultSet getQuery() {

        ResultSet rs = null;

        try {

            Statement statement = conn.createStatement();

            String sqlQuery = "Select USERNAME,PASSWORD from PDC.LOGIN";

            rs = statement.executeQuery(sqlQuery);

            while (rs.next()) {

                String username = rs.getString("pdc");
                String password = rs.getString("password");
                System.out.println("Username: " + username + " " + "Password: " + password);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

}
