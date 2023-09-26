package salidas;

public class Respuesta {
    private String codigo;
    private String descripcion;

    public Respuesta() {

    }

    public Respuesta(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
