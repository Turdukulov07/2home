public class EnglishLanguage extends Language implements Printable {
    private int place;

    public EnglishLanguage(String country, int place) {
        super(country);
        this.place = place;
    }

    public int getPlace() {
        return place;
    }
    @Override
    public void print(){
        System.out.println(" Страна " + getCountry() + " место " + getPlace());
    }
}