package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Класс, который описывает методы длясостояния магазина и состояния очереди
 * очереди
 */
public class Market implements iMarcketBehaviour, iQueueBehaviour {
    // Поля
    private List<iActorBehaviour> queue; // Список очереди
    private int maxParticipants; // Количество участников промо акции

    /**
     * Конструктор для магазина c акцией
     * 
     * @param maxParticipants
     */
    public Market(int maxParticipants) {
        this.queue = new ArrayList<iActorBehaviour>();
        setMaxParticipants(maxParticipants);
    }

    /**
     * Конструктор для магазина
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    // Методы
    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int value) {
        if (value < 1) {
            this.maxParticipants = 1;
        } else
            this.maxParticipants = value;
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        if (actor instanceof PromoClient) {
            PromoClient promoClient = (PromoClient) actor;
            if (promoClient.getCountMembers() > maxParticipants) {
                System.out.println("Отказ в обслуживании " + actor.getActor().getName() +
                        ". Превышено количество участников акции.");
            return;
        }
    }
    this.queue.add(actor);
    System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
}

    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

}
