package pcs;

import java.util.ArrayList;
import java.util.List;

public class PcMain {
    public static void main(String[] args) {
        Desktop1();
        Laptop1();
//esto es solo para no ocupar espacio en memoria con la lista xq es null
        List<PcMain> listaMain;
    }

    //instanciado de pcs
    public static void Desktop1(){
        Desktop d1 = new Desktop("Asus h310", "32gb", "WD 1tb", "Red Dragon 12", "Red Dragon white", "Samsung 19'");
        Desktop d2 = new Desktop("Asus h510", "16gb", "WD 2tb", "Compucase 1", "Cx black", "Philco 14'");

    //lista de Desktops con bucle para imprimir en pantalla

        List<Desktop> lista = new ArrayList<>();
        lista.add(d1);
        lista.add(d2);

        for(Desktop de: lista){
            System.out.println(de);
        }

        d1.IniciandoSysop();
        d1.apagarPc();
        System.out.println("\n");
    }

    public static void Laptop1() {
        Laptop l1 = new Laptop("Gigabyte", "Sodimm 32gb", "500", 19);

        //lista de Laptops con bucle para imprimir en pantalla

        List<Laptop> lista = new ArrayList<>();
        lista.add(l1);

        for (Laptop la : lista) {
            System.out.println(la);
        }
        l1.IniciandoSysop();
        l1.laptopHot();

        System.out.println("\n");
    }
}
