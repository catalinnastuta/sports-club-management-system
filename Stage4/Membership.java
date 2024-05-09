package Stage4;

public class Membership {
    private Client client;
    private Tier tier;

    // Enum for membership tiers
    public enum Tier {
        BASIC,
        STANDARD,
        PREMIUM
    }

    public Membership(Client client, Tier tier) {
        this.client = client;
        this.tier = tier;
    }

    // Getter and setter for client
    public Client getClient() {
        return client;
    }

    // Getter and setter for tier
    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public String toString(){
        return "Client: " + client.getName() + ", Tier: " + tier;
    }
}