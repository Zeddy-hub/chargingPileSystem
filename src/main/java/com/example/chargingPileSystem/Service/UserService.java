package com.example.chargingPileSystem.Service;

import com.example.chargingPileSystem.commen.R;

public interface UserService {
    public R<?> login(String userOpenId);
    public R<?> register(String userName,String chargingPileId);
}
