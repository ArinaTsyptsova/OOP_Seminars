package Classes;

import Interfaces.iActorBehaviour;

/*
 * Абстрактный класс для покупателя
 */
public abstract class Actor implements iActorBehaviour {
    // Поля
    protected String name; // Имя покупателя
    protected boolean isTakeOrder; // Переход состояния покупателя
    protected boolean isMakeOrder; // Переход состояния покупателя
    protected boolean isReturned; // Переход состояния покупателя

    /**
     * Конструктор
     * 
     * @param name
     */
    public Actor(String name) {
        this.name = name;
    }

    // Методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public void returnOrder(Actor actor) {
        if (isTakeOrder()) {
            setTakeOrder(false);
            setMakeOrder(false);
            setReturned(true);
            System.out.println(getName() + " клиент вернул товар");
        }
    }
}