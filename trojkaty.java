/**
* To jest program do rozpoznawania trójkąta.
*/

class Trojkaty {
    /**
     * Główna funkcja programu.
     * @param {float} a - Długość pierwszego boku.
     * @param {float} b - Długość drugiego boku.
     * @param {float} c - Długość trzeciego boku.
     */
    public static void jakiTrojkat(float a, float b, float c){

    if(a==0|b==0|c==0){
    	System.out.println("Dlugosci bokow nie moga byc ujemne");
    }
    else{
    if(a+b > c && a+c > b && b+c > a){
    
         if (a == b && a == c) {
             System.out.print("Trójkąt równoboczny"); 
         }
         else if (a==b || b==c || c==a){
            System.out.print("Trojkat rownoramienny");
         }
         else if (a != b && b != c){
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
    }

    public static boolean czyProstokatny(float a, float b, float c){
                   if (a * a + b * b == c*c) return true;
                   if (b * b + c * c == a*a) return true;
                   if (a * a + c * c == b*b) return true;
                   return false;
               }


    /** Wyświetla ekran pomocy */
    public static void pomoc(){
        System.out.println("Acme INC. (C) 2022");
        System.out.println("Program do rozpoznawania rodzaju trójkąta");
        System.out.println("Uruchom z trzema argumentami liczbowymi - długości boków trójkąta");
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
