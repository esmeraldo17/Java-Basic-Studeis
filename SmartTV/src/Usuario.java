public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.diminurVolume();
        smartTv.diminurVolume();

        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(14);
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
    }
}
