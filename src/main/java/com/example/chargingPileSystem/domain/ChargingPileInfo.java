package com.example.chargingPileSystem.domain;

import com.example.chargingPileSystem.commen.PropertyIgnore;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ChargingPileInfo {
    @PropertyIgnore
    private int id;
    @PropertyIgnore
    private String chargingPileId;
    //电压
    private String voltage;
    //电流
    private String current;
    //功率
    private String power;
    //电价:每千瓦时充电价格
    private double price;
    //经纬度
    private String location;
    //累计电量
    private String accumulatedElectricEnergy;
    //状态
    private String stage;
    //警告
    private int error;
    //预约时间
    private String appointmentTime;
    //设备温度
    private int equipmentTemperature;
    //状态
    private int status;
    //蓝牙名称
    private String bleName;
    //更新时间
    private Timestamp updataTime;
}
