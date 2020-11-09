/*Clase: Empleado
Atributos: nombreCompleto (String), legajo (int), salario (double), nivelAcademico
(NivelAcademico)
 */
package parcial2nicolásvargas;
import java.util.*;
public class Empleado {
String nombreCompleto;
int legajo;
double salario;
NivelAcademico nivelAcademico;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelAcademico getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(NivelAcademico nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    public static double salarioTotalCalculado(Empleado e){
    double salarioTotal;
    salarioTotal = e.getSalario() + (e.getSalario() * (e.getNivelAcademico().getPorcentajeAumento()/100));
    return salarioTotal;
    }
}
