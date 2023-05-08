package co.edu.umanizales.tads.controller.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LocationGenderQuantityDto {

    public Object getCity() {
        return null;
    }


    public class locationgenderquantitydto {
        private String city;
        private List<GenderQuantityDto> genders;
        private int total;

        public locationgenderquantitydto(String city) {
            this.city = city;
            this.total=0;
            this.genders = new ArrayList<>();
            this.genders.add(new GenderQuantityDto('M',0));
            this.genders.add(new GenderQuantityDto('F',0));
        }

        public locationgenderquantitydto(char m, int i) {
        }
    }
}
