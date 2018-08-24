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

    //The unique id associated with the data
    private final long id;

    
    public Inverter ( String manufacturer, String modelNumber, double powerOutput, int volts, double efficiency, long id ) {
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.powerOutput = powerOutput;
        this.volts = volts;
        this.efficiency = efficiency;
        this.id = id;
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

    public long getId() { return id; }

    public static Inverter[] GET_DATA() { return DATA; }

    //specified inserted values
    private static final Inverter[] DATA = {
        new Inverter( "ABB" ,  "MICRO-0.25-I-OUTD-US-208 [208V]" ,  0.25 ,  208 ,  96 ,  0 ) ,
        new Inverter( "ABB" ,  "MICRO-0.25-I-OUTD-US-240 [240V]" ,  0.25 ,  240 ,  96 ,  1 ) ,
        new Inverter( "ABB" ,  "MICRO-0.3HV-I-OUTD-US-208 [208V]" ,  0.3 ,  208 ,  96 ,  2 ) ,
        new Inverter( "ABB" ,  "MICRO-0.3HV-I-OUTD-US-240 [240V]" ,  0.3 ,  240 ,  96 ,  3 ) ,
        new Inverter( "ABB" ,  "MICRO-0.3-I-OUTD-US-208 [208V]" ,  0.3 ,  208 ,  96 ,  4 ) ,
        new Inverter( "ABB" ,  "MICRO-0.3-I-OUTD-US-240 [240V]" ,  0.3 ,  240 ,  96 ,  5 ) ,
        new Inverter( "ABB" ,  "PVS980-58-1818kVA-I [600V]" ,  1827.3 ,  600 ,  97.5 ,  6 ) ,
        new Inverter( "ABB" ,  "PVS980-58-2000kVA-K [660V]" ,  2027.06 ,  660 ,  97.5 ,  7 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-3000TL-CT [208V]" ,  2.86 ,  208 ,  96 ,  8 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-3000TL-CT [240V]" ,  3 ,  240 ,  96.5 ,  9 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-4000TL-CT [208V]" ,  3.81 ,  208 ,  96.5 ,  10 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-4000TL-CT [240V]" ,  4.02 ,  240 ,  97 ,  11 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-5000TL-CT [208V]" ,  4.61 ,  208 ,  96.5 ,  12 ) ,
        new Inverter( "Canadian Solar Inc." ,  "CSI-5000TL-CT [240V]" ,  5 ,  240 ,  97 ,  13 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA3KTL-O/US [208V]" ,  2.86 ,  208 ,  96 ,  14 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA3KTL-O/US [240V]" ,  3 ,  240 ,  96.5 ,  15 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA4KTL-O/US [208V]" ,  3.81 ,  208 ,  96.5 ,  16 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA4KTL-O/US [240V]" ,  4.02 ,  240 ,  97 ,  17 ) ,
        new Inverter( "Chint Power Systems America" ,  "CPS SCA5KTL-O US [240V]" ,  5 ,  240 ,  97 ,  18 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI3KTL-US [208V]" ,  2.86 ,  208 ,  96 ,  19 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI3KTL-US [240V]" ,  3 ,  240 ,  96.5 ,  20 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI4KTL-US [208V]" ,  3.81 ,  208 ,  96.5 ,  21 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI4KTL-US [240V]" ,  4.02 ,  240 ,  97 ,  22 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI5KTL-US [208V]" ,  4.61 ,  208 ,  96.5 ,  23 ) ,
        new Inverter( "Chint Solar Zhejiang" ,  "CHPI5KTL-US [240V]" ,  5 ,  240 ,  97 ,  24 ) ,
        new Inverter( "Darfon Electronics Corp." ,  "MIG300UL00 [240V]" ,  0.25 ,  240 ,  95 ,  25 ) ,
        new Inverter( "Friem" ,  "RECon 30H-150-US [300V]" ,  150 ,  300 ,  98 ,  26 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 10.0-3 208-240 [208V] [SI1]" ,  9.995 ,  208 ,  96.5 ,  27 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 10.0-3 208-240 [240V] [SI1]" ,  9.995 ,  240 ,  96.5 ,  28 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 12.0-3 208-240 [208V] [SI1]" ,  12 ,  208 ,  96.5 ,  29 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 12.0-3 208-240 [240V] [SI1]" ,  12 ,  240 ,  96.5 ,  30 ) ,
        new Inverter( "Fronius International GmbH" ,  "Fronius Symo 17.5-3 480 [480V] [SI1]" ,  17.5 ,  480 ,  97.5 ,  31 ) ,
        new Inverter( "Fronius USA" ,  "Galvo 2.0-1 208-240 [240V]" ,  2 ,  240 ,  94.5 ,  32 ) ,
        new Inverter( "GE Energy" ,  "GEPVb-3000-NA-240 [240V]" ,  3 ,  240 ,  94.5 ,  33 ) ,
        new Inverter( "GE Energy" ,  "GEPVb-3300-NA-208 [208V]" ,  3.3 ,  208 ,  94 ,  34 ) ,
        new Inverter( "GE Energy" ,  "GEPVb-3300-NA-240 [240V]" ,  3.3 ,  240 ,  94.5 ,  35 ) ,
        new Inverter( "GE Energy" ,  "GEPVb-3800-NA-240 [240V]" ,  3.8 ,  240 ,  95 ,  36 ) ,
        new Inverter( "iPower" ,  "SHO-1.1 [120V]" ,  1.1 ,  120 ,  90.5 ,  37 ) ,
        new Inverter( "iPower" ,  "SHO-2.0 [240V]" ,  2 ,  240 ,  92 ,  38 ) ,
        new Inverter( "iPower" ,  "SHO-2.5 [240V]" ,  2.5 ,  240 ,  94.5 ,  39 ) ,
        new Inverter( "iPower" ,  "SHO-3.0 [240V]" ,  3 ,  240 ,  93.5 ,  40 ) ,
        new Inverter( "iPower" ,  "SHO-3.5 [240V]" ,  3.5 ,  240 ,  95.5 ,  41 ) ,
        new Inverter( "iPower" ,  "SHO-4.6 [208V]" ,  4.6 ,  208 ,  95.5 ,  42 ) ,
        new Inverter( "iPower" ,  "SHO-4.8 [240V]" ,  4.8 ,  240 ,  96 ,  43 ) ,
        new Inverter( "iPower" ,  "SHO-5.2 [240V]" ,  5.2 ,  240 ,  96 ,  44 ) ,
        new Inverter( "KACO" ,  "blueplanet 6400M [208V]" ,  6.4 ,  208 ,  96.5 ,  45 ) ,
        new Inverter( "KACO" ,  "blueplanet 6400M [240V]" ,  6.4 ,  240 ,  96.5 ,  46 ) ,
        new Inverter( "KACO" ,  "blueplanet 7600M [208V]" ,  7.6 ,  208 ,  96.5 ,  47 ) ,
        new Inverter( "KACO" ,  "blueplanet 7600M [240V]" ,  7.6 ,  240 ,  96.5 ,  48 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG295A1C-B3 [208V]" ,  0.299693 ,  208 ,  96 ,  49 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG295A1W-B3 [208V]" ,  0.299693 ,  208 ,  96 ,  50 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG300A1C-B3 [208V]" ,  0.299693 ,  208 ,  96 ,  51 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG300A1W-B3 [208V]" ,  0.299693 ,  208 ,  96 ,  52 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG305A1C-B3 [208V]" ,  0.299693 ,  208 ,  96 ,  53 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG305A1W-B3 [208V]" ,  0.299693 ,  208 ,  96 ,  54 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG295A1C-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ,  55 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG295A1W-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ,  56 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG300A1C-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ,  57 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG300A1W-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ,  58 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG305A1C-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ,  59 ) ,
        new Inverter( "LG Electronics Inc." ,  "LG305A1W-B3 [240V]" ,  0.304968 ,  240 ,  96.5 ,  60 ) ,
        new Inverter( "Ming Shen Energy Technology" ,  "EnerBridge Emi_301RD [240V]" ,  0.29 ,  240 ,  96 ,  61 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3840U [208V]" ,  3.32 ,  208 ,  95.5 ,  62 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3840U-POS [208V]" ,  3.32 ,  208 ,  95.5 ,  63 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3900U [208V]" ,  3.4 ,  208 ,  95.5 ,  64 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3900U-POS [208V]" ,  3.4 ,  208 ,  95.5 ,  65 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 4000U [208V]" ,  3.51 ,  208 ,  95.5 ,  66 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 4000U-PG [208V]" ,  3.51 ,  208 ,  95.5 ,  67 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3840U [240V]" ,  3.84 ,  240 ,  96 ,  68 ) ,
        new Inverter( "Motech Industries" ,  "PVMate 3840U-POS [240V]" ,  3.84 ,  240 ,  96 ,  69 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.25-I-OUTD-US-208 [208V]" ,  0.25 ,  208 ,  96 ,  70 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.25-I-OUTD-US-240 [240V]" ,  0.25 ,  240 ,  96 ,  71 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.3HV-I-OUTD-US-208 [208V]" ,  0.3 ,  208 ,  96 ,  72 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.3HV-I-OUTD-US-240 [240V]" ,  0.3 ,  240 ,  96 ,  73 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.3-I-OUTD-US-208 [208V]" ,  0.3 ,  208 ,  96 ,  74 ) ,
        new Inverter( "Power-One" ,  "MICRO-0.3-I-OUTD-US-240 [240V]" ,  0.3 ,  240 ,  96 ,  75 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-A [208V]" ,  7.6 ,  208 ,  96.5 ,  76 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-A [240V]" ,  7.6 ,  240 ,  96.5 ,  77 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-A [277V]" ,  7.6 ,  277 ,  96.5 ,  78 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-Z-A [208V]" ,  7.6 ,  208 ,  96.5 ,  79 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-Z-A [240V]" ,  7.6 ,  240 ,  96.5 ,  80 ) ,
        new Inverter( "Power-One" ,  "UNO-7.6-TL-OUTD-S-US-Z-A [277V]" ,  7.6 ,  277 ,  96.5 ,  81 ) ,
        new Inverter( "Power-One" ,  "UNO-8.6-TL-OUTD-S-US-A [240V]" ,  8.6 ,  240 ,  96.5 ,  82 ) ,
        new Inverter( "Power-One" ,  "UNO-8.6-TL-OUTD-S-US-A [277V]" ,  8.6 ,  277 ,  96.5 ,  83 ) ,
        new Inverter( "Power-One" ,  "UNO-8.6-TL-OUTD-S-US-Z-A [240V]" ,  8.6 ,  240 ,  96.5 ,  84 ) ,
        new Inverter( "Power-One" ,  "UNO-8.6-TL-OUTD-S-US-Z-A [277V]" ,  8.6 ,  277 ,  96.5 ,  85 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 8000TLB-US [208V]" ,  8.07 ,  208 ,  96.5 ,  86 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 8000TLB-US [240V]" ,  8.08 ,  240 ,  97 ,  87 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 9000TLB-US [208V]" ,  9.08 ,  208 ,  96.5 ,  88 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 9000TLB-US [240V]" ,  9.08 ,  240 ,  96.5 ,  89 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 10000TLB-US [208V]" ,  10.09 ,  208 ,  96.5 ,  90 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 10000TLB-US [240V]" ,  10.09 ,  240 ,  97 ,  91 ) ,
        new Inverter( "Renesola Zhejiang" ,  "Replus 11000TLB-US [240V]" ,  11.7 ,  240 ,  97 ,  92 ) ,
        new Inverter( "Schuco USA" ,  "SB6000U [208V]" ,  5.2 ,  208 ,  94.5 ,  93 ) ,
        new Inverter( "Schuco USA" ,  "SB6000U [240V]" ,  6 ,  240 ,  94.5 ,  94 ) ,
        new Inverter( "Schuco USA" ,  "SB6000U [277V]" ,  6 ,  277 ,  94.5 ,  95 ) ,
        new Inverter( "Shenzhen BYD" ,  "BSG5000-U [240V]" ,  4.88 ,  240 ,  92.5 ,  96 ) ,
        new Inverter( "Shenzhen BYD" ,  "BSG5000-U [208V]" ,  4.91 ,  208 ,  92.5 ,  97 ) ,
        new Inverter( "SMA America" ,  "SB7000TL-US-22 [208V]" ,  6.01 ,  208 ,  96.5 ,  98 ) ,
        new Inverter( "SMA America" ,  "SB7700TL-US-22 [208V]" ,  6.73 ,  208 ,  96.5 ,  99 ) ,
        new Inverter( "Solargate" ,  "SG-4000 [240V]" ,  4.03 ,  240 ,  95 ,  100 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-345R-AC [240V]" ,  0.29 ,  240 ,  97 ,  101 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-345R-AC [240V] [SI1]" ,  0.29 ,  240 ,  97 ,  102 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-350R-AC [240V]" ,  0.29 ,  240 ,  97 ,  103 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-350R-AC [240V] [SI1]" ,  0.29 ,  240 ,  97 ,  104 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-355R-AC [240V]" ,  0.29 ,  240 ,  97 ,  105 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-355R-AC [240V] [SI1]" ,  0.29 ,  240 ,  97 ,  106 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-360R-AC [240V]" ,  0.29 ,  240 ,  97 ,  107 ) ,
        new Inverter( "Solaria Corporation" ,  "Solaria PowerXT-360R-AC [240V] [SI1]" ,  0.29 ,  240 ,  97 ,  108 ) ,
        new Inverter( "SunPower" ,  "SPR-8000f [208V]" ,  7.6 ,  208 ,  95 ,  109 ) ,
        new Inverter( "Yaskawa Solectria Solar" ,  "PVI-50-208 [208V]" ,  50 ,  208 ,  96 ,  110 ) ,
        new Inverter( "Yes! Solar" ,  "ES3000 [208V]" ,  2.7 ,  208 ,  95.5 ,  111 ) ,
        new Inverter( "Yes! Solar" ,  "ES3000P [208V]" ,  2.7 ,  208 ,  95.5 ,  112 ) ,
        new Inverter( "Yes! Solar" ,  "ES3000 [240V]" ,  2.9 ,  240 ,  96 ,  113 ) ,
        new Inverter( "Yes! Solar" ,  "ES3000P [240V]" ,  2.9 ,  240 ,  96 ,  114 ) ,
        new Inverter( "Yes! Solar" ,  "ES4000 [208V]" ,  3.4 ,  208 ,  95.5 ,  115 ) ,
        new Inverter( "Yes! Solar" ,  "ES4000P [208V]" ,  3.4 ,  208 ,  95.5 ,  116 ) ,
        new Inverter( "Yes! Solar" ,  "ES4000 [240V]" ,  3.9 ,  240 ,  96 ,  117 ) ,
        new Inverter( "Yes! Solar" ,  "ES4000P [240V]" ,  3.9 ,  240 ,  96 ,  118 ) ,
        new Inverter( "Yes! Solar" ,  "ES5000 [208V]" ,  4.3 ,  208 ,  96 ,  119 ) ,
        new Inverter( "Yes! Solar" ,  "ES5000P [208V]" ,  4.3 ,  208 ,  96 ,  120 ) ,
        new Inverter( "Yes! Solar" ,  "ES5400 [208V]" ,  4.6 ,  208 ,  95.5 ,  121 ) ,
        new Inverter( "Yes! Solar" ,  "ES5400P [208V]" ,  4.6 ,  208 ,  95.5 ,  122 ) ,
        new Inverter( "Yes! Solar" ,  "ES5000 [240V]" ,  4.9 ,  240 ,  96 ,  123 ) ,
        new Inverter( "Yes! Solar" ,  "ES5000P [240V]" ,  4.9 ,  240 ,  96 ,  124 ) ,
        new Inverter( "Yes! Solar" ,  "ES5400 [240V]" ,  5.3 ,  240 ,  96 ,  125 ) ,
        new Inverter( "Yes! Solar" ,  "ES5400P [240V]" ,  5.3 ,  240 ,  96 ,  126 ) 
    };

}

