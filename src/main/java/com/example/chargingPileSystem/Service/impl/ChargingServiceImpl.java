package com.example.chargingPileSystem.Service.impl;

import com.example.chargingPileSystem.Service.ChargingService;
import com.example.chargingPileSystem.commen.R;
import com.example.chargingPileSystem.enums.ErrorEnum;
import com.example.chargingPileSystem.form.StateForm;
import com.example.chargingPileSystem.mapper.ChargingMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ChargingServiceImpl implements ChargingService {
    @Resource
    private ChargingMapper chargingMapper;

    @Override
    public R<?> state(String chargingPileId) {

        int stage = chargingMapper.queryStage(chargingPileId);
//        System.out.println(stage);
//        return R.ok();
        if (!(stage == 12)) {
            return R.fail(ErrorEnum.CHARGING_PLIE_ID_NO_CONNECT_ERROR,"充电桩未连接");
        }
        StateForm stateForm = chargingMapper.queryChargingPileState(chargingPileId);
        System.out.println(stateForm);
        return R.ok(stateForm);
    }
}
