import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }
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
        BuddyInfo buddy = new BuddyInfo("Jhon", "123");
        BuddyInfo buddy1 = new BuddyInfo("Ali", "123");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(0);
    }
}
