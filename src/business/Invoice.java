package business;

import java.time.LocalDate;

public class Invoice extends Document {

    private LocalDate deadlineDate;
    private Long number;
    private static Long nextNumber = 0L;

    // constructor
    public Invoice(LocalDate deadlineDate) {
        super();
        this.deadlineDate = deadlineDate;
        this.number = ++nextNumber;

    }

    public Invoice(Client client, LocalDate deadlineDate) {
        this(deadlineDate);
        super.setClient(client);

    }

    // Getters and Setters
    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    // toString method
    @Override
    public String toString() {
        return "Invoice [deadlineDate=" + deadlineDate + ", number=" + number + ", toString()=" + super.toString()
                + "]";
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Invoice other = (Invoice) obj;
        if (deadlineDate == null) {
            if (other.deadlineDate != null)
                return false;
        } else if (!deadlineDate.equals(other.deadlineDate))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        return true;
    }

    // hashCode method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((deadlineDate == null) ? 0 : deadlineDate.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        return result;
    }
}
