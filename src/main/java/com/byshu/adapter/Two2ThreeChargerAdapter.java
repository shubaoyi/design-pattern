package com.byshu.adapter;

public class Two2ThreeChargerAdapter extends TwoPhaseCharger {

    private ThreePhaseCharger charger;

    public Two2ThreeChargerAdapter(ThreePhaseCharger charger) {
        this.charger = charger;
    }

    @Override
    void charge() {
        charger.charge();
    }

    public static void main(String[] args) {
        TwoPhaseCharger two = new TwoPhaseCharger();
        two.charge();

        Two2ThreeChargerAdapter adapter = new Two2ThreeChargerAdapter(new ThreePhaseCharger());
        adapter.charge();
    }

}
