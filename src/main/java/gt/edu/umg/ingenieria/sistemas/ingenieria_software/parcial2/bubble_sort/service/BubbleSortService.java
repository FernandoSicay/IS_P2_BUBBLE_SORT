package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service;

public class BubbleSortService {
    
    public String[] bubbleSortService(String[] array){

        // Inicio del metodo de ordenamiento de la Burbuja
        String aux;
        for(int i=1; i<=array.length; i++) {
            for(int j=0; j<array.length-i; j++) {
                if( array[j].compareTo( array[j+1] ) > 0 ) {
                    aux   = array[j];
                    array[j]  = array[j+1];
                    array[j+1]= aux;
                }
            }
        }
        return array;
    }

}
