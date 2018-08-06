//Automaticaly generated class based on java_template by nbk.
public class Inverter {
    //The manufacturer of the unit
    private String manufacturer;

    //The model number of the unit, including supplied voltage
    private String modelNumber;

    //The output power (in kWh) of the unit
    private double powerOutput;

    //The supplied voltage of the unit (V)
    private int volts;

    //The supplied efficiency (%) of the unit. How much power is maintained (rather than lost) in it use.
    private double efficiency;

    
    public Inverter ( String manufacturer, String modelNumber, double powerOutput, int volts, double efficiency ) {
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.powerOutput = powerOutput;
        this.volts = volts;
        this.efficiency = efficiency;
    }

    //getters and setters
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer( String manufacturer ) { this.manufacturer = manufacturer; }

    public String getModelNumber() { return modelNumber; }
    public void setModelNumber( String modelNumber ) { this.modelNumber = modelNumber; }

    public double getPowerOutput() { return powerOutput; }
    public void setPowerOutput( double powerOutput ) { this.powerOutput = powerOutput; }

    public int getVolts() { return volts; }
    public void setVolts( int volts ) { this.volts = volts; }

    public double getEfficiency() { return efficiency; }
    public void setEfficiency( double efficiency ) { this.efficiency = efficiency; }

    public static Inverter[] GET_DATA() { return DATA; }

