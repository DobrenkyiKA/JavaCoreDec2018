package javase02.t06_t07;

import java.lang.annotation.*;

public class Ocean {

    public static void main(String[] args) {
        AtomicSubmarine atomicSubmarine = new AtomicSubmarine();

        System.out.println("We are in the Ocean");
        atomicSubmarine.run();
        System.out.println("It's end of the Ocean...");
    }

    @Target(value= ElementType.FIELD)
    @Retention(value= RetentionPolicy.RUNTIME)
    @Documented
    public @interface Name {
        String name();
    }
}


class AtomicSubmarine {
    @Ocean.Name(name="SuperSubmarine")
    String name;
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
