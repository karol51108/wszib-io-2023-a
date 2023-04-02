/**
* To jest program do rozpoznawania trójkąta.
*/

class Trojkaty {
    /**
     * Główna fnukcja programu.
     * @param {float} a - Długość pierwszego boku.
     * @param {float} b - Długość drugiegio boku.
     * @param {float} c - Długość trzeciego boku.
     */
    public static void jakiTrojkat(float a, float b, float c){

    if(a+b > c && a+c > b && b+c > a){
    
         if (a == b && b == c && a == c) {
             System.out.print("Trójkąt równoboczny"); 
         }
         else if (a==b || b==c || c==a){
            System.out.print("Trojkat rownoramienny");
         }
         else if (a != b && b != c && c != a){
            System.out.print("Trojkat roznoboczny");
         }
        
         if ((a*a + b*b)== c*c){
            System.out.println(",  prostokatny");
         }
         else if((a*a + b*b) < c*c){
            System.out.println(", rozwartokatny");
         }
         else if((a*a + b*b) > c*c){
            System.out.println(", ostrokatny");
         }
     }
     else{
        System.out.println("Nie moze byc trojkatem");
     }
         
    }
    /** Wyświetla ekran pomocy */
    public static void pomoc(){
        System.out.println("Acme INC. (C) 2022");
        System.out.println("Program do rozpoznawania rodzaju trójkąta");
        System.out.println("Uruchom z trzema argumentami liczbowymi - długość boków trójkąta");
    }
    /** Glowna funkcja */
    public static void main(String... args) {
        if (args.length != 3) {
            pomoc();
            System.exit(1);
        }
        float a = Float.valueOf(args[0]);
        float b = Float.valueOf(args[1]);
        float c = Float.valueOf(args[2]);
        
        jakiTrojkat(a, b, c);
    }
}
