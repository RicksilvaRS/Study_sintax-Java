package metodo;

public class usuario {
    public static void main(String[] args) {
        smartTv smartTv = new smartTv();
        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("canal atual ? " + smartTv.canal);
        System.out.println("volume atual ? " + smartTv.volume);
        smartTv.ligar();
        System.out.println("new states-Tv ligada ? " + smartTv.ligada);
    }
}
