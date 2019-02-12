/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabuilder;

/**
 *
 * @author mrebelladofernandez
 */
public class Pizza {

    int grHarina;
    int mlAgua;
    int grSal;
    int mlAceite;
    String tipoAceite;
    int grTomate;
    int grQueso;
    String tipoQueso;
    int grPinha;

    public Pizza(int grHarina, int mlAgua, int grSal, int mlAceite,
            String tipoAceite, int grTomate, int grQueso, String tipoQueso,
            int grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

    @Override
    public String toString() {
        return "Pizza{" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua + 
                ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", tipoAceite="
                + tipoAceite + ", grTomate=" + grTomate + ", grQueso=" 
                + grQueso + ", tipoQueso=" + tipoQueso + ", grPinha=" + grPinha + '}';
    }

    public int getGrHarina() {
        return grHarina;
    }

    public void setGrHarina(int grHarina) {
        this.grHarina = grHarina;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
    }

    public int getGrSal() {
        return grSal;
    }

    public void setGrSal(int grSal) {
        this.grSal = grSal;
    }

    public int getMlAceite() {
        return mlAceite;
    }

    public void setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
    }

    public String getTipoAceite() {
        return tipoAceite;
    }

    public void setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    public int getGrTomate() {
        return grTomate;
    }

    public void setGrTomate(int grTomate) {
        this.grTomate = grTomate;
    }

    public int getGrQueso() {
        return grQueso;
    }

    public void setGrQueso(int grQueso) {
        this.grQueso = grQueso;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public int getGrPinha() {
        return grPinha;
    }

    public void setGrPinha(int grPinha) {
        this.grPinha = grPinha;
    }

    
    
}
