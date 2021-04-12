/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseMetier;

/**
 *
 * @author dimmi
 */
public class ConditionsImpots {
//Nous avons creer des methodes statiques
//Il ne faut pas instancier un objet pour utiliser la methode
    public static double CalculerNbParts(boolean estMarie, int nbEnfants)
    {
        double nbParts = 0;
        
        if (estMarie == true) 
        {
            nbParts = ((double)nbEnfants/2)+2;//on mis (double) pour transformer le resultat en double car nbEnfants est (int) et nbParts et (int)
        }
        else
        {
            nbParts = ((double)nbEnfants/2)+1;
        }
        return nbParts;
    }
    public static double CalculerRevenu(double salaire)
    {
        double revenu = 0;
        revenu = Math.round(0.72 * salaire);
        return revenu;
    }
    public static double CalculerQuefitianFamilial(boolean estMarie, int nbEnfants, double salaire)
    {
        double quotFam = 0;
        quotFam = Math.round((double) CalculerRevenu(salaire) / CalculerNbParts(estMarie, nbEnfants));
        return quotFam;
    }
    public static double CalculerImpot(boolean estMarie, int nbEnfants, double salaire)
    {
        double impots = 0;
        impots = Math.round(0.15 *(double) CalculerRevenu(salaire) + CalculerQuefitianFamilial(estMarie, nbEnfants, salaire));
        return impots;
    }
}
