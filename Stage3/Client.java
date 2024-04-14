public class Client extends Person {
    private Membership membership;

    public Client(String name, String email, String phone) {
        super(name, email, phone);
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public String getMembershipString() {
        if (membership != null) {
            return membership.getName();
        } else {
            return "No Membership";
        }
    }
    
}