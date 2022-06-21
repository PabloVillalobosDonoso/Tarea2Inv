import java.util.*;

public class Main {
    public static void main(String[] args) {
        SRFLP a = new SRFLP("C:\\POO proyectos\\Tarea 3 investigacion\\S10.txt");
        int tinicial = 10;
        double alfa = 0.4;

        ArrayList<String> listaPuestos = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        ArrayList<String> solucionInicial = hacerSwap(listaPuestos);
        System.out.println(solucionInicial);
        a.printInstance();

        while (tinicial > 1) {
            ArrayList<String> solucionVecina =hacerSwap(solucionInicial);
            System.out.println(solucionInicial);
            tinicial -= -0.4;
        }
    }
    /* private static double compararSoluciones(ArrayList<String> solucionVecina,ArrayList<String> solucionInicial){
        int [] ordenpuestosSoulicionIniciall, ordenPuestosSolucionVecina;
        for (int i = 0; i < solucionInicial.size(); i++){
        }
    }*/

    private static int normalizarIntervalo(double numeroRandom) {
        if (numeroRandom <= 0.2) {
            return 0;
        }
        if (numeroRandom > 0.2 && numeroRandom <= 0.4) {
            return 1;
        }
        if (numeroRandom > 0.4 && numeroRandom <= 0.6) {
            return 2;
        }
        if (numeroRandom > 0.6 && numeroRandom <= 0.8) {
            return 3;
        } else {
            return 4;
        }

    }

    private static ArrayList<String> hacerSwap(ArrayList<String> puestos){
        int indice1 = normalizarIntervalo(Math.random() * (1));
        int indice2 = normalizarIntervalo(Math.random() * (1));
        Collections.swap(puestos,indice1,indice2);
        return puestos;
    }
}




