public class IdleState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        vendingMachine.doDollarInsertedAlert();
        vendingMachine.setCurrentState(vendingMachine.getHasOneDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        vendingMachine.doNoMoneyInsertedAlert();
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        vendingMachine.doNoMoneyInsertedAlert();
    }

}
