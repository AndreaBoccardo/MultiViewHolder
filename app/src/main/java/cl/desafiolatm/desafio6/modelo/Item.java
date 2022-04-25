package cl.desafiolatm.desafio6.modelo;

public class Item {

    private String mensaje;
    private int imagen;
    private String hora;
    private Tipo tipo;

    public Item() {
        tipo = Tipo.nada;
    }

    public Item(String mensaje) {
        this.mensaje = mensaje;
        tipo = Tipo.header;
    }

    public Item(String mensaje, int imagen, String hora) {
        this.mensaje = mensaje;
        this.imagen = imagen;
        this.hora = hora;
        tipo = Tipo.normal_imagen;
    }

    public Item(String mensaje, String hora) {
        this.mensaje = mensaje;
        this.hora = hora;
        tipo = Tipo.normal_sin_imagen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "mensaje='" + mensaje + '\'' +
                ", imagen=" + imagen +
                ", hora='" + hora + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
