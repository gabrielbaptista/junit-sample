/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javaunittestsamplev2.Calculo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author gabriell
 */
public class UnitTestCalculo {
    
    public UnitTestCalculo() {
    }
    

    @Test
    public void testeSomar() {
        Calculo cal = new Calculo();
        int valorRecebido = cal.somar(5, 3);
        int valorEsperado = 8;
        assertEquals(valorEsperado,valorRecebido);
    }
    
    @Test
    public void testeMutiplicar() {
        Calculo cal = new Calculo();
        int valorRecebido = cal.multiplicar(5, 3);
        int valorEsperado = 15;
        assertEquals(valorEsperado,valorRecebido);
    }
    
    @Test
    public void testeSubtrair() {
        Calculo cal = new Calculo();
        int valorRecebido = cal.subtrair(5, 3);
        int valorEsperado = 2;
        assertEquals(valorEsperado,valorRecebido);
    }
    
    @Test
    public void testeDivisao() {
        Calculo cal = new Calculo();
        int valorRecebido = cal.dividir(10, 2);
        int valorEsperado = 5;
        assertEquals(valorEsperado,valorRecebido);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testeDivisaoZero() {
        Calculo cal = new Calculo();
        cal.dividir(10, 0);
    }
}
