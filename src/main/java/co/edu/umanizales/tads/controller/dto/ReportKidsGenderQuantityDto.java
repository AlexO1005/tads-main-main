package co.edu.umanizales.tads.controller.dto;

import co.edu.umanizales.tads.model.Location;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ReportKidsGenderQuantityDto {
    @Data
    public class ReportKidsLocationGenderDTO {
        private List<LocationGenderQuantityDto> locationGenderQuantityDTOS;

        public ReportKidsLocationGenderDTO(List<Location> cities) {
            locationGenderQuantityDTOS = new ArrayList<>();
            for(Location location: cities){
                locationGenderQuantityDTOS.add(new
                        LocationGenderQuantityDto(location.getName()));
            }
        }

        // método actualizar
        public void updateQuantity(String city,char gender){
            for(LocationGenderQuantityDto loc:locationGenderQuantityDTOS){
                if(loc.getCity().equals(city)){
                    for(GenderQuantityDto genderDTO: loc.getGenders()){
                        if(genderDTO.getGender()==gender){
                            genderDTO.setQuantity(genderDTO.getQuantity()+1);
                            loc.setTotal(loc.getTotal()+1);
                            return;
                        }
                    }
                }
            }
        }

    }
