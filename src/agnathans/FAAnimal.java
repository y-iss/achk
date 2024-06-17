package agnathans;

public class FAAnimal {
    protected String nombre;

    public FAAnimal(String nombre) {
        this.nombre = nombre;
    }

    public String comer() {
        return nombre + " esta comiendo ";
    }

    public String moverse() {
        return nombre + " se esta moviendo ";
    }
}

