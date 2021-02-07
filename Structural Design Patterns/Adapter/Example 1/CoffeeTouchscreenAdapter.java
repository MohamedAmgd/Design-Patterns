/**
 * CoffeeTouchscreenAdapter
 */
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine mOldCoffeeMachine = new OldCoffeeMachine();

    @Override
    public void chooseFirstSelection() {
        mOldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        mOldCoffeeMachine.selectB();
    }

}