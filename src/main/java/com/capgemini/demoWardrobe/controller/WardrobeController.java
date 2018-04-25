package com.capgemini.demoWardrobe.controller;

import com.capgemini.demoWardrobe.model.Wardrobe;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/wardrobe")
public class WardrobeController {
    private static ArrayList<String> action = new ArrayList<>();
    private Wardrobe wardrobe;
    private int force;

    @GetMapping("/")
    public ArrayList<String> action(){
        return action;
    }


//    @GetMapping("/{name}")
//    public void createWardrobe(@PathVariable String name) {
//       wardrobe = new Wardrobe(name, false, false, 100);
//       action.add(name + " is added");
//    }



    @GetMapping("/open")
    public void open(){

        if (wardrobe.isOpen() == false) {
            wardrobe.setOpen(true);
            action.add("Opening the door");
        } else {
            action.add("Door is already open!");
        }
    }

    @GetMapping("/close")
    public void close(){
        if (wardrobe.isOpen() == true) {
            wardrobe.setOpen(false);
            action.add("Closing the door");
        } else {
            action.add("Door is already closed!");
        }
    }

    @GetMapping("/getin")
    public void getIn(){
        System.out.println("1");
        if (wardrobe.isInside() == false) {
            wardrobe.setInside(true);
            System.out.println("2");
            action.add("Getting into the closet");
        } else {
            action.add("You are already in!");
        }
    }

    @GetMapping("/getout")
    public void getOut(){
        if (wardrobe.isInside() == true) {
            wardrobe.setInside(false);
            action.add("Getting out of the closet");
        } else {
            action.add("You are already out of the closet");
        }
    }

    @GetMapping("/kick")
    public void kick(){
        force = (int) (10*Math.random());
        wardrobe.setHealth(wardrobe.getHealth() - force);
        System.out.println("You kicked the wardrobe with " + force + " force! The wardrobe has still a health of " + (wardrobe.getHealth()-force) );
        action.add("Kicking the wardrobe");
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public Wardrobe createWardrobe(Wardrobe wardrobe2) {
        wardrobe = new Wardrobe(wardrobe2.getName(), false, false,100);
        action.add(wardrobe.getName() + " is added.");
        return wardrobe;
    }

}
