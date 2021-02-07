/**
 * SelfDrivingVehicle
 */
public abstract class SelfDrivingVehicle {

    public void driveToDestination() {
        accelerate();
        steer();
        brake();
        reachDestination();
    }

    private void reachDestination() {
        System.out.println("reach destination");
    }

    abstract void steer();

    abstract void accelerate();

    abstract void brake();

}