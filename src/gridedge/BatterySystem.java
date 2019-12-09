/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridedge;
import gridedge.BatteryUnit;
/**
 *
 * @author jakechoward
 */
public class BatterySystem {
    private float MaxChargeCurrent;
    private float MaxDischargeCurrent;
    private float TotalEnergyDeliveredSinceCharge;
    private float InternalImpedence;
    private float ChargeDelivered;
    private float TotalEnergyDelivery;
    private float TotalOperatingTime;
    private float TotalCycles;
    private int OperatingState;
    private BatteryUnit[] Batteries;
    
    public BatterySystem() {
        this.MaxChargeCurrent = 0;
        this.MaxDischargeCurrent = 0;
        this.TotalEnergyDeliveredSinceCharge = 0;
        this.InternalImpedence = 0;
        this.ChargeDelivered = 0;
        this.TotalEnergyDelivery = 0;
        this.TotalOperatingTime = 0;
        this.TotalCycles = 0;
        this.OperatingState = 0;
        this.Batteries = new BatteryUnit[0];
    }
    
    public BatterySystem(BatteryUnit [] batteries) {
        this.MaxChargeCurrent = 0;
        this.MaxDischargeCurrent = 0;
        this.TotalEnergyDeliveredSinceCharge = 0;
        this.InternalImpedence = 0;
        this.ChargeDelivered = 0;
        this.TotalEnergyDelivery = 0;
        this.TotalOperatingTime = 0;
        this.TotalCycles = 0;
        this.OperatingState = 0;
        float[] temp;
        for (int x=0; x<batteries.length; x++) {
            temp = batteries[x].getData();
            this.MaxChargeCurrent += temp[0];
            this.MaxDischargeCurrent += temp[1];
            this.TotalEnergyDeliveredSinceCharge += temp[2];
            this.InternalImpedence += temp[3];
            this.ChargeDelivered += temp[4];
            this.TotalEnergyDelivery += temp[5];
            this.TotalOperatingTime += temp[6];
            this.TotalCycles += temp[7];
        }
        this.Batteries = batteries;
    }
    
    public float[] getData() {
        float[] hold = new float[8];
        hold[0] = this.MaxChargeCurrent;
        hold[1] = this.MaxDischargeCurrent;
        hold[2] = this.TotalEnergyDeliveredSinceCharge;
        hold[3] = this.InternalImpedence;
        hold[4] = this.ChargeDelivered;
        hold[5] = this.TotalEnergyDelivery;
        hold[6] = this.TotalOperatingTime;
        hold[7] = this.TotalCycles;
        return hold;
    }
    
    public int getState() {
        return this.OperatingState;
    }
    
    public int[] getStateList() {
        int[] temp = new int[this.Batteries.length + 1];
        temp[0] = this.OperatingState;
        for (int x = 0; x < this.Batteries.length; x++) {
            temp[x+1] = this.Batteries[x].getState();
        }
        return temp;
    }
    
    public void setState(int x) {
        this.OperatingState = x;
    }
}
