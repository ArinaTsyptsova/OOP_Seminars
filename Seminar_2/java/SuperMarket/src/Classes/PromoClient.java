package Classes;

/**
 * Класс для участников акции
 */
public class PromoClient extends Actor {
    // Поля
    private String promoName; // Название акции
    private int idPromoClient; // id участника акции
    private static int countMembers; // счетчик участников акции

    /**
     * Конструктор
     * 
     * @param name
     * @param promoName
     */
    public PromoClient(String name, String promoName) {
        super(name);
        this.promoName = promoName;
        countMembers++;
    }

    // Методы
    public String getPromoName() {
        return promoName;
    }

    public int getIdPromoClient() {
        return idPromoClient;
    }

    public static int getCountMembers() {
        return countMembers;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    @Override
    public Actor getActor() {
        return this;
    }
}
