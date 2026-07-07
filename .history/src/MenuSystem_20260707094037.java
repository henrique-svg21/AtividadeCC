public class System {
    
    import java.util.Scanner;

    String keep = "Y";

    public void loadMenu() {
        System.out.println("=================================");
        System.out.println("SYSTEM TO CALCULATE AND LEARN");
        System.out.println("=================================");
        System.out.println("1. Calculator");
        System.out.println("2. Concepts Guide");
        System.out.println("3. Exit System");
        System.out.println("=================================");
    }

    public void CalculatorMenu () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose num1");
        double n1 = scanner.nextInt();
        setNum1(n1);

        System.out.println("Choose num2");
        double n2 = scanner.nextInt();
        setNum2(n2);

        System.out.println("What is the operation you want?");
        System.out.println("1- Sum");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");

        int op_option = scanner.nextInt();

        switch (op_option) {
            case 1:
                System.out.println("Result is " + sum());
                break;
            case 2:
                System.out.println("Result is " + subtract());
                break;
            case 3:
                System.out.println("Result is " + multiply());
                break;
            case 4:
                System.out.println("Result is " + divide());
                break;
        }

        System.out.println("Do you wish to continue? Y - Yes, N - No");
        keep = scanner.nextString();
        do { 
            if (keep == "Y") {
                loadMenu();
            }
            else {
                break;
            }
        } while (!keep == 'Y' || !keep == 'N');
        

        }

    }

