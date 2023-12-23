package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс для методов
 * покупатель вошел в магазин
 * покупатель ушел из магазина
 * обновление состояния
 */
public interface iMarcketBehaviour {
    public void acceptToMarket(iActorBehaviour actor);

    public void releseFromMarket(List<Actor> actors);

    public void update();
}
