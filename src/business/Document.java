package business;

import java.time.LocalDateTime;

public class Document {
    private Client client;
    private LocalDateTime dateCreation;

    // Constructor
    protected Document() {
        this.dateCreation = LocalDateTime.now();
    }

    // Constructor with parameters of type Client
    protected Document(Client client) {
        this();
        this.client = client;

    }

    // Constructor with parameters of type Client and LocalDateTime
    protected Document(Client client, LocalDateTime dateCreation) {
        this(client);
        this.dateCreation = dateCreation;
    }

    // Getters and Setters
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    // toString method
    @Override
    public String toString() {
        return "Document [client=" + client + ", dateCreation=" + dateCreation + "]";
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Document))
            return false;
        Document other = (Document) obj;
        if (client == null) {
            if (other.client != null)
                return false;
        } else if (!client.equals(other.client))
            return false;
        if (dateCreation == null) {
            if (other.dateCreation != null)
                return false;
        } else if (!dateCreation.equals(other.dateCreation))
            return false;
        return true;
    }

    // hashCode method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((client == null) ? 0 : client.hashCode());
        result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
        return result;
    }
}
