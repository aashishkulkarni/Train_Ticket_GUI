package trianFinal.Model;

/**
 *
 * @author Aashish Kulkarni
 */
import java.util.*;

public class passengerDetails {
    //Basic passenger information is required while booking tickets, variables here store passenger details

    protected String passengerName;
    protected int passengerAge;
    protected String passengerGender;

    public passengerDetails() {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerGender = passengerGender;

    }

    //Getters and Setters are also implemented
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender;
    }

}
