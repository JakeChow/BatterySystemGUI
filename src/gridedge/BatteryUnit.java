/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridedge;

/**
 *
 * @author jakechoward
 */
public class BatteryUnit {
    
    //The variables to represent values given via CEI Battery Units
    private float MaxChargeCurrent;
    private float MaxDischargeCurrent;
    private float TotalEnergyDeliveredSinceCharge;
    private float InternalImpedence;
    private float ChargeDelivered;
    private float TotalEnergyDelivery;
    private float TotalOperatingTime;
    private float TotalCycles;
   
    //state 0 = online, 1 = offline, 2 = charging
    private int OperatingState;
    
    //Empty Constructor for BatteryUnit Class. Defaults all values to 0.
    public BatteryUnit() {
        this.MaxChargeCurrent = 0;
        this.MaxDischargeCurrent = 0;
        this.TotalEnergyDeliveredSinceCharge = 0;
        this.InternalImpedence = 0;
        this.ChargeDelivered = 0;
        this.TotalEnergyDelivery = 0;
        this.TotalOperatingTime = 0;
        this.TotalCycles = 0;
        this.OperatingState = 0;
    }
    
    //A constructor that takes in initial values for each data point.
    public BatteryUnit(float MaxChargeCurrent, float MaxDischargeCurrent, float TotalEnergyDeliveredSinceCharge,
            float InternalImpedence, float ChargeDelivered, float TotalEnergyDelivery, float TotalOperatingTime,
            float TotalCycles, int state) {
        this.MaxChargeCurrent = MaxChargeCurrent;
        this.MaxDischargeCurrent = MaxDischargeCurrent;
        this.TotalEnergyDeliveredSinceCharge = TotalEnergyDeliveredSinceCharge;
        this.InternalImpedence = InternalImpedence;
        this.ChargeDelivered = ChargeDelivered;
        this.TotalEnergyDelivery = TotalEnergyDelivery;
        this.TotalOperatingTime = TotalOperatingTime;
        this.TotalCycles = TotalCycles;
        this.OperatingState = state;
    }
    
    //A method to return an array w all the data of a BatteryUnit
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
    
    //Returns the operational state of the BatteryUnit
    public int getState() {
        return this.OperatingState;
    }
        
    //Sets the operational state of BatteryUnit with int parameter.
    //  0:Online, 1:Offline, 2:Charging
    public void setState(int x) {
        this.OperatingState = x;
    }
}
