public class Main {
    public static void main(String[] args) {
        Room[] rooms = new Room[3];

        Room room1 = new Room();
        room1.number = 1;
        room1.condition = "wolny";
        rooms[0] = room1;

        Room room2 = new Room();
        room2.number = 2;
        room2.condition = "zajety";
        rooms[1] = room2;

        Room room3 = new Room();
        room3.number = 3;
        room3.condition = "zajety";
        rooms[2] = room3;

        for (Room ro:rooms) {
            System.out.println("Pokój nr "+ro.number+" jest "+ro.condition);
        }
    }
}