    //specified inserted values
    private static final Inverter[] DATA = {
        new Inverter( "ABB" ,  "MICRO-0.25-I-OUTD-US-208 [208V]" ,  0.25 ,  208 ,  96 ) ,
        new Inverter( "ABB" ,  "MICRO-0.25-I-OUTD-US-240 [240V]" ,  0.25 ,  240 ,  96 ) ,
        new Inverter( "ABB" ,  "MICRO-0.3HV-I-OUTD-US-208 [208V]" ,  0.3 ,  208 ,  96 ) ,
        new Inverter( "ABB" ,  "MICRO-0.3HV-I-OUTD-US-240 [240V]" ,  0.3 ,  240 ,  96 ) ,
        new Inverter( "ABB" ,  "MICRO-0.3-I-OUTD-US-208 [208V]" ,  0.3 ,  208 ,  96 ) ,
        new Inverter( "ABB" ,  "MICRO-0.3-I-OUTD-US-240 [240V]" ,  0.3 ,  240 ,  96 ) ,
        new Inverter( "ABB" ,  "PVS980-58-1818kVA-I [600V]" ,  1827.3 ,  600 ,  97.5 ) ,
        new Inverter( "ABB" ,  "PVS980-58-2000kVA-K [660V]" ,  2027.06 ,  660 ,  97.5 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-3000TL-CT [208V]" ,  2.86 ,  208 ,  96 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-3000TL-CT [240V]" ,  3 ,  240 ,  96.5 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-4000TL-CT [208V]" ,  3.81 ,  208 ,  96.5 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-4000TL-CT [240V]" ,  4.02 ,  240 ,  97 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-5000TL-CT [208V]" ,  4.61 ,  208 ,  96.5 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-5000TL-CT [240V]" ,  5 ,  240 ,  97 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA3KTL-O/US [208V]" ,  2.86 ,  208 ,  96 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA3KTL-O/US [240V]" ,  3 ,  240 ,  96.5 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA4KTL-O/US [208V]" ,  3.81 ,  208 ,  96.5 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA4KTL-O/US [240V]" ,  4.02 ,  240 ,  97 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA5KTL-O US [240V]" ,  5 ,  240 ,  97 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI3KTL-US [208V]" ,  2.86 ,  208 ,  96 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI3KTL-US [240V]" ,  3 ,  240 ,  96.5 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI4KTL-US [208V]" ,  3.81 ,  208 ,  96.5 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI4KTL-US [240V]" ,  4.02 ,  240 ,  97 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI5KTL-US [208V]" ,  4.61 ,  208 ,  96.5 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI5KTL-US [240V]" ,  5 ,  240 ,  97 ) ,
        new Inverter( "Darfon Electronics Corp." ,  "MIG300UL00 [240V]" ,  0.25 ,  240 ,  95 ) ,
        new Inverter( "Friem" ,  "RECon 30H-150-US [300V]" ,  150 ,  300 ,  98 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 10.0-3 208-240 [208V] [SI1]" ,  9.995 ,  208 ,  96.5 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 10.0-3 208-240 [240V] [SI1]" ,  9.995 ,  240 ,  96.5 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 12.0-3 208-240 [208V] [SI1]" ,  12 ,  208 ,  96.5 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 12.0-3 208-240 [240V] [SI1]" ,  12 ,  240 ,  96.5 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 17.5-3 480 [480V] [SI1]" ,  17.5 ,  480 ,  97.5 ) ,
        new Inverter( "Fronius USA" ,  "Galvo 2.0-1 208-240 [240V]" ,  2 ,  240 ,  94.5 ) ,
        new Inverter( "GE Energy" ,  "GEPVb-3000-NA-240 [240V]" ,  3 ,  240 ,  94.5 ) ,
        new Inverter( "GE Energy" ,  "GEPVb-3300-NA-208 [208V]" ,  3.3 ,  208 ,  94 ) ,
        new Inverter( "GE Energy" ,  "GEPVb-3300-NA-240 [240V]" ,  3.3 ,  240 ,  94.5 ) ,
        new Inverter( "GE Energy" ,  "GEPVb-3800-NA-240 [240V]" ,  3.8 ,  240 ,  95 ) ,
        new Inverter( "iPower" ,  "SHO-1.1 [120V]" ,  1.1 ,  120 ,  90.5 ) ,
        new Inverter( "iPower" ,  "SHO-2.0 [240V]" ,  2 ,  240 ,  92 ) ,
        new Inverter( "iPower" ,  "SHO-2.5 [240V]" ,  2.5 ,  240 ,  94.5 ) ,
        new Inverter( "iPower" ,  "SHO-3.0 [240V]" ,  3 ,  240 ,  93.5 ) ,
        new Inverter( "iPower" ,  "SHO-3.5 [240V]" ,  3.5 ,  240 ,  95.5 ) ,
        new Inverter( "iPower" ,  "SHO-4.6 [208V]" ,  4.6 ,  208 ,  95.5 ) ,
        new Inverter( "iPower" ,  "SHO-4.8 [240V]" ,  4.8 ,  240 ,  96 ) ,
        new Inverter( "iPower" ,  "SHO-5.2 [240V]" ,  5.2 ,  240 ,  96 ) ,
        new Inverter( "KACO" ,  "blueplanet 6400M [208V]" ,  6.4 ,  208 ,  96.5 ) ,
        new Inverter( "KACO" ,  "blueplanet 6400M [240V]" ,  6.4 ,  240 ,  96.5 ) ,
        new Inverter( "KACO" ,  "blueplanet 7600M [208V]" ,  7.6 ,  208 ,  96.5 ) ,
        new Inverter( "KACO" ,  "blueplanet 7600M [240V]" ,  7.6 ,  240 ,  96.5 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG295A1C-B3 [208V]" ,  0.299693 ,  208 ,  96 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG295A1W-B3 [208V]" ,  0.299693 ,  208 ,  96 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG300A1C-B3 [208V]" ,  0.299693 ,  208 ,  96 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG300A1W-B3 [208V]" ,  0.299693 ,  208 ,  96 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG305A1C-B3 [208V]" ,  0.299693 ,  208 ,  96 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG305A1W-B3 [208V]" ,  0.299693 ,  208 ,  96 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG295A1C-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG295A1W-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG300A1C-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG300A1W-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG305A1C-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG305A1W-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ) ,
        new Inverter( "Ming Shen Energy Technology" ,  "EnerBridge Emi_301RD [240V]" ,  0.29 ,  240 ,  96 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3840U [208V]" ,  3.32 ,  208 ,  95.5 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3840U-POS [208V]" ,  3.32 ,  208 ,  95.5 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3900U [208V]" ,  3.4 ,  208 ,  95.5 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3900U-POS [208V]" ,  3.4 ,  208 ,  95.5 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 4000U [208V]" ,  3.51 ,  208 ,  95.5 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 4000U-PG [208V]" ,  3.51 ,  208 ,  95.5 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3840U [240V]" ,  3.84 ,  240 ,  96 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3840U-POS [240V]" ,  3.84 ,  240 ,  96 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.25-I-OUTD-US-208 [208V]" ,  0.25 ,  208 ,  96 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.25-I-OUTD-US-240 [240V]" ,  0.25 ,  240 ,  96 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.3HV-I-OUTD-US-208 [208V]" ,  0.3 ,  208 ,  96 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.3HV-I-OUTD-US-240 [240V]" ,  0.3 ,  240 ,  96 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.3-I-OUTD-US-208 [208V]" ,  0.3 ,  208 ,  96 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.3-I-OUTD-US-240 [240V]" ,  0.3 ,  240 ,  96 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-A [208V]" ,  7.6 ,  208 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-A [240V]" ,  7.6 ,  240 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-A [277V]" ,  7.6 ,  277 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-Z-A [208V]" ,  7.6 ,  208 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-Z-A [240V]" ,  7.6 ,  240 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-Z-A [277V]" ,  7.6 ,  277 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-8.6-TL-OUTD-S-US-A [240V]" ,  8.6 ,  240 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-8.6-TL-OUTD-S-US-A [277V]" ,  8.6 ,  277 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-8.6-TL-OUTD-S-US-Z-A [240V]" ,  8.6 ,  240 ,  96.5 ) ,
        new Inverter( "Power-One" ,  "UNO-8.6-TL-OUTD-S-US-Z-A [277V]" ,  8.6 ,  277 ,  96.5 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 8000TLB-US [208V]" ,  8.07 ,  208 ,  96.5 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 8000TLB-US [240V]" ,  8.08 ,  240 ,  97 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 9000TLB-US [208V]" ,  9.08 ,  208 ,  96.5 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 9000TLB-US [240V]" ,  9.08 ,  240 ,  96.5 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 10000TLB-US [208V]" ,  10.09 ,  208 ,  96.5 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 10000TLB-US [240V]" ,  10.09 ,  240 ,  97 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 11000TLB-US [240V]" ,  11.7 ,  240 ,  97 ) ,
        new Inverter( "Schuco USA" ,  "SB6000U [208V]" ,  5.2 ,  208 ,  94.5 ) ,
        new Inverter( "Schuco USA" ,  "SB6000U [240V]" ,  6 ,  240 ,  94.5 ) ,
        new Inverter( "Schuco USA" ,  "SB6000U [277V]" ,  6 ,  277 ,  94.5 ) ,
        new Inverter( "Shenzhen BYD" ,  "BSG5000-U [240V]" ,  4.88 ,  240 ,  92.5 ) ,
        new Inverter( "Shenzhen BYD" ,  "BSG5000-U [208V]" ,  4.91 ,  208 ,  92.5 ) ,
        new Inverter( "SMA America" ,  "SB7000TL-US-22 [208V]" ,  6.01 ,  208 ,  96.5 ) ,
        new Inverter( "SMA America" ,  "SB7700TL-US-22 [208V]" ,  6.73 ,  208 ,  96.5 ) ,
        new Inverter( "Solargate" ,  "SG-4000 [240V]" ,  4.03 ,  240 ,  95 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-345R-AC [240V]" ,  0.29 ,  240 ,  97 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-345R-AC [240V] [SI1]" ,  0.29 ,  240 ,  97 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-350R-AC [240V]" ,  0.29 ,  240 ,  97 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-350R-AC [240V] [SI1]" ,  0.29 ,  240 ,  97 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-355R-AC [240V]" ,  0.29 ,  240 ,  97 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-355R-AC [240V] [SI1]" ,  0.29 ,  240 ,  97 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-360R-AC [240V]" ,  0.29 ,  240 ,  97 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-360R-AC [240V] [SI1]" ,  0.29 ,  240 ,  97 ) ,
        new Inverter( "SunPower" ,  "SPR-8000f [208V]" ,  7.6 ,  208 ,  95 ) ,
        new Inverter( "Yaskawa Solectria Solar" ,  "PVI-50-208 [208V]" ,  50 ,  208 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES3000 [208V]" ,  2.7 ,  208 ,  95.5 ) ,
        new Inverter( "Yes! Solar" ,  "ES3000P [208V]" ,  2.7 ,  208 ,  95.5 ) ,
        new Inverter( "Yes! Solar" ,  "ES3000 [240V]" ,  2.9 ,  240 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES3000P [240V]" ,  2.9 ,  240 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES4000 [208V]" ,  3.4 ,  208 ,  95.5 ) ,
        new Inverter( "Yes! Solar" ,  "ES4000P [208V]" ,  3.4 ,  208 ,  95.5 ) ,
        new Inverter( "Yes! Solar" ,  "ES4000 [240V]" ,  3.9 ,  240 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES4000P [240V]" ,  3.9 ,  240 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES5000 [208V]" ,  4.3 ,  208 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES5000P [208V]" ,  4.3 ,  208 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES5400 [208V]" ,  4.6 ,  208 ,  95.5 ) ,
        new Inverter( "Yes! Solar" ,  "ES5400P [208V]" ,  4.6 ,  208 ,  95.5 ) ,
        new Inverter( "Yes! Solar" ,  "ES5000 [240V]" ,  4.9 ,  240 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES5000P [240V]" ,  4.9 ,  240 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES5400 [240V]" ,  5.3 ,  240 ,  96 ) ,
        new Inverter( "Yes! Solar" ,  "ES5400P [240V]" ,  5.3 ,  240 ,  96 ) 
    };

}

