import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    BuddyInfo Homer =new BuddyInfo("Homer");
    BuddyInfo Ali =new BuddyInfo("Ali");
    BuddyInfo Babak =new BuddyInfo("Babak");
    BuddyInfo Mahsa =new BuddyInfo("Mahsa");

    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null){myBuddies.add(aBuddy);}
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jhon");
        BuddyInfo buddy1 = new BuddyInfo("Ali");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(0);
    }
}
