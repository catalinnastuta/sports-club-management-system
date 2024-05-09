package Stage4;

import java.util.HashMap;
import java.io.*;
import javax.swing.JOptionPane;

public class MembershipFile {
    private HashMap<String, Membership> memberships;
    private static final String filename = "memberships.csv";
    private static final String delimiter = ",";

    public MembershipFile() {
        memberships = new HashMap<>();
    }

    public void addMembership(Membership membership) {
        // Only add membership if it belongs to one of the predefined tiers
        if (membership.getTier() == Membership.Tier.BASIC ||
            membership.getTier() == Membership.Tier.STANDARD ||
            membership.getTier() == Membership.Tier.PREMIUM) {
            memberships.put(membership.getClient().getName(), membership);
        } else {
            System.out.println("Invalid membership tier.");
        }
    }

    public void removeMembership(String tier) {
        memberships.remove(tier);
    }

    public Membership getMembership(String tier) {
        return memberships.get(tier);
    }
    
    public Membership getMembershipByClientName(String clientName) {
        return memberships.get(clientName);
    }

    public HashMap<String, Membership> getAllMemberships() {
        return memberships;
    }
}