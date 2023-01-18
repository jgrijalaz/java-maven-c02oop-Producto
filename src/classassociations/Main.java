package classassociations;

public class Main {

    public static void main(String[] args)
    {
        Room rSalon = new Room(25, 3, true);
        Room rCocina = new Room(15, 2, false);
        Room rDormitorio1 = new Room(20, 1, true);
        Room rDormitorio2 = new Room(10, 1, true);
        Room rBano = new Room(5, 0, false);

        House unaCasa = new House();
        unaCasa.setRooms(new Room[]{rSalon,rCocina,rDormitorio1,rDormitorio2,rBano});

        for (Room unaHab : unaCasa.getRooms()) {
            unaCasa.setM2(unaCasa.getM2() + unaHab.getM2());
        }

        for (Room unaHab : unaCasa.getRooms()) {
            EnergyLevel aireDeHabitacion = unaHab.getAirConditioner();
        }
    }
}
