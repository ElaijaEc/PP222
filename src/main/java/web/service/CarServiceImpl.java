package web.service;

import org.springframework.stereotype.Component;
import web.models.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService  {
    private List<Cars> carsList;
    {
        carsList = new ArrayList<>();
        carsList.add(new Cars(1,"Granta",2022));
        carsList.add(new Cars(2,"Kalina",2020));
        carsList.add(new Cars(3,"Vesta",2019));
        carsList.add(new Cars(4,"Largus",2015));
        carsList.add(new Cars(5,"Niva",2002));
    }
    @Override
    public List<Cars> getCarsList(int count) {
        if (count==0){
            return carsList;
        } else{
            return carsList.stream().limit(count).collect(Collectors.toList());
        }
    }


}
