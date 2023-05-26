package hw_2023_05_01__2_11.controller;

import hw_2023_05_01__2_11.domain.*;
import hw_2023_05_01__2_11.service.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @RequestMapping("/add")
    public void add (@RequestParam ("id") Set<Integer> ids){
        storeService.add(ids);
    }

    @RequestMapping("/get")
    public List<Item> get(){
      return storeService.get();
    }


}
