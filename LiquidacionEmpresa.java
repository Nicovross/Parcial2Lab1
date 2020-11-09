/*
4- Finalmente mostrar por pantalla la siguiente información:
Empresa: XXXXX
CUIT: XXXXXXXXXXX
------------------------Empleados------------------------------
Nombre Completo: XXXXXX
Salario: $ XXXXXX
Nivel Educativo: XXXXXX (Porcentaje Aumento XX %)
---------------------------------------------------------------------
Nombre Completo: XXXXXX
Salario: $ XXXXXX
Nivel Educativo: XXXXXX (Porcentaje Aumento XX %)
---------------------------------------------------------------------
Nombre Completo: XXXXXX
Salario: $ XXXXXX
Nivel Educativo: XXXXXX (Porcentaje Aumento XX %)
---------------------------------------------------------------------
………..
Resumen:
El promedio de los salarios de la empresa es: $ XXXXXX
El empleado con mejor salario es:
Nombre Completo: XXXXXX
Salario: $ XXXXXX
Nivel Educativo: XXXXXX (Porcentaje Aumento XX %)
NOTA: DEBERA CODIFICAR LA LOGICA NECESARIA QUE CALCULE EL PROMEDIO DE SALARIOS Y
ENCUENTRE AL EMPLEADO CON MEJOR SALARIO, TENGA EN CUENTA DE CONTEMPLAR EL SALARIO
TOTAL DEL EMPLEADO Y NO UNICAMENTE EL ATRIBUTO SALARIO.
 */
package parcial2nicolásvargas;
import java.util.*;
public class LiquidacionEmpresa {
    ArrayList<NivelAcademico> nivelesAcademicos = new ArrayList<NivelAcademico>();
    
    static NivelAcademico secundario = new NivelAcademico();
    static NivelAcademico universitario = new NivelAcademico();
    static NivelAcademico maestria = new NivelAcademico();
    static NivelAcademico doctorado = new NivelAcademico();
    

    public static void main(String[] args) {
    secundario.setCodigo(10);
    secundario.setNivel("Secundario Completo");
    secundario.setPorcentajeAumento(10);
    universitario.setCodigo(20);
    universitario.setNivel("Universitario Completo");
    universitario.setPorcentajeAumento(30);
    maestria.setCodigo(30);
    maestria.setNivel("Maestría Completa");
    maestria.setPorcentajeAumento(40);
    doctorado.setCodigo(40);
    doctorado.setNivel("Doctorado Completo");
    doctorado.setPorcentajeAumento(50);
    
    Empresa empresa = new Empresa();
    empresa.setRazonSocial(razonSocial());
    empresa.setCuit(cuit());
    empresa.setEmpleados(listaEmpleados());
    imprimirInfo(empresa);
    }
    
