package trianFinal.Model;

import java.util.InputMismatchException;
import java.util.*;

import trianFinal.Model.medicalDetails;
import trianFinal.Model.passengerDetails;
import trianFinal.Model.trainNetwork;
import trianFinal.View.View;
import trianFinal.View.passengerInfo;

/**
 *
 * @author Aashish Kulkarni
 */
public class Model extends Observable {

    View view = new View();

    public passengerDetails pd;
    public medicalDetails md;

    public trainNetwork tn;

 
    Scanner scan = new Scanner(System.in);
 

    public void passengerDetails(String Name, int age, String email) {

        contactDetails cd = new medicalDetails();

        pd.setPassengerName(Name);
        pd.setPassengerAge(age);
        cd.setEmailID(email);

    }

    public void medicalDetails() {
 

        md.med1();
        md.med2();
        md.med3();

    }
 
}
