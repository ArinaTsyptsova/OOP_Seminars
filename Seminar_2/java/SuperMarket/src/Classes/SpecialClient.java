package Classes;

import Interfaces.iReturnOrder;

/**
 * Класс для vip клиента
 */
public class SpecialClient extends Actor implements iReturnOrder {
    // Поле
    private int idVIP; // id покупателя

    /**
     * Конструктор
     * 
     * @param name
     * @param idVIP
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    // Методы
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor getActor() {
        return this;
    }
}