package oop_experiment.exp7;

// Class implementing multiple interfaces
public class SmartPhone implements Phone, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo captured using the smartphone.");
    }

    // Additional method unique to SmartPhone
    public void browseInternet() {
        System.out.println("Browsing the internet...");
    }
}
