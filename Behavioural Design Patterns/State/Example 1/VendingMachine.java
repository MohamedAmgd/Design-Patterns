/**
 * VendingMachine
 */
public class VendingMachine {

    private State hasOneDollarState;
    private State idleState;
    private State outOfStockState;

    private State currentState;

    private int count;

    public VendingMachine(int count) {
        hasOneDollarState = new HasOneDollarState();
        idleState = new IdleState();
        outOfStockState = new OutOfStockState();

        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getCount() {
        return count;
    }

    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void doReturnMoney() {
        System.out.println("Returning money");
    }

    public void doReleasingProduct() {
        System.out.println("releasing product");
    }

    public void doAlreadyInserted() {
        System.out.println("one dollar already inserted");
    }

    public void doOutOfStockAlert() {
        System.out.println("Out of Stock");
    }

    public void doDollarInsertedAlert() {
        System.out.println("Dollar inserted");
    }

    public void doNoMoneyInsertedAlert() {
        System.out.println("No money inserted");
    }

}