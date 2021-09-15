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
public class Home {
    
    public void main() throws IOException {
        
        Bird bird = new Bird();
        
        Scanner scan = new Scanner(System.in);
        
        int option;
        
        System.out.println("Escolha uma opção no menu abaixo: ");
        System.out.println("[ 1 ] - Cadastrar Aviário");
        System.out.println("[ 2 ] - Cadastrar Lote");
        System.out.println("[ 3 ] - Editar Lote");
        System.out.println("[ 4 ] - Sair");
        option = scan.nextInt();
        
        switch (option) {
           case 1:
              bird.createAviary();
              break;
            case 2:
              bird.createBatch();
              break;
            case 3:
              bird.editBatch();
              break;
            case 4:
              System.exit(0);
              break;
            default:
              System.out.println("Opcão inválida.");
        }
        
        Runtime.getRuntime().exec("cls");
    }
}
