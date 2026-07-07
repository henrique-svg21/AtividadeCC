import java.util.Scanner; // Import goes at the top

public class MenuSystem { // Renamed class to avoid conflict
    
    // It's good practice to declare the Scanner once as a class variable
    Scanner scanner = new Scanner(System.in); 

    public void loadMenu() {
        System.out.println("=================================");
        System.out.println("SISTEMA APRENDA & CALCULE");
        System.out.println("=================================");
        System.out.println("1. Menu Calculadora");
        System.out.println("2. Guia de Conceitos");
        System.out.println("3. Sair do Sistema");
        System.out.println("=================================");
    }

    public void calculatorMenu() {
        String keep;

        // Wrap the whole process in a do-while loop
        do {
            System.out.println("Choose num1:");
            double n1 = scanner.nextDouble(); // Changed to nextDouble
            // setNum1(n1);

            System.out.println("Choose num2:");
            double n2 = scanner.nextDouble(); // Changed to nextDouble
            // setNum2(n2);

            System.out.println("What is the operation you want?");
            System.out.println("1- Sum");
            System.out.println("2- Subtraction");
            System.out.println("3- Multiplication");
            System.out.println("4- Division");

            int op_option = scanner.nextInt();

            switch (op_option) {
                case 1:
                    System.out.println("Result is sum"); // + sum()
                    break;
                case 2:
                    System.out.println("Result is sub"); // + subtract()
                    break;
                case 3:
                    System.out.println("Result is mult"); // + multiply()
                    break;
                case 4:
                    System.out.println("Result is div"); // + divide()
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }

            System.out.println("Do you wish to calculate again? Y - Yes, N - No");
            keep = scanner.next(); // Changed to next()

        } while (keep.equalsIgnoreCase("Y")); // Correct string comparison
        
        System.out.println("Returning to main menu...");
    }
}