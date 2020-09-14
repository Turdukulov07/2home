public class ChineseLanguage extends Language implements Printable{
    private double quantity;

    public ChineseLanguage(String country, double quantity) {
        super(country);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }
    @Override
    public void print(){
        System.out.println(" Страна " + getCountry() + " количество " + getQuantity());
    }
}
