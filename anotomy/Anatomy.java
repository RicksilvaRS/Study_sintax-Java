package anotomy;

public class Anatomy {

    public static void main(String[] args) {
        String namePrimary = "Rick";
        String segundName = "Silva";
        final String BRA = "Brazil";
        System.out.println(BRA);
        System.out.println("rick");
       String completeName = completeName(namePrimary, segundName);
       System.out.println(completeName);
    }
    public static String completeName (String namePrimary, String segundName){
        return "resultado " + namePrimary.concat(" ").concat(segundName);
    }
}
