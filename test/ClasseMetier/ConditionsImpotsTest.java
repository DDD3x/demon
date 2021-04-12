/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseMetier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dimmi
 */
public class ConditionsImpotsTest {
    
    public ConditionsImpotsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CalculerNbParts method, of class ConditionsImpots.
     */
    @Test
    public void testCalculerNbParts() {
        System.out.println("CalculerNbParts");
        boolean estMarie = false;
        int nbEnfants = 0;
        double expResult = 1.0;
        double result = ConditionsImpots.CalculerNbParts(estMarie, nbEnfants);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
//        Cas nr*2 ==> pas marié avec 3 enfants
        nbEnfants = 3;
        expResult = 2.5;
        result = ConditionsImpots.CalculerNbParts(estMarie, nbEnfants);
        assertEquals(expResult, result, 0.0);
        
//        Cas nr*3 ==> marié avec 0 enfants
        estMarie = true;
        nbEnfants = 0;
        expResult = 2.0;
        result = ConditionsImpots.CalculerNbParts(estMarie, nbEnfants);
        assertEquals(expResult, result, 0.0);

//        Cas nr*3 ==> marié avec 3 enfants
        estMarie = true;
        nbEnfants = 3;
        expResult = 3.5;
        result = ConditionsImpots.CalculerNbParts(estMarie, nbEnfants);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of CalculerRevenu method, of class ConditionsImpots.
     */
    @Test
    public void testCalculerRevenu() {
        System.out.println("CalculerRevenu");
        double salaire = 1234.56;
        double expResult = 889.0;
        double result = ConditionsImpots.CalculerRevenu(salaire);
        assertEquals(expResult, result, 0.0);
        
        salaire = 4674.17;
        expResult = 3365;
        result = ConditionsImpots.CalculerRevenu(salaire);
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of CalculerQuefitianFamilial method, of class ConditionsImpots.
     */
    @Test
    public void testCalculerQuefitianFamilial() {
        System.out.println("CalculerQuefitianFamilial");
        boolean estMarie = false;
        int nbEnfants = 0;
        double salaire = 1234.56;
        double expResult = 889.0;
        double result = ConditionsImpots.CalculerQuefitianFamilial(estMarie, nbEnfants, salaire);
        assertEquals(expResult, result, 0.0);
        
//        Cas nr*2 avec 3 enfants
        nbEnfants = 3;
        expResult = 356;
        result = ConditionsImpots.CalculerQuefitianFamilial(estMarie, nbEnfants, salaire);
        assertEquals(expResult, result, 0.0);
        
//        Cas nr*3 marié avec 0 enfants
        estMarie = true;
        nbEnfants = 0;
        expResult = 445;
        result = ConditionsImpots.CalculerQuefitianFamilial(estMarie, nbEnfants, salaire);
        assertEquals(expResult, result, 0.0);
        
//        Cas nr*4 marié avec 3 enfants
        nbEnfants = 4;
        expResult = 222;
        result = ConditionsImpots.CalculerQuefitianFamilial(estMarie, nbEnfants, salaire);
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of CalculerImpot method, of class ConditionsImpots.
     */
    @Test
    public void testCalculerImpot() {
        System.out.println("CalculerImpot");
        boolean estMarie = false;
        int nbEnfants = 0;
        double salaire = 1234.56;
        double expResult = 1022;
        double result = ConditionsImpots.CalculerImpot(estMarie, nbEnfants, salaire);
        assertEquals(expResult, result, 0.0);
        
        nbEnfants = 3;
        salaire = 1234.56;
        expResult = 489;
        result = ConditionsImpots.CalculerImpot(estMarie, nbEnfants, salaire);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
