public class SelfDirvingCar extends SelfDrivingVehicle {

    @Override
    void steer() {
        System.out.println("steer car");
    }

    @Override
    void accelerate() {
        System.out.println("accelerate car");
    }

    @Override
    void brake() {
        System.out.println("brake car");
    }

}
