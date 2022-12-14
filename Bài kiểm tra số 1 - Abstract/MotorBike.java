public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String brand, String model, String registrationNumber, 
                    Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    @Override
    public String getInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append("Motor Bike:\n");
        sb.append("\t" + "Brand: " + this.brand + "\n");
        sb.append("\t" + "Model: " + this.model + "\n");
        sb.append("\t" + "Registration Number: " + this.registrationNumber + "\n");
        sb.append("\t" + "Has Side Car: " + this.hasSidecar + "\n");
        sb.append("\t" + "Belongs to " + this.owner.getName() 
                    + " - " + this.owner.getAddress() + "\n");
        return sb.toString();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSideCar) {
        this.hasSidecar = hasSideCar;
    }
}
