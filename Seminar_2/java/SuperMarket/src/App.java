import Classes.*;

import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        // Магазин с акцией
        Market svetofor = new Market(2);

        // Участники акции
        iActorBehaviour promoClient1 = new PromoClient("Orina", "Sale");
        iActorBehaviour promoClient2 = new PromoClient("Alex", "Sale");

        svetofor.acceptToMarket(promoClient1);
        svetofor.acceptToMarket(promoClient2);

        svetofor.update();

        // Создание участника акции, которому будет отказано
        iActorBehaviour promoClientFalse = new PromoClient("Jena", "Sale");

        svetofor.acceptToMarket(promoClientFalse);

        svetofor.update();

        // Второй магазин
        Market good = new Market();

        // Покупатель, который вернет заказ
        OrdinaryClient ordinaryClient = new OrdinaryClient("Innocent");

        good.acceptToMarket(ordinaryClient);
        good.update();
        good.giveOrder();
        ordinaryClient.returnOrder(ordinaryClient);

        // Магазин обычный

        Market magnit = new Market();

        // Покупатели
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Masha");
        iActorBehaviour client3 = new SpecialClient("President", 1);
        iActorBehaviour client4 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();
    }
}
