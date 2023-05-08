package co.edu.umanizales.tads.model;

import co.edu.umanizales.tads.controller.dto.ErrorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
    //atributos de una mascota
    private String name;
    private int age;
    private String breed;  //(raza)
    private char gender;
    private ErrorDTO location;

    public boolean getAgePet() {
        boolean AgePet = false;
        return AgePet;
    }

    public Object getOwnerIdentification() {
        return null;
    }

    public ErrorDTO getLocation() {
        return location;
    }

    public void setLocation(ErrorDTO location) {
        this.location = location;
    }
    /*
    private String identification;
    private Location location;
     */
}