
import java.util.Date;

public class Policy {
    private String policyId;
    private String customerId;
    private String type;
    private double coverage;
    private double premium;
    private Date startDate;
    private Date endDate;
    private String status;

    public Policy(String policyId, String customerId, String type, double coverage, double premium) {
        this.policyId = policyId;
        this.customerId = customerId;
        this.type = type;
        this.coverage = coverage;
        this.premium = premium;
        this.startDate = new Date();
        this.status = "ACTIVE";
    }

    // Getters and setters
    public String getPolicyId() { return policyId; }
    public String getCustomerId() { return customerId; }
    public String getType() { return type; }
    public double getCoverage() { return coverage; }
    public double getPremium() { return premium; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
    public String getStatus() { return status; }
}
