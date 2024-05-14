import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for USSD code
        System.out.print("Enter USSD code: ");
        String ussdCode = scanner.nextLine();

        // Compare the entered USSD code with the specific code you want to use
        if (ussdCode.equals("*123#")) {
            // Display the USSD menu
            System.out.println("Welcome to My USSD Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Recharge");
            System.out.println("3. Data Bundle");
            System.out.println("4. Exit");

            // Get user input
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Process the user's choice using a switch statement
            switch (choice) {
                case 1:
                    System.out.println("Checking balance...");
                    // Code to check balance

                    // Display sub-menu for balance options
                    System.out.println("1. Check Main Balance");
                    System.out.println("2. Check Data Balance");
                    System.out.println("3. Go back");

                    // Get sub-choice for balance options
                    System.out.print("Enter your choice: ");
                    int balanceChoice = scanner.nextInt();

                    // Process the sub-choice using a nested switch statement
                    switch (balanceChoice) {
                        case 1:
                            System.out.println("Checking main balance..." + "\n");
                            System.out.println("Your main balance: " + "\n" + "Airtime: 100" + "\n" + "Data Bundles: 7.27 GB" + "\n" + "Voice Bundles: 228 Minutes All Network" + "\n");
                            System.out.print("Enter your choice: " + "\n");

                            System.out.print("0. Go Back " + "\n");

                            int backChoice = scanner.nextInt();
                            break;
                        case 2:
                            System.out.println("Checking data balance..." + "\n");

                            System.out.print("Your data bundle balance: " + "\n" + "Data: 7.27 GB" + "\n" + "Night Owl: 5 GB" + "\n");
                            System.out.print("Enter your choice: " + "\n");

                            System.out.print("0. Go Back " + "\n");

                            int backChoice2 = scanner.nextInt();
                            break;
                        case 3:
                            System.out.println("Going back to main menu...");
                            // Code to go back to main menu
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Recharging...");
                    // Code to recharge

                    // Display sub-menu for recharge options
                    System.out.println("1. Recharge with PIN");
                    System.out.println("2. Recharge with Voucher");
                    System.out.println("3. Go back");

                    // Get sub-choice for recharge options
                    System.out.print("Enter your choice: ");
                    int rechargeChoice = scanner.nextInt();

                    // Process the sub-choice using a nested switch statement
                    switch (rechargeChoice) {
                        case 1:
                            System.out.println("Recharging with PIN..." + "\n");
                            System.out.println("Enter recharge pin:");
                            float pin = scanner.nextFloat();
                            System.out.print("Your account is recharged successfully." + "\n");


//                            System.out.print("Enter your choice" + "\n");
//                            int rechargeChoice2 = scanner.nextInt();
                            break;
                        case 2:
                            System.out.println("Recharging with Voucher..." + "\n");
                            System.out.println("Enter recharge voucher:");
                            float voucher = scanner.nextFloat();
                            System.out.print("Your account is recharged successfully." + "\n");
                            break;
                        case 3:
                            System.out.println("Going back to main menu...");
                            // Code to go back to main menu
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Data bundle..." + "\n");
                    System.out.print("1. Buy Bundles: " + "\n");
                    System.out.print("0. Go Back : " + "\n");
                    System.out.print("Enter your choice: ");
                    int bundleChoice = scanner.nextInt();

                    break;
                case 4:
                    System.out.println("Exiting...");

                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }


        else if (ussdCode.equals("*456#")) {
            System.out.println("Welcome to MTN pulse" + "\n");
            System.out.println("1. Buy pulse bundles");
            System.out.println("2. Check pulse bundles");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int balanceChoice = scanner.nextInt();

            switch (balanceChoice) {
                case 1:
                    System.out.println("Checking main balance..." + "\n");
                    System.out.println("1. Student Bundles");
                    System.out.println("2. Made4U");
                    System.out.println("3. Pulse Night");
                    System.out.println("4. Voucher");
                    System.out.println("0. Go Back");

                    System.out.print("Enter your choice: " + "\n");
                    int bundleChoice2 = scanner.nextInt();
            }

        } else if (ussdCode.equals("*789#")) {
            // Code for USSD code *789#

        } else {
            System.out.println("Invalid USSD code");
        }

        scanner.close();
    }
}