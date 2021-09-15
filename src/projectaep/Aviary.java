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
public class Aviary {
    
    Home home = new Home();
    
    private int name;
    private int size;
    
    Scanner scan = new Scanner(System.in);

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createAviary() throws IOException {
        System.out.println("Digite o nome: ");
        this.setName(scan.nextInt());
        
        System.out.println("Digite o tamanho: ");
        this.setSize(scan.nextInt()); 
        
        home.main();
    }
}
