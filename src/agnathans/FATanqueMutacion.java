package agnathans;

import java.util.Random;

public class FATanqueMutacion {
    public boolean ingresarClave(String clave) {
        return "321mutar".equals(clave);
    }

    public void mutar(ColibriFarinango animal) {
        Random rand = new Random();
        int radiacion = 100 + rand.nextInt(901);
        System.out.println("Mutando " + animal.nombre + " con " + radiacion + " mSv de radiacion");
    }
}

