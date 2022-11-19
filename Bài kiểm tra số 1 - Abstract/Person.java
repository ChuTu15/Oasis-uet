import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove vehicle from the list.
     * 
     * @param registrationNumber the registration number of the vehicle
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicleList.get(i));
                i--;
            }
        }
    }

    /**
     * get the vehicle list.
     * 
     * @return vehicle list
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return name + " has no vehicle!";
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append(name + " has:\n\n");
            for (int i = 0; i < vehicleList.size(); i++) {
                sb.append(vehicleList.get(i).getInfo());
            }
            return sb.toString();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
