
import java.util.Date;

public class PremiumPayment {
    private String paymentId;
    private String policyId;
    private double amount;
    private Date paymentDate;
    private String status;

    public PremiumPayment(String paymentId, String policyId, double amount) {
        this.paymentId = paymentId;
        this.policyId = policyId;
        this.amount = amount;
        this.paymentDate = new Date();
        this.status = "PAID";
    }

    // Getters
    public String getPaymentId() { return paymentId; }
    public String getPolicyId() { return policyId; }
    public double getAmount() { return amount; }
    public Date getPaymentDate() { return paymentDate; }
    public String getStatus() { return status; }
}
