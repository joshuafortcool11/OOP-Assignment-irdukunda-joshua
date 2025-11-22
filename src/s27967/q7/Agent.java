package s27967.q7;

public class Agent extends Agency {
    private final String agentName;
    private final String email;
    private final String licenseNumber;

    public Agent(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;

        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) addValidationError("email format invalid");
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) addValidationError("licenseNumber must not be empty");
    }

    public String getAgentName() { return agentName; }
    public String getEmail() { return email; }
    public String getLicenseNumber() { return licenseNumber; }
}
