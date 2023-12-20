package Classes;

/**
 *
 * @author new
 */
public class Passenger {
    private Name name;
    private Address address;
    private String telNum;

    public Passenger() {
        
        name = new Name();
        address = new Address();
        this.telNum = "";
    }

    public Passenger(Name name, Address address, String telNum) {
        this.name = name;
        this.address = address;
        this.telNum = telNum;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void settelNum(String telNum) {
        this.telNum = telNum;
    }
    
    public Name getName() {
        return name;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public String gettelNum() {
        return telNum;
    }

    @Override
    public String toString() {
        return name + "@" + address + "@" + telNum;
    }
     
      
}
