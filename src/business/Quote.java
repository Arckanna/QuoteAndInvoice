package business;

import java.time.LocalDate;

public class Quote extends Document {

    private LocalDate dateExpiration;
    private Long reference;
    private static Long nextReference = 0L;

    public Quote(LocalDate dateExpiration) {
        super();
        this.dateExpiration = dateExpiration;
        this.reference = ++nextReference;

    }

    public Quote(Client client, LocalDate dateExpiration) {
        this(dateExpiration);
        super.setClient(client);

    }

    // Getters and Setters
    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    // toString method
    @Override
    public String toString() {
        return "Quote [dateExpiration=" + dateExpiration + ", reference=" + reference + ", toString()="
                + super.toString() + "]";
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Quote other = (Quote) obj;
        if (dateExpiration == null) {
            if (other.dateExpiration != null)
                return false;
        } else if (!dateExpiration.equals(other.dateExpiration))
            return false;
        if (reference == null) {
            if (other.reference != null)
                return false;
        } else if (!reference.equals(other.reference))
            return false;
        return true;
    }

    // hashCode method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dateExpiration == null) ? 0 : dateExpiration.hashCode());
        result = prime * result + ((reference == null) ? 0 : reference.hashCode());
        return result;
    }

}
