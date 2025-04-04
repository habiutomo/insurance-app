
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Policy> policies = new ArrayList<>();
    private static List<PremiumPayment> payments = new ArrayList<>();
    private static List<Claim> claims = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Insurance Management System ===");
            System.out.println("1. Manage Policies");
            System.out.println("2. Make Premium Payment");
            System.out.println("3. File Claim");
            System.out.println("4. View All Records");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    managePolicy(scanner);
                    break;
                case 2:
                    makePremiumPayment(scanner);
                    break;
                case 3:
                    fileClaim(scanner);
                    break;
                case 4:
                    viewAllRecords();
                    break;
                case 5:
                    System.out.println("Thank you for using Insurance Management System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
    
    private static void managePolicy(Scanner scanner) {
        System.out.print("Enter Policy ID: ");
        String policyId = scanner.nextLine();
        
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        
        System.out.print("Enter Insurance Type (Health/Life/Auto): ");
        String type = scanner.nextLine();
        
        System.out.print("Enter Coverage Amount: ");
        double coverage = scanner.nextDouble();
        
        System.out.print("Enter Premium Amount: ");
        double premium = scanner.nextDouble();
        
        Policy policy = new Policy(policyId, customerId, type, coverage, premium);
        policies.add(policy);
        System.out.println("Policy created successfully!");
    }
    
    private static void makePremiumPayment(Scanner scanner) {
        System.out.print("Enter Payment ID: ");
        String paymentId = scanner.nextLine();
        
        System.out.print("Enter Policy ID: ");
        String policyId = scanner.nextLine();
        
        System.out.print("Enter Payment Amount: ");
        double amount = scanner.nextDouble();
        
        PremiumPayment payment = new PremiumPayment(paymentId, policyId, amount);
        payments.add(payment);
        System.out.println("Payment recorded successfully!");
    }
    
    private static void fileClaim(Scanner scanner) {
        System.out.print("Enter Claim ID: ");
        String claimId = scanner.nextLine();
        
        System.out.print("Enter Policy ID: ");
        String policyId = scanner.nextLine();
        
        System.out.print("Enter Claim Description: ");
        String description = scanner.nextLine();
        
        System.out.print("Enter Claim Amount: ");
        double amount = scanner.nextDouble();
        
        Claim claim = new Claim(claimId, policyId, description, amount);
        claims.add(claim);
        System.out.println("Claim filed successfully!");
    }
    
    private static void viewAllRecords() {
        System.out.println("\n=== Policies ===");
        for (Policy p : policies) {
            System.out.printf("Policy ID: %s, Customer: %s, Type: %s, Coverage: $%.2f\n",
                p.getPolicyId(), p.getCustomerId(), p.getType(), p.getCoverage());
        }
        
        System.out.println("\n=== Payments ===");
        for (PremiumPayment p : payments) {
            System.out.printf("Payment ID: %s, Policy: %s, Amount: $%.2f, Date: %s\n",
                p.getPaymentId(), p.getPolicyId(), p.getAmount(), p.getPaymentDate());
        }
        
        System.out.println("\n=== Claims ===");
        for (Claim c : claims) {
            System.out.printf("Claim ID: %s, Policy: %s, Amount: $%.2f, Status: %s\n",
                c.getClaimId(), c.getPolicyId(), c.getAmount(), c.getStatus());
        }
    }
}
