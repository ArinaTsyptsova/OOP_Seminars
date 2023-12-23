package Interfaces;

import Classes.Actor;

/**
 * Интерфейс для чертежа кода состояния покупателя в магазине
 * ссылка на класс Actor - реализации состояния класса Inspector
 */
public interface iActorBehaviour {
    // Методы
    public boolean isTakeOrder();

    public boolean isMakeOrder();

    public void setTakeOrder(boolean val);

    public void setMakeOrder(boolean val);

    public Actor getActor();
}
