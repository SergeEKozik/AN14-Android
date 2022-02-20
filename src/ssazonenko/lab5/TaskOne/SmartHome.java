package ssazonenko.lab5.TaskOne;

import ssazonenko.lab5.TaskOne.Devices.*;
import ssazonenko.lab5.TaskOne.Rooms.*;

import java.awt.image.Kernel;
import java.util.Scanner;

public class SmartHome {
       public static void main (String [] args) {
           Room rooms = new Room();
           rooms.chooseRoom();
           Scanner console = new Scanner(System.in);
           int numberOfRoom = console.nextInt();
           BadRoom badroom = new BadRoom();
           Bathroom bathroom =  new Bathroom();
           Kitchen kitchen = new Kitchen();
           LivingRoom livingroom = new LivingRoom();


           switch (numberOfRoom) {
               case 1:
                   badroom.devices();
                   break;
               case 2:
                   livingroom.devices();
                   break;
               case 3:
                   kitchen.devices();
                   break;
               case 4:
                   bathroom.devices();
                   break;
           }
       }
    }

