package javase02.t06;


public class Ocean {

    public static void main(String[] args) {
        AtomicSubmarine atomicSubmarine = new AtomicSubmarine();

        System.out.println("We are in the Ocean");
        atomicSubmarine.run();
        System.out.println("It's end of the Ocean...");
    }
}


class AtomicSubmarine {

    private AtomicEngine atomicEngine = new AtomicEngine();

     public AtomicSubmarine() {
         System.out.println("I am a Submarine!");
     }

     void run() {
         atomicEngine.run();
         System.out.println("We are going...");
     }

         class AtomicEngine {

            AtomicEngine() {
                System.out.println("I am an Engine!");
            }

            void run() {
                System.out.println("Starting....");
            }
        }
}
