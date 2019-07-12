/****************************************

nome: Lorena Braghini Miranda

nusp: 11208120

*****************************************/


import java.util.*;

public class Ep1 {

     public static void main(String[] args) {
    
          Scanner sc = new Scanner(System.in, "UTF-8");


          int numcargos = sc.nextInt();
          String nomecargos[] = new String[numcargos];
          double[][] pesos = new double [numcargos][14];

               String s = sc.nextLine();

               for(int i=0; i<numcargos; i++) {

                   nomecargos[i]= sc.nextLine();
                   String linha = sc.nextLine();
                   Scanner numeros = new Scanner(linha);
                   numeros.useLocale(Locale.ENGLISH);
                for(int e=0; e<14; e++) {
                   pesos[i][e] = numeros.nextDouble();

                    }

                }

          int numpessoas = sc.nextInt();
          String nomepessoas[] = new String[numpessoas];
          double[][] notas = new double [numpessoas][14];

              s = sc.nextLine();

              for(int i=0; i<numpessoas; i++) {

                   nomepessoas[i]= sc.nextLine();
                   String linha = sc.nextLine();
                   Scanner numeros = new Scanner(linha);
                   numeros.useLocale(Locale.ENGLISH);
                for(int e=0; e<14; e++) {
                   notas[i][e] = numeros.nextDouble();

                    }

                }

          double[][] ponto = new double [numpessoas][numcargos];
          double n=0; 
          double d=0;
                for(int i=0; i<numpessoas; i++) {
                    
                    for(int a=0; a<numcargos; a++) {
                       
                        for(int b=0; b<14; b++) {
                        
                           n+= pesos[a][b]*notas[i][b];
                           d+=pesos[a][b];
                        }
                        ponto[i][a]= n/d;
                        n=0; d=0;
                   }
                }

             for(int c=0; c<numcargos; c++) {
                
                String [] arr = new String[numpessoas];

                    for (int h=0; h<numpessoas; h++){
                         arr[h]=nomepessoas[h];
                    }

                for(int i = 0; i<numpessoas; i++){
                    
                    for(int j = 0; j<numpessoas - 1; j++){

                         if(ponto[j][c] < ponto[j+1][c]){

                              double aux = ponto[j][c];
                              ponto[j][c] = ponto[j+1][c];
                              ponto[j+1][c] = aux;
                              String auxn = arr[j];
                              arr[j]= arr[j+1];
                              arr[j+1] = auxn;
                        }
                   }
               }
               System.out.println(nomecargos[c]);
                 for (int a=0; a<numpessoas; a++) {
                    System.out.println(arr[a]);
                 }
                 System.out.println();
          }
     
     }
   
}

