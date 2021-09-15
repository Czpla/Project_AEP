/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectaep;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Eduardo Czpla
 */
public class Batch extends Aviary{
    
    private int nChickens;
    private int nBatch;    
    private String startDate;
    private String endDate;
    int dead[] = new int[31];
    double weight[] = new double[31];
    
    Scanner scan = new Scanner(System.in);
    
    Home home = new Home();

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
    
    public void showBatch() throws IOException{
        System.out.println("Número do lote: " + this.getnBatch() + 
                          " Quantidade: " + this.getnChickens() +
                          " Data de inicio: " + this.getStartDate() +
                          " Data final: " + this.getEndDate());
        
        System.out.println("Digite uma tecla para voltar para menu inicial: ");
        scan.next();
        
        home.main();
    }
    
    public void createBatch() throws IOException {
        System.out.println("Digite a quantidade: ");
        this.setnChickens(scan.nextInt());
        
        System.out.println("Digite o lote: ");
        this.setnBatch(scan.nextInt());   
        
        System.out.println("Digite a data inicial: ");
        this.setStartDate(scan.next());   
        
        System.out.println("Digite a data final: ");
        this.setEndDate(scan.next()); 
        
        home.main();
    }
    
    public void editBatch() throws IOException {
        for (int i = 1; i < 31; i++) {
            System.out.println("Digite a quantidade de mortos do dia " + i + " : ");
            dead[i] = scan.nextInt();
            
            System.out.println("Digite o peso do dia " + i + " : ");
            weight[i] = scan.nextDouble();
        }
        
        for (int i = 1; i < 31; i++) {
            System.out.println("Historico do dia: " + i + ", Mortos: " + 
                                this.getDead()[i] + " Peso: " + this.getWeight()[i]);
        }
        
        System.out.println("Digite uma tecla para voltar para menu inicial: ");
        scan.next();
        
        home.main();
    }

    public int[] getDead() {
        return dead;
    }

    public double[] getWeight() {
        return weight;
    }
}
