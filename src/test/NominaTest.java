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
    EmpleadoAsalariado conBono =new EmpleadoAsalariado("juan v", 3000000, 6);
    EmpleadoAsalariado sinBono =new EmpleadoAsalariado("luis p", 3000000, 3);
    assertTrue(conBono.calcularSalarioNeto() > sinBono.calcularSalarioNeto());}


//      Prueba 2: un empleado con exactamente 5 años no debe recibir el bono de antiguedad. 
//                este bono solo aplica si lleva más de 5 años, no 5 exactos.
@Test
public void testAsalariado_SinBonodeantiguedad() {
    EmpleadoAsalariado cincoAños = new EmpleadoAsalariado("Maria s", 3000000, 5);
    EmpleadoAsalariado seisAños  = new EmpleadoAsalariado("Juan v",  3000000, 6);
    assertTrue(cincoAños.calcularSalarioNeto() < seisAños.calcularSalarioNeto());}


//                                  EMPLEADO POR HORAS

//      Pruba 3: lsa horas extra (+40hrs) se pagan a 1.5x.
//               si se trabajan 45 horas, equivale a 40hrs normales + 5hrs extra.
@Test
public void testPorHoras_HorasExtra() {
    EmpleadoPorHoras emp=new EmpleadoPorHoras("Ana n", 20000, 45, 0, false);
    assertEquals(950000, emp.calcularSalario(), 0.01);}


//      Prueba 4: con solo 40hrs no debe haber pago de horas extra.
//      
@Test
public void testPorHoras_SinHorasExtra() {
    EmpleadoPorHoras emp = new EmpleadoPorHoras("Carlos p", 20000, 40, 0, false);
    assertEquals(800000, emp.calcularSalario(), 0.01);}


//      Prueba 5: si se ingresan horas negativas, el sistema debe lanzar una excepción.
//
@Test
public void testPorHoras_ExcepcionHorasNegativas() {
    assertThrows(IllegalArgumentException.class,()->{
    new EmpleadoPorHoras("Error", 20000, -5, 0, false);});}


//      Prueba 6: el fondo de ahorro es opcional y solo debe estar disponible para empleados con más de un año de antiguedad.
//                si se acepta el fondo de ahorro, el salario neto debe ser menor.
@Test
public void testPorHoras_DescuentoFondodeAhorro() {
    EmpleadoPorHoras conFondo = new EmpleadoPorHoras("Lisa t", 20000, 40, 2, true);
    EmpleadoPorHoras sinFondo = new EmpleadoPorHoras("Mike n", 20000, 40, 2, false);
    assertTrue(conFondo.calcularSalarioNeto() < sinFondo.calcularSalarioNeto());}


//                                  EMPLEADO POR COMISIÓN

//      Prueba 7: si las ventas sobrepasan los 20millones se debe activar el bono del 3%.
//                un empleado con ventas altas debe ganar más que un empleado con ventas bajas.
@Test
public void testComision_BonoPorVentasm20M() {
    EmpleadoPorComision conBono = new EmpleadoPorComision("Luis p", 1500000, 25000000, 0.05);
    EmpleadoPorComision sinBono = new EmpleadoPorComision("Rosa m", 1500000, 10000000, 0.05);
    assertTrue(conBono.calcularSalario() > sinBono.calcularSalario());}


//      Prueba 8: si se ingresan ventas negativas el programa debe lanzar una excepción.
//                
@Test
public void testComision_ExcepcionVNegativas() {
    assertThrows(IllegalArgumentException.class, () -> {
    new EmpleadoPorComision("Error", 1500000, -1000, 0.05);});}


//                                  EMPLEADO TEMPORAL

//      Prueba 9: un empleado temporal solo debe recibir su salario base.
//
@Test
public void testTemporal_SoloSalarioBase() {
    EmpleadoTemporal emp =new EmpleadoTemporal("Sofia j", 1800000);
    assertEquals(1800000, emp.calcularSalario(), 0.01);}



  
}  
