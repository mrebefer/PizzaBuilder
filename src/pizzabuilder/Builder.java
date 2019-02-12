/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabuilder;

public class Builder {

    private int grHarina = 0;
    private int mlAgua = 0;
    private int grSal;
    private int mlAceite;
    private String tipoAceite;
    private int grTomate;
    private int grQueso;
    private String tipoQueso;
    private int grPinha;

    public Builder(int grHarina,int mlAgua) {
        this.grHarina=grHarina;
        this.mlAgua=mlAgua;
    }

    public Builder setGrSal(int grSal) {
        this.grSal = grSal;
        return this;
    }

    public Builder setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public Builder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public Builder setGrTomate(int grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public Builder setGrQueso(int grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public Builder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public Builder setGrPinha(int grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grTomate, grQueso, tipoQueso, grPinha);
    }

}
