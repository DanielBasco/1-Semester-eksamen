public class Room {

    String name;
     int capacity;

    Room(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    String getName(){
        return name;
    }

    int getCapacity(){
        return capacity;
    }
}
