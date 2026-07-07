import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator(0, 0);
        int mainOption = 0;
        char cont = 'S';
        
        do { 
            System.out.println("=================================");
            System.out.println("SYSTEM TO CALCULATE AND LEARN");
            System.out.println("=================================");
            System.out.println("1. Calculator Menu");
            System.out.println("2. Concepts Guide");
            System.out.println("3. Exit System");
            System.out.println("=================================");
            System.out.print("Choose an option: ");
            mainOption = scan.nextInt();

            switch (mainOption) {
                case 1:
                    int option = 0;
                    do { 
                        System.out.println("=================================");
                        System.out.println("SYSTEM TO CALCULATE AND LEARN");
                        System.out.println("=================================");
                        System.out.println("1. Sum");
                        System.out.println("2. Subtraction");
                        System.out.println("3. Multiplication");
                        System.out.println("4. Division");
                        System.out.println("5. Back");
                        System.out.println("=================================");
                        System.out.print("Choose an option: ");
                        option = scan.nextInt();

                        if (option >= 1 && option <= 4) {
                            System.out.println("Enter first number: ");
                            calc.setNum1(scan.nextInt());

                            System.out.println("Enter second number: ");
                            calc.setNum2(scan.nextInt());

                            switch (option) {
                                case 1:
                                    System.out.println("Result of sum: " + calc.sum()); // + sum()
                                    break;
                                case 2:
                                    System.out.println("Result of sub: " + calc.subtract()); // + subtract()
                                    break;
                                case 3:
                                    System.out.println("Result of mult: " + calc.multiply()); // + multiply()
                                    break;
                                case 4:
                                    System.out.println("Result of div: " + calc.div()); // + divide()
                                    break;
                            }
                            System.out.println();
                        }
                    } while (option != 5);
                    break;

                case 2:
                    int read = 0;

                    do { 
                        System.out.println("=================================");
                        System.out.println("          CONCEPTS MENU          ");
                        System.out.println("=================================");
                        System.out.println("1. Concept 1");
                        System.out.println("2. Concept 2");
                        System.out.println("3. Concept 3");
                        System.out.println("4. Back");
                        System.out.println("=================================");
                        System.out.print("Choose an option: ");
                        read = scan.nextInt();
                        System.out.println();

                        if (read >=1 && read <= 3) {
                            switch(read) {
                                case 1:
                                    System.out.println("Inversion in German is when you start the sentence with inverting connectives, requiring the verb and subject to be swapped in place, in order to keep the verb as the second idea of the clause");
                                    break;
                                case 2:
                                    System.out.println("");
                                    break;            
                                case 3:
                                    System.out.println("Wow concep33333");
                                    break;
                            }
                            System.out.println();
                        }
                    } while (read != 4);
                    break;

                case 3:
                    cont = 'N';
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

            if (mainOption != 3) {
                System.out.print("\nWanna return to the principal menu? (S/N): ");
                cont = scan.next().toUpperCase().charAt(0);
            }
            
        } while (cont == 'S');
        System.out.println("System closed, good studies!");
        scan.close();
    }
}
