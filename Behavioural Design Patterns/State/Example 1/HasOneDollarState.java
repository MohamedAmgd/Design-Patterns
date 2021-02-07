public class HasOneDollarState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        vendingMachine.doAlreadyInserted();
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        vendingMachine.doReturnMoney();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        vendingMachine.doReleasingProduct();
        if (vendingMachine.getCount() > 0) {
            vendingMachine.setCurrentState(vendingMachine.getIdleState());
        } else {
            vendingMachine.setCurrentState(vendingMachine.getOutOfStockState());
        }
    }

}
