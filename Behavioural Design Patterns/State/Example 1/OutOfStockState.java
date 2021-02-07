public class OutOfStockState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        vendingMachine.doReturnMoney();
        vendingMachine.doOutOfStockAlert();
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        vendingMachine.doNoMoneyInsertedAlert();
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        vendingMachine.doOutOfStockAlert();
    }

}
