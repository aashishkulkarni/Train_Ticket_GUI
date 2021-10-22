package trianFinal.View;

import java.util.Observer;
import javax.swing.JFrame;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import trianFinal.*;
import trianFinal.Model.Model;
import trianFinal.Model.passengerDetails;

import trianFinal.Model.trainNetwork;

/**
 *
 * @author Aashish Kulkarni 
 * Student ID: 19091215
 */
public class View extends JFrame {

    public void createAccountPage() {

        createAccount c1 = new createAccount();

        Model m1 = new Model();
        int age = Integer.parseInt(c1.getAgeTextField().getText().trim());      // Storing age value in integer data-type
        m1.passengerDetails(c1.getNameTextField().getText(), age, c1.getEmailTextField().getText().trim());

    }

    public void bookTrainTicketPage() {         //entering the value given by the user to their respective variables

        trainNetwork tn = new trainNetwork();
        bookTrainWorking bt = new bookTrainWorking();

        tn.setArrivalCity(bt.toCity);
        tn.setDepartCity(bt.fromCity);

    }

    public void passengerDetailsPage() {

        passengerDetails bw = new passengerDetails();
        passengerInfo pi = new passengerInfo();

        bw.setPassengerName(pi.getNameTextField().getText());
        bw.setPassengerGender((String) pi.getGenderComboBox().getSelectedItem());
        int age = Integer.parseInt(pi.getAgeTextField().getText().trim());              // Storing age value in integer data-type
        bw.setPassengerAge(age);

    }

}
