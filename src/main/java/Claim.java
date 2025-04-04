
import java.util.Date;

public class Claim {
    private String claimId;
    private String policyId;
    private String description;
    private double amount;
    private Date claimDate;
    private String status;

    public Claim(String claimId, String policyId, String description, double amount) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.description = description;
        this.amount = amount;
        this.claimDate = new Date();
        this.status = "PENDING";
    }

    // Getters
    public String getClaimId() { return claimId; }
    public String getPolicyId() { return policyId; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public Date getClaimDate() { return claimDate; }
    public String getStatus() { return status; }
    
    public void setStatus(String status) { this.status = status; }
}
