
import java.util.Scanner;

public class Main {
    private static final String ID = "27967";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ID + " Select a question to run (1-10), or 0 to exit:");
        System.out.println("1) q1  2) q2  3) q3  4) q4  5) q5  6) q6  7) q7  8) q8  9) q9  10) q10");

        while (true) {
            System.out.print("Enter choice: ");
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number, try again.");
                continue;
            }
            if (choice == 0) {
                System.out.println("Exiting.");
                break;
            }
            String className = null;
            switch (choice) {
                case 1: className = "s27967.q1.Main"; break;
                case 2: className = "s27967.q2.MainQ2"; break;
                case 3: className = "s27967.q3.MainQ3"; break;
                case 4: className = "s27967.q4.MainQ4"; break;
                case 5: className = "s27967.q5.MainQ5"; break;
                case 6: className = "s27967.q6.MainQ6"; break;
                case 7: className = "s27967.q7.MainQ7"; break;
                case 8: className = "s27967.q8.MainQ8"; break;
                case 9: className = "s27967.q9.MainQ9"; break;
                case 10: className = "s27967.q10.MainQ10"; break;
                default:
                    System.out.println("Choice out of range.");
                    continue;
            }
            try {
                Class<?> cls = Class.forName(className);
                java.lang.reflect.Method m = cls.getMethod("main", String[].class);
                System.out.println(ID + " Running " + className + " -- enter required inputs now.");
                m.invoke(null, (Object) new String[]{});
                System.out.println(ID + " Returned from " + className);
            } catch (Exception e) {
                System.out.println(ID + " Error invoking " + className + ": " + e.getMessage());
                e.printStackTrace(System.out);
            }
        }
        // don't close System.in here; let the JVM handle it
    }
}
