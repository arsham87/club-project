import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    //question 1
    private ArrayList<Membership>members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // question 1
        members= new ArrayList<>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    /**
* Determine the number of members who joined in the
* given month.
* @param month The month we are interested in.
* @return The number of members who joined in that month.
*/
public int joinedInMonth(int month){
if (month<=0 || month>12){
    System.out.println("invalid Month:" + month);
    return 0;
}
else {
    int count=  0;
    for (Membership m : members) {
        if (m.getMonth()==month){
            count++;
        }
    }
    return count;
}
}
/**
* Remove from the club's collection all members who
* joined in the given month, and return them stored
* in a separate collection object.
* @param month The month of the membership.
* @param year The year of the membership.
* @return The members who joined in the given month and year.
*/
public ArrayList<Membership> purge(int month, int year){
    if (month<=0 || month>12){
        System.out.println("invalid month:" + month);
        return null;
    }else if (year<=1900 || year>2026) {
        System.out.println("invalid year:" +year);
        return null;
    }else {
        ArrayList<Membership> removals= new ArrayList();
        for (Membership m : members) 
        if (m.getMonth()==month && m.getYear()==year){
            System.out.println("Membership found in" + month + "/" + year);
        }
        return removals;
    }
}
}


