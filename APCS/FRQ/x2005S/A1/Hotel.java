import java.util.ArrayList;

public class Hotel
{
  private Reservation[] rooms;
    // each element correcponds to a room in the hotel;
    // if rooms[index[ is null, the room is empty;
    // otherwise, it contains a reference to the Reservation
    // for that room, such that
    //  rooms[index].getRoomNumber() returns index

  private ArrayList waitList;
    // contains names of guests who have not yet been
    // assigned a room because all rooms are full

  public Hotel(int nRooms)
  {
    rooms = new Reservation[nRooms];
    waitList = new ArrayList();
  }

  /*** Part (a) ***/

  // if there are any empty rooms (rooms with no reservation),
  // then create a reservation for an empty room for the
  // specified guest and return the new Reservation;
  // otherwise, add the guest to the end of waitList
  // and return null
  public Reservation requestRoom(String guestName)
  {
   
  }

  /*** Part (b) ***/

  // release the room associated with parameter res, effectively
  // cancelling the reservation;
  // if any names are stored in waitList, remove the first name
  // and create a Reservation for this person in the room 
  // reserved by res; return that new Reservation;
  // if waitList is empty, mark the room specified by res as empty and
  // return null
  // precondition:  res is a valid Reservation for some room
  //                in this hotel
  public Reservation cancelAndReassign(Reservation res)
  {
    
  }

  public String toString()
  {
    String s = "";

    for (int i = 0; i < rooms.length; i++)
      s += rooms[i] + " ";

    s += "Waitlist: " + waitList;
    return s;
  }
}
