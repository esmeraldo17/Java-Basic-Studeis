public class SitemaMedida {
    public static void main(String[] args) {
        String sigla = "G";

        switch (sigla) {
            case "P":{
                System.out.println("pequeno");
                break;
            }
            case "M":{
                System.out.println("Media");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
                break;
        }
    }
}
