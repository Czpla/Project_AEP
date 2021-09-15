/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectaep;

/**
 *
 * @author Eduardo Czpla
 */
public class Batch extends Aviary{
    
    private int nChickens;
    private int nBatch;    
    private String startDate;
    private String endDate;

    public int getnChickens() {
        return nChickens;
    }

    public void setnChickens(int nChickens) {
        this.nChickens = nChickens;
    }

    public int getnBatch() {
        return nBatch;
    }

    public void setnBatch(int nBatch) {
        this.nBatch = nBatch;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public void showBatch(){
        System.out.println("Número do lote: " + this.getnBatch() + 
                          " Quantidade: " + this.getnChickens() +
                          " Data de inicio: " + this.getStartDate() +
                          " Data final: " + this.getEndDate());
    }
}
