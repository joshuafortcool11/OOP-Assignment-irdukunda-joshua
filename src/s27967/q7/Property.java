package s27967.q7;

public class Property extends Agent {
    private final String propertyCode;
    private final String propertyType;
    private final double price;

    public Property(int id, String createdDate, String updatedDate,
                    String agencyName, String location, String phoneNumber,
                    String agentName, String email, String licenseNumber,
                    String propertyCode, String propertyType, double price) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;

        if (price <= 0) addValidationError("price must be > 0");
    }

    public String getPropertyCode() { return propertyCode; }
    public String getPropertyType() { return propertyType; }
    public double getPrice() { return price; }
}
