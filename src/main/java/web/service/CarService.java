package web.service;

import web.models.Cars;

import java.util.List;
import java.util.stream.Collectors;

public interface CarService {


    List<Cars> getCarsList(int count);
}
