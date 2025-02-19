package ParkingLot;

import java.util.ArrayList;
import java.util.List;

import ParkingLot.Panel.EntryPanel;
import ParkingLot.Panel.ExitPanel;
import ParkingLot.ParkingSlot.ParkingSlot;

public class ParkingLot {
    private String name;
    private List<EntryPanel> entrances;
    private List<ExitPanel> exits;
    private List<ParkingSlot> parkingSlots;
    public ParkingLot(String name){
        entrances=new ArrayList<>();
        exits=new ArrayList<>();
        parkingSlots=new ArrayList<>();
    }
}
