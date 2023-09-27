public class Main {
   public static void main(String[] args) {
       System.out.println("Hello World");
       System.out.println("ABS");

       //Variable: Eine Spreichrung für einen Wert
       //Datentyp: Gibt an, Welche art die Variable ist

       int number = 3; // Variable für ganze und negative Zahlen
       System.out.println(number);

       //Andere Variablentype:
       String text = "Dies ist eine Textvariable"; //Ein String kann Texte Speichern
       double dezi = 1.37273; //Dieser Typ kann zahlen mit Nachkommastellen Speichern.
       boolean los = true; //Dieser Type kann nur mit True oder False gesetzt werden und wird in vielen dingen bei Java verwendet.

       // Diese variablen lassen sich jetzt Auch in einer Textausgabe kombinieren da eine Textausgabe immer ein String ist müssen die genannten
       // Variablen immer mit einem + getrennt werden
       // Beispiel
       System.out.println("Hochgerechnet " + dezi + " Menschen sind verstorben diese Therorie ist: " + los);
       System.out.println(text);

       //Man kann auch einen Rechenaufgabe stellen:
       int zahl1 = 4;
       int zahl2 = 10;
       int sum = zahl1 + zahl2; // Hierbei werden beide Zahlen addiert.
       System.out.println("Das ergebniss ist: " + sum);

       //Man kann variablen auch anders definieren hierbei unterscheidet man zwischen 2 Formen

       int integer; //Hiermit wird die Variable erstellt und kann Später im Code einen Zuweisung erhalten
       integer = 3; //Die Zuweisung (Das gleiche gilt für den String)
       String word;
       word = "Ein Wort";
   }
}
