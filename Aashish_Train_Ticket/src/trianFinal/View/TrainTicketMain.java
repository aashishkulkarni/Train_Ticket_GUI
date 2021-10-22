package trianFinal.View;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author Aashish Kulkarni
 * Student ID: 19091215
 */
public class TrainTicketMain {

    public TrainTicketMain() {

    }

    public static void main(String[] args) throws IOException {

        DBManager dbManager = new DBManager();
        dbManager.establishConnection();        //establishing connection with the database
        JFrame signInframe = new signIn();      // signIn page

        signInframe.setVisible(true);           // opening sign-in page
 
        System.out.println("");

    }

}
