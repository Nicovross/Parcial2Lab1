/*Clase: Empresa
Atributos: cuit (String), razonSocial (String), empleados (ArrayList<Empleado>)
 */
package parcial2nicolásvargas;
import java.util.*;
public class Empresa {
String cuit;
String razonSocial;
ArrayList<Empleado> empleados;

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
