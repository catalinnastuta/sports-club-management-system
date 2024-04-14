import java.util.ArrayList;
import java.util.List;


public class MembershipFile {
    private List<Membership> memberships;

    public MembershipFile() {
        memberships = new ArrayList<>();
        initializeMemberships();
    }
    
    public Membership getMembershipByName(String membershipName) {
    for (Membership membership : memberships) {
        if (membership.getName().equalsIgnoreCase(membershipName)) {
            return membership;
        }
    }
    return null; // Membership not found
}

    private void initializeMemberships() {
        //Membership list
        Membership basicMembership = new Membership("Basic", "Basic Membership: $20.00 per month\nBasic membership gives access to workout equipment.");
        Membership standardMembership = new Membership("Standard", "Standard membership: $40.00 per month\nStandard membership gives access to workout equipment and locker storage");        
        Membership premiumMembership = new Membership("Premium", "Premium membership: $60.00 per month\nPremium membership gives acces to both previous tiers with an additon of premium access training rooms");
        
        memberships.add(basicMembership);
        memberships.add(standardMembership);
        memberships.add(premiumMembership);
    }

    public List<Membership> getAllMemberships() {
        return memberships;
    }
    
}