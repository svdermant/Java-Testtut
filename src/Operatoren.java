public class Operatoren {
    public static void main(String[] args) {
        //Logische Operatoren sind Grundlage in Java für Professionalen Code
        // ! <- Nicht Operator (Beispiel if (!(temperatur > 20)) Wenn temparatur nicht > 20
        // Bedeutet das gleiche wie (Temparatur <= 20)

        double temperatur = 25.5;

        if (!(temperatur > 20)) {
            System.out.println("Unangenehm");
        } else {
            System.out.println("Angenehm");
        }
    }
}
