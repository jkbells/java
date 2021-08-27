public class Math {
    
    public double sqrt(int x, double guess){
        System.out.println("Calculating sqrt of" + x + "Starting with guess" + guess);
        return 1.0;
    }

    // Overloaded method --- for 'default' argument
    public double sqrt(int x){
        double guess = 1.0;
        return sqrt(x, guess);
    }

 
    public static void main(String args[]){
        Math m = new Math();

        m.sqrt(36, 4.3);

        m.sqrt(36);   // 02 make guess optional
    }
}