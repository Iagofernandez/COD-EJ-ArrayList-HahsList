
package cod.hashmap.arraylist;



import java.util.ArrayList;
//se crea una nueva clase que implemneta metodos de la interfaz Arraylist
public class Arraylistclass implements ArraylistInterface {
    //se crea un arraylist nuevo
    ArrayList<String> list = new ArrayList<>();
//aqui indicas que metodos implemnetas de la interfaz.
    @Override
    public void putElement(String element) {
        //añades un elemento a el array
        list.add(element);
    }

    @Override
    public String pushElement(int index) {
        //retornas el array con un elemento, que ahora tiene un index, lo muestra con el get
     return list.get(index);   
    }
}
