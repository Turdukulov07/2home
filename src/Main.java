public class Main {
    public static void main(String[] args){

        createObject("English").print();
        createObject("Russian").print();
        createObject("Chinese").print();

    }
    public static Language createObject(String className){
        Language language = null;
        switch (className){
            case "English": language = new EnglishLanguage("Англия", 1);
                break;
            case "Russian": language = new RussianLanguage("Россия", 150000000);
                break;
            case "Chinese" : language = new ChineseLanguage("Китай", 1.5);
        }
        return language;
    }
}