    public static String razonSocial(){
    System.out.println("INGRESE EL NOMBRE DE LA EMPRESA");
    
    while (true){
        try{
    String cadena = new Scanner(System.in).nextLine();
        if (cadena.isEmpty()){
            System.out.println("INGRESE UN NOMBRE CORRECTO");
        }
        else{
            return cadena;
        }
    }
    catch(Exception e){}   
}   
}
public static String cuit(){
    System.out.println("INGRESE UN NÚMERO DE ONCE CIFRAS");
    while (true){
        try{
    String cadena = new Scanner(System.in).nextLine();
        if (cadena.length()<11){
            System.out.println("DEBE CONTENER ONCE CIFRAS");
        }
        else{
            return cadena;
        }
    }
    catch(Exception e){}   
}   
}
public static ArrayList<Empleado> listaEmpleados(){
ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    while (true){
    empleados.add(cargaEmpleado());
    for (int i = 0; i<empleados.size()-1;i++){
    if (empleados.get(i).getLegajo() == empleados.get(empleados.size()-1).getLegajo()){
    System.out.println("EL LEGAJO INGRESADO YA FUE CARGADO ANTERIORMENTE");
    empleados.get(empleados.size()-1).setLegajo(legajoEmpleado());
    }
    }
    System.out.println("INGRESE 'N' SI NO DESEA SEGUIR CARGANDO EMPLEADOS");
    String opcion = new Scanner(System.in).nextLine();
        if (opcion.equalsIgnoreCase("N")){
            break;
        }
    }
return empleados;
}
public static Empleado cargaEmpleado(){
System.out.println("CARGA DE EMPLEADOS: ");
Empleado empleado = new Empleado();
empleado.setNombreCompleto(nombreEmpleado());
empleado.setLegajo(legajoEmpleado());
empleado.setSalario(salarioEmpleado());
empleado.setNivelAcademico(nivelEmpleado());
return empleado;
}
public static String nombreEmpleado(){
    System.out.println("INGRESE UN NOMBRE COMPLETO");
    while (true){
        try{
    String cadena = new Scanner(System.in).nextLine();
        if (cadena.isEmpty()){
            System.out.println("INGRESE UN NOMBRE COMPLETO");
        }
        else{
            return cadena;
        }
    }
    catch(Exception e){}   
}   
}
public static int legajoEmpleado(){
    System.out.println("INGRESE UN NÚMERO DE LEGAJO");
    while (true){
    try{
        int numero = new Scanner(System.in).nextInt();
        if (numero == 0){
            System.out.println("INGRESE UNA NÚMERO CORRECTO");
        }
        else{
            return numero;
        }
    }
    catch(Exception e){}
}   
}
public static double salarioEmpleado(){
    System.out.println("INGRESE UN SALARIO");
    while (true){
        try{
    double numero = new Scanner(System.in).nextDouble();
        if (numero <= 0){
            System.out.println("INGRESE UNA NÚMERO MAYOR A CERO");
        }
        else{
            return numero;
        }
    } 
    catch(Exception e){}   
}
}
public static NivelAcademico nivelEmpleado(){
System.out.println("INGRESE UN CÓDIGO");
    while (true){
    try{
        int numero = new Scanner(System.in).nextInt();
        
        if (numero == 10 || numero == 20 || numero == 30 || numero == 40){
            if (numero == secundario.getCodigo()){
                return secundario;
            }
            if (numero == universitario.getCodigo()){
            return universitario;
            }
            if (numero == maestria.getCodigo()){
            return maestria;
            }
            if (numero == doctorado.getCodigo()){
            return doctorado;
            }
        }
        else{
            System.out.println("EL CÓDIGO INGRESADO NO EXISTE, INTENTE NUEVAMENTE");}
    }
    catch(Exception e){}
} 
}
public static void imprimirEmp(ArrayList<Empleado> ale){
for (Empleado e: ale){
System.out.println("Nombre Completo: " + e.getNombreCompleto() );
System.out.println("Salario: $" + e.salarioTotalCalculado(e));
System.out.println("Nivel Académico: " + e.getNivelAcademico().getNivel() + "(Porcentaje de aumento: %" + e.getNivelAcademico().getPorcentajeAumento()+")");
System.out.println("---------------------------------------------------------------");
}
}
public static Empleado mejorSalario(ArrayList<Empleado> ale){
Empleado mejor = new Empleado();
double salarioalto = 0;
for (Empleado e: ale){
if (e.salarioTotalCalculado(e)> salarioalto){
salarioalto = e.salarioTotalCalculado(e);
mejor.setNombreCompleto(e.getNombreCompleto());
mejor.setSalario(e.getSalario());
mejor.setLegajo(e.getLegajo());
mejor.setNivelAcademico(e.getNivelAcademico());
}
}
return mejor;
}
public static void imprimirRes(ArrayList<Empleado> ale){
System.out.println("El promedio de los salarios de la empresa es: $" + promedioSalario(ale));
System.out.println("El empleado con mejor salario es: ");
System.out.println("Nombre Completo: " + mejorSalario(ale).getNombreCompleto());
System.out.println("Salario: " + mejorSalario(ale).salarioTotalCalculado(mejorSalario(ale)));
System.out.println("Nivel educativo: " + mejorSalario(ale).getNivelAcademico().getNivel() + "(Porcentaje Aumento %)" + mejorSalario(ale).getNivelAcademico().getPorcentajeAumento());
}
public static double promedioSalario(ArrayList<Empleado> ale){
int cantempleados = 0;
double promedioSalario = 0;
for (Empleado e: ale){
cantempleados ++;
promedioSalario += e.salarioTotalCalculado(e);
}
promedioSalario = promedioSalario/cantempleados;
return promedioSalario;
}
public static void imprimirInfo(Empresa mp){
System.out.println(mp.getRazonSocial());
System.out.println(mp.getCuit());
System.out.println("------------------------Empleados------------------------------");
imprimirEmp(mp.getEmpleados());
imprimirRes(mp.getEmpleados());

}
} 


