package Computer;

public class Computer {
    // Thông tin chung
    private String id;
    private String brand;
    private String model;
    private String type;
    private double price;
    private int releaseYear;

    // CPU
    private String cpuBrand;
    private String cpuModel;
    private double cpuSpeed; // GHz
    private int cpuCores;
    private int cpuThreads;

    // RAM
    private int ramSize; // GB
    private String ramType; // DDR4, DDR5...
    private int ramBusSpeed; // MHz
    private int ramSlots;

    // Storage
    private String storageType; // SSD, HDD...
    private int storageCapacity; // GB

    public void setId(String id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public void setCpuThreads(int cpuThreads) {
        this.cpuThreads = cpuThreads;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public void setRamBusSpeed(int ramBusSpeed) {
        this.ramBusSpeed = ramBusSpeed;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setStorageSpeed(int storageSpeed) {
        this.storageSpeed = storageSpeed;
    }

    public void setGpuBrand(String gpuBrand) {
        this.gpuBrand = gpuBrand;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public void setGpuMemory(int gpuMemory) {
        this.gpuMemory = gpuMemory;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public void setScreenRefreshRate(int screenRefreshRate) {
        this.screenRefreshRate = screenRefreshRate;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public int getCpuThreads() {
        return cpuThreads;
    }

    public int getRamSize() {
        return ramSize;
    }

    public String getRamType() {
        return ramType;
    }

    public int getRamBusSpeed() {
        return ramBusSpeed;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getStorageType() {
        return storageType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getStorageSpeed() {
        return storageSpeed;
    }

    public String getGpuBrand() {
        return gpuBrand;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public int getGpuMemory() {
        return gpuMemory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public int getScreenRefreshRate() {
        return screenRefreshRate;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public String getPorts() {
        return ports;
    }

    public String getWireless() {
        return wireless;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    private int storageSpeed; // MB/s

    // GPU
    private String gpuBrand;
    private String gpuModel;
    private int gpuMemory; // GB

    // Màn hình
    private double screenSize; // inch
    private String screenResolution;
    private int screenRefreshRate; // Hz
    private boolean touchScreen;

    // Kết nối
    private String ports;
    private String wireless;

    // Pin & trọng lượng
    private int batteryCapacity; // Wh
    private double weight; // kg

    // Constructor
    public Computer(String id, String brand, String model, String type, double price, int releaseYear,
                    String cpuBrand, String cpuModel, double cpuSpeed, int cpuCores, int cpuThreads,
                    int ramSize, String ramType, int ramBusSpeed, int ramSlots,
                    String storageType, int storageCapacity, int storageSpeed,
                    String gpuBrand, String gpuModel, int gpuMemory,
                    double screenSize, String screenResolution, int screenRefreshRate, boolean touchScreen,
                    String ports, String wireless, int batteryCapacity, double weight) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.releaseYear = releaseYear;
        this.cpuBrand = cpuBrand;
        this.cpuModel = cpuModel;
        this.cpuSpeed = cpuSpeed;
        this.cpuCores = cpuCores;
        this.cpuThreads = cpuThreads;
        this.ramSize = ramSize;
        this.ramType = ramType;
        this.ramBusSpeed = ramBusSpeed;
        this.ramSlots = ramSlots;
        this.storageType = storageType;
        this.storageCapacity = storageCapacity;
        this.storageSpeed = storageSpeed;
        this.gpuBrand = gpuBrand;
        this.gpuModel = gpuModel;
        this.gpuMemory = gpuMemory;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
        this.screenRefreshRate = screenRefreshRate;
        this.touchScreen = touchScreen;
        this.ports = ports;
        this.wireless = wireless;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "computer{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", releaseYear=" + releaseYear +
                ", cpu=" + cpuBrand + " " + cpuModel + " " + cpuSpeed + "GHz, cores=" + cpuCores +
                ", ram=" + ramSize + "GB " + ramType +
                ", storage=" + storageCapacity + "GB " + storageType +
                ", gpu=" + gpuBrand + " " + gpuModel +
                ", screen=" + screenSize + "inch " + screenResolution +
                ", wireless='" + wireless + '\'' +
                ", battery=" + batteryCapacity + "Wh" +
                ", weight=" + weight + "kg" +
                '}';
    }
}
