package classassociations;


public class House
{
    private Integer m2;
    private Double price;
    private EnergyLevel energyLevel;

    private Room[] rooms;

    //=================  CONSTRUCTORES  =========================

    public House(){}

    public House(Integer m2, Double price, EnergyLevel energyLevel, Room[] rooms) {
        this.m2 = m2;
        this.price = price;
        this.energyLevel = energyLevel;
        this.rooms = rooms;
    }

    //=================  GETTERS Y SETTERS  =========================

    public Integer getM2() {
        return m2;
    }
    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public EnergyLevel getEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(EnergyLevel energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Room[] getRooms() {
        return rooms;
    }
    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int calcularM2Rooms()
    {
        return calcularM2Rooms(rooms);
    }

    public int calcularM2Rooms(Room[] habitaciones)
    {
        int m2Total = 0;

        for (Room eachRoom :habitaciones) {
            m2Total += eachRoom.getM2();
        }

        return m2Total;
    }

    //=====================  TOSTRING  ===============================

    @Override
    public String toString()
    {
        return "House{" +
                "m2=" + m2 +
                ", price=" + price +
                ", energyLevel=" + energyLevel +
                '}';
    }
}
