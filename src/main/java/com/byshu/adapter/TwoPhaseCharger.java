package com.byshu.adapter;

public class TwoPhaseCharger extends Charger {

    @Override
    void charge() {
        System.out.println("charging using a two-phase charger..");
    }

}
