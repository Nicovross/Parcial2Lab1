/*Clase: NivelAcademico
Atributos: código (int), nivel (String), porcentajeAumento (double)
 */
package parcial2nicolásvargas;
import java.util.*;
public class NivelAcademico {
int codigo;
String nivel;
double porcentajeAumento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

}
