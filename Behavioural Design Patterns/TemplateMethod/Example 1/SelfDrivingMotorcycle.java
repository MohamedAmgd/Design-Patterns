public class SelfDrivingMotorcycle extends SelfDrivingVehicle {

    @Override
    void steer() {
        System.out.println("steer motorcycle");
    }

    @Override
    void accelerate() {
        System.out.println("accelerate motorcycle");
    }

    @Override
    void brake() {
        System.out.println("brake motorcycle");
    }
}
