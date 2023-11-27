package com.example.chargingPileSystem.domain;

import com.example.chargingPileSystem.commen.PropertyIgnore;
import lombok.Data;

@Data
public class ChargingPileInfo {
    @PropertyIgnore
    private int id;
    @PropertyIgnore
    private String chargingPileId;
    private String voltage;
    private String current;
    private String power;
    private String accumulatedElectricEnergy;
    private String stage;
    private int error;
    private String appointmentTime;
    private int equipmentTemperature;
    private int status;
    private String bleName;

}
