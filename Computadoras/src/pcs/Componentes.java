package pcs;
//clase abstracta
public abstract class Componentes {

    private String mother;
    private String ram;
    private String hdd;

    //Constructor
    public Componentes(String mother, String ram, String hdd) {
        this.mother = mother;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void IniciandoSysop(){
        System.out.println();
    }
}
