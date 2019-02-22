
package cod.hashmap.arraylist;
// creo una nueva clase que implemta los metodos de la Interfaz Hashmap

import java.util.HashMap;

public class HashMapclass implements HashmapInterface {
    //se crea una nueva coleccion de tipo HashMap
    public HashMap<Integer, String> map = new HashMap<>();
    // se crea una nueva variable privada y estatica
    private static int id=0;
// aqui se implementan los metodos de la Interfaz
    @Override
    public void getValue(String element) {
        //se añade un nuevo elemento al Hash mediante dos valores
        map.put(id, element);
    }

    @Override
    public String pushValue(int key) {
        // te retorna el nuevo valor mediante la key
       return map.get(key);
    }
}
