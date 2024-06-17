import agnathans.*;
import java.util.Scanner;

public class AppJava {
    public static FA_Agnathans FA_agnathans = new FA_Agnathans();
    public static FATanqueMutacion FA_tanque = new FATanqueMutacion();

    public static void main(String[] args) {
        ColibriFarinango miAnimal = new ColibriFarinango(" Colibri ");  // Fue el unico nombre que se me vino a la mente :,D
        Scanner scanner = new Scanner(System.in);

        System.out.println(miAnimal.comer());
        System.out.println(miAnimal.moverse());

        System.out.print("Ingresar clave para mutar al animal: ");
        String clave = scanner.nextLine();

        if (FA_tanque.ingresarClave(clave)) {
            FA_tanque.mutar(miAnimal);
        } else {
            System.out.println("Clave incorrecta, no se puede mutar el animal......");
        }

        for (int carga = 0; carga <= 100; carga++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\rCarga: " + carga + "% " + getSpinner(carga));
        }

        scanner.close();
    }

    public static String getSpinner(int carga) {
        int index = carga % 4;
        String[] spinner = { "\\|", "/", "-", "|" };
        return spinner[index];
    }
}





