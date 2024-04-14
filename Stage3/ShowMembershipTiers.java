import java.util.List;

public class ShowMembershipTiers {
    public static void showMembershipTiers(MembershipFile membershipFile) {
        List<Membership> memberships = membershipFile.getAllMemberships();
        System.out.println("Membership Tiers:");
        for (Membership membership : memberships) {
            System.out.println(membership.getName() + ": " + membership.getDescription());
        }
    }
}