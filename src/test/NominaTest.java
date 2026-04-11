package test;

import model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Pruebas unitarias del sistema de nomina
// Se verificarán las reglas de negocio para cada tipo de emleado

public class NominaTest {

//                                 EMPLEADO ASALARIADO

//      Prueba 1: un empleado con más de 5 años en la empresa debe recibir un bono de antiguedad del 10%.
//                Vamos a compararlo con uno con menos años en la empresa para verificar la diferencia.
@Test
public void testAsalariado_ConBonodeantiguedad() {
    EmpleadoAsalariado conBono =new EmpleadoAsalariado("juan v", 2000000, 6);
    EmpleadoAsalariado sinBono =new EmpleadoAsalariado("luis p", 2000000, 3);
    assertTrue(conBono.calcularSalarioNeto() > sinBono.calcularSalarioNeto());}


//      Prueba 2: un empleado con exactamente 5 años no debe recibir el bono de antiguedad. 
//                este bono solo aplica si lleva más de 5 años, no 5 exactos.
@Test
    public void testAsalariado_SinBonodeantiguedad() {
        EmpleadoAsalariado cincoAños = new EmpleadoAsalariado("Maria s", 2000000, 5);
        EmpleadoAsalariado seisAños  = new EmpleadoAsalariado("Juan v",  2000000, 6);
        assertTrue(cincoAños.calcularSalarioNeto() < seisAños.calcularSalarioNeto());}






}  
