public class program {
    public static void main(String[] args) {
        SelfDrivingVehicle vehicle1 = new SelfDirvingCar();
        vehicle1.driveToDestination();
        SelfDrivingVehicle vehicle2 = new SelfDrivingMotorcycle();
        vehicle2.driveToDestination();
    }
}
