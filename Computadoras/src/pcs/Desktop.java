package pcs;
//clase heredada metodos de armado de desktops
public class Desktop extends Componentes implements IDesktop{

    private String teclado;
    private String mouse;
    private String monitor;

    //constructor heredando de Componentes y atributos de la nueva classe
    public Desktop(String mother, String ram, String hdd, String teclado, String mouse, String monitor) {
        super(mother, ram, hdd);
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {

        this.monitor = monitor;
    }

    //Heredando Metodo Iniciando de clase abstracta Componentes
    @Override
    public void IniciandoSysop() {
        System.out.println("Su pc de escritorio se esta encendiendo");;
    }

    // implementando clase interface de IDesktop
    @Override
    public void apagarPc() {
        System.out.println("La pc se esta apagando");
    }

    @Override
    public String toString() {
        return "La computadora de escritorio tiene: " +
                "teclado=" + teclado + ", mouse=" + mouse +
                ", monitor=" + monitor +
                ", mother=" + getMother() +
                ", ram=" + getRam() +
                " y disco hdd" + getHdd()
                ;
    }
}
