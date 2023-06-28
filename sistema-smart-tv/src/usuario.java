public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " +smartTV.ligada);
        System.out.println("Canal: " +smartTV.canal);
        System.out.println("Volume: " +smartTV.volume);

        smartTV.ligar ();
        System.out.println("Novo status -> Tv ligada: " +smartTV.ligada);

        System.out.println("Canal atual: " +smartTV.canal);

        smartTV.mudarCanal(5);

        System.out.println("Canal Atual: " +smartTV.canal);

        smartTV.aumentarVolume ();
        System.out.println("Novo status -> Volume: " +smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Novo status -> Volume: " +smartTV.volume);
    }
}
