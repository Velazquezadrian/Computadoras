package pcs;
//clase heredada, metodos de armado de laptops
public class Laptop extends Componentes implements ILaptop{

    private int pulgadas;

    //constructor heredando de Componentes y + pulgadas de la nueva classe
    public Laptop(String mother, String ram, String hdd, int pulgadas) {
        super(mother, ram, hdd);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    //Heredando Metodo Iniciando de clase abstracta Componentes
    @Override
    public void IniciandoSysop() {
        System.out.println("La laptop esta encendida");
    }

    // implementando clase interface de ILaptop
    @Override
    public void laptopHot() {
        System.out.println("La laptop esta sacando humo");
    }

    @Override
    public String toString() {
        return "la Laptop tiene:" +
                " pulgadas=" + pulgadas +", mother=" + getMother() +
                ", ram=" + getRam() +
                " y disco hdd" + getHdd();
    }
}
