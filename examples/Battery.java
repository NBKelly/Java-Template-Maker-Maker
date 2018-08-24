//Automaticaly generated class based on java_template by nbk.
public class Battery {
    //The company that manufactures the product.
    private String manufacturer;

    //Is the item commercially available in New Zealand at the consumer level?
    private boolean available;

    //The name of the product.
    private String name;

    //The model number of the product (and advertised capacity).
    private String modelNumber;

    //The type of technology the battery uses.
    private String batteryType;

    //The converted output of the battery in kWh (output after efficiency is taken into account).
    private double capacity;

    //The power output for the system (kW).
    private double outputPower;

    //The price of the system in NZD;
    private int priceNZD;

    //The efficiency of the system (Percentage, out of 100)
    private double efficiency;

    //Does the system require the purchase of a seperate inverter unit to facilitate connection to your mains power?
    private boolean needsInverter;

    //The unique id associated with the data
    private final long id;

    
    public Battery ( String manufacturer, boolean available, String name, String modelNumber, String batteryType, double capacity, double outputPower, int priceNZD, double efficiency, boolean needsInverter, long id ) {
        this.manufacturer = manufacturer;
        this.available = available;
        this.name = name;
        this.modelNumber = modelNumber;
        this.batteryType = batteryType;
        this.capacity = capacity;
        this.outputPower = outputPower;
        this.priceNZD = priceNZD;
        this.efficiency = efficiency;
        this.needsInverter = needsInverter;
        this.id = id;
    }

    //getters and setters
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer( String manufacturer ) { this.manufacturer = manufacturer; }

    public boolean getAvailable() { return available; }
    public void setAvailable( boolean available ) { this.available = available; }

    public String getName() { return name; }
    public void setName( String name ) { this.name = name; }

    public String getModelNumber() { return modelNumber; }
    public void setModelNumber( String modelNumber ) { this.modelNumber = modelNumber; }

    public String getBatteryType() { return batteryType; }
    public void setBatteryType( String batteryType ) { this.batteryType = batteryType; }

    public double getCapacity() { return capacity; }
    public void setCapacity( double capacity ) { this.capacity = capacity; }

    public double getOutputPower() { return outputPower; }
    public void setOutputPower( double outputPower ) { this.outputPower = outputPower; }

    public int getPriceNZD() { return priceNZD; }
    public void setPriceNZD( int priceNZD ) { this.priceNZD = priceNZD; }

    public double getEfficiency() { return efficiency; }
    public void setEfficiency( double efficiency ) { this.efficiency = efficiency; }

    public boolean getNeedsInverter() { return needsInverter; }
    public void setNeedsInverter( boolean needsInverter ) { this.needsInverter = needsInverter; }

    public long getId() { return id; }

    public static Battery[] GET_DATA() { return DATA; }

    //specified inserted values
    private static final Battery[] DATA = {
        new Battery( "Tesla" ,  false ,  "Tesla Powerwall" ,  "Tesla Powerwall [6.4 kWh]" ,  "Lithium-Ion" ,  5.44 ,  2.0 ,  0 ,  92.5 ,  false ,  0 ) ,
        new Battery( "Tesla" ,  true ,  "Tesla Powerwall 2" ,  "Tesla Powerwall 2 [14 kWh]" ,  "Lithium-Ion" ,  13.5 ,  5 ,  18000 ,  90 ,  false ,  1 ) ,
        new Battery( "LG" ,  true ,  "LG Chem RESU" ,  "LG Chem RESU 6.4 EX [6.4 kWh]" ,  "Lithium" ,  5.12 ,  4.2 ,  9995 ,  95 ,  true ,  2 ) ,
        new Battery( "Panasonic" ,  true ,  "Panasonic" ,  "Panasoic LJ-SK84A [8.4 kWh]" ,  "Lithium-Ion" ,  8.0 ,  2.0 ,  13000 ,  86 ,  true ,  3 ) ,
        new Battery( "Enphase" ,  true ,  "Enphase AC Battery" ,  "Enphase AC Battery [1.2 kWh]" ,  "Lithium Iron Phosphate" ,  2.4 ,  0.260 ,  2450 ,   96 ,  false ,  4 ) ,
        new Battery( "SolaX" ,  true ,  "SolaX-Box" ,  "SolaX X-HYBRID SERIES [4.8 kWh]" ,  "Lithium-Ion" ,  4.8 ,  4.6 ,  9995 ,  97 ,  true ,  5 ) ,
        new Battery( "Sonnen" ,  true ,  "Sonnen 8.6 Eco" ,  "Sonnen 8.6 Eco [8.6 kWh]" ,  "Lithium-Ion Phosphate" ,  6.0 ,  2.4 ,  13600 ,  86 ,  true ,  6 ) ,
        new Battery( "LG" ,  true ,  "LG Chem RESU6.5" ,  "LG Chem RESU6.5 [6.5 kWh]" ,  "Lithium-Ion" ,  5.9 ,  4.3 ,  8500 ,  95 ,  true ,  7 ) 
    };

}

