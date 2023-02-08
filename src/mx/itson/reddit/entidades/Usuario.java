package mx.itson.reddit.entidades;

/**
 *
 * @author chiqu
 */
public class Usuario {

    public Usuario() {
    }

    public Usuario(String nombre, int karma, String correo, String password, String pais) {
        this.nombre = nombre;
        this.karma = karma;
        this.correo = correo;
        this.password = password;
        this.pais = pais;
    }
    
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the karma
     */
    public int getKarma() {
        return karma;
    }

    /**
     * @param karma the karma to set
     */
    public void setKarma(int karma) {
        this.karma = karma;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    private String nombre;
    private int karma;
    private String correo;
    private String password;
    private String pais;
    
}
