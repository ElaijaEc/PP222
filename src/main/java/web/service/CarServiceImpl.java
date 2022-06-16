package web.service;

import org.springframework.stereotype.Component;
import web.models.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl  {
    private static int CAR_COUNT;
    private List<Cars> carsList;
    {
        carsList = new ArrayList<>();
        carsList.add(new Cars(++CAR_COUNT,"Granta",2022));
        carsList.add(new Cars(++CAR_COUNT,"Kalina",2020));
        carsList.add(new Cars(++CAR_COUNT,"Vesta",2019));
        carsList.add(new Cars(++CAR_COUNT,"Largus",2015));
        carsList.add(new Cars(++CAR_COUNT,"Niva",2002));
    }
    public List<Cars> getCarsList(int count) {
        if (count==0){
            return carsList;
        } else{
            return carsList.stream().limit(count).collect(Collectors.toList());
        }
    }

}
