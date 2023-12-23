package Interfaces;



/**
 * Интерфейс для методов
 * вхождение в очередь
 * выход из очереди
 * заказ
 * получение заказа
 */
public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor);

    public void releaseFromQueue();

    public void takeOrder();

    public void giveOrder();
}
