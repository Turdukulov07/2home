public class RussianLanguage extends Language implements Printable{
    private int populatiion;

    public RussianLanguage(String country, int populatiion) {
        super(country);
        this.populatiion = populatiion;
    }

    public int getPopulatiion() {
        return populatiion;
    }
    @Override
    public void print(){
        System.out.println(" Страна " + getCountry() + " население " + getPopulatiion());
    }
}
