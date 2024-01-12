package business;

public class Client {
    private String name;
    private String address;
    private String phone;
    private Long idNumber;
    private static Long nextIdNumber = 0L;

    // Constructor
    public Client(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.idNumber = ++nextIdNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Client))
            return false;
        Client other = (Client) obj;
        if (idNumber == null) {
            if (other.idNumber != null)
                return false;
        } else if (!idNumber.equals(other.idNumber))
            return false;
        return true;
    }

    // hashCode method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idNumber.hashCode();
        return result;
    }

    // toString method
    @Override
    public String toString() {
        return "Client [name=" + name + ", address=" + address + ", phone=" + phone + ", idNumber=" + idNumber
                + "]";
    }
