package hw_2023_05_01__2_11.repository;

import hw_2023_05_01__2_11.domain.*;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StoreRepository {
    private int idCounter = 1;
    private final Map<Integer, Item> store = new HashMap<>();

    @PostConstruct
    public void init(){
        store.put(idCounter, new Item(idCounter++, "СВЧ"));
        store.put(idCounter, new Item(idCounter++, "Холодильник"));
        store.put(idCounter, new Item(idCounter++, "Вентилятор"));
    }

    public void add(Item item){
        store.put(item.getId(), item);
    }

    public Item get (int id){
        return store.get(id);
    }

    public List<Item> getAll(){
        return new ArrayList<>(store.values());
    }

    public void update(int id, Item item){
        if(store.containsKey(id)){
            store.replace(id, item);
        }
    }

    public Item delete(int id){
        return store.remove(id);
    }
}
