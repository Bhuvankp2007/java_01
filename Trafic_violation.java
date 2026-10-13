import java.util.Scanner;
public class Trafic_violation {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Speed: ");
        int speed = sc.nextInt();

        System.out.print("Enter Speed Limit: ");
        int speedLimit = sc.nextInt();

        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Helmet Status (1 = Valid, 0 = Invalid): ");
        int helmetStatus = sc.nextInt();

        System.out.print("Seat Belt Status (1 = Valid, 0 = Violation): ");
        int seatBeltStatus = sc.nextInt();

        System.out.print("License Status (1 = Valid, 0 = Invalid): ");
        int licenseStatus = sc.nextInt();

        System.out.print("Emergency Vehicle? (1 = Yes, 0 = No): ");
        int emergencyVehicle = sc.nextInt();


        // Variables
        int excessSpeed = speed - speedLimit;
        int totalFine = 0;
        int violationFlags = 0;


        // Speed violation
        if (speed > speedLimit && emergencyVehicle == 0) {

            totalFine += 1500;

            // Speed violation flag = 1
            violationFlags += 1;
        }


        // Helmet violation
        if (helmetStatus == 0) {

            totalFine += 500;

            // Helmet violation flag = 2
            violationFlags += 2;
        }


        // Seat belt violation
        if (seatBeltStatus == 0) {

            totalFine += 1000;

            // Seat belt violation flag = 4
            violationFlags += 4;
        }


        // Invalid license
        if (licenseStatus == 0) {

            totalFine += 2000;

            // License violation flag = 8
            violationFlags += 8;
        }


        // Underage driving
        if (age < 18) {

            totalFine += 2500;

            // Underage violation flag = 16
            violationFlags += 16;
        }


        // Risk level
        String riskLevel;

        if (violationFlags == 0) {
            riskLevel = "LOW";
        } 
        else if (totalFine <= 1500) {
            riskLevel = "MEDIUM";
        } 
        else {
            riskLevel = "HIGH";
        }


        // Output
        System.out.println("\n-----------------------------------");
        System.out.println("       SMART TRAFFIC ANALYZER");
        System.out.println("-----------------------------------");

        System.out.println("Vehicle Number   : " + vehicleNumber);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Speed Limit      : " + speedLimit + " km/h");

        if (speed > speedLimit) {
            System.out.println("Excess Speed     : " + excessSpeed + " km/h");
            System.out.println("Speed Status     : OVER SPEED");
        } else {
            System.out.println("Excess Speed     : 0 km/h");
            System.out.println("Speed Status     : NORMAL");
        }

        if (helmetStatus == 1) {
            System.out.println("Helmet Status    : VALID");
        } else {
            System.out.println("Helmet Status    : VIOLATION");
        }

        if (seatBeltStatus == 1) {
            System.out.println("Seat Belt Status : VALID");
        } else {
            System.out.println("Seat Belt Status : VIOLATION");
        }

        if (licenseStatus == 1) {
            System.out.println("License Status   : VALID");
        } else {
            System.out.println("License Status   : INVALID");
        }

        System.out.println("\nTotal Fine       : $" + totalFine);
        System.out.println("Risk Level       : " + riskLevel);
        System.out.println("Violation Flags  : " + violationFlags);

        System.out.println("-----------------------------------");

        sc.close();
    }
}
    

