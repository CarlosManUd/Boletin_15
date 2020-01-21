package personal;

/**
 *
 * @author cfigueirasvalverde
 */
public class Personal {
    String Telefono;
    String Correo;

    public Personal(String Telefono, String Correo) {
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    
    @Override
    public String toString() {
        return "Persoal{" + "Telefono=" + Telefono + ", Correo=" + Correo + '}';
    }
    
}