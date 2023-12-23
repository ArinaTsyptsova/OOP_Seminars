package Classes;

import Interfaces.iReturnOrder;

/**
 * Класс для простого клиента
 */
public class OrdinaryClient extends Actor implements iReturnOrder {
    /**
     * Конструктор
     *
     * @param name
     */
    public OrdinaryClient(String name) {
        super(name);
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
