package com.capgemini.demoWardrobe.controller;

import com.capgemini.demoWardrobe.model.Wardrobe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/wardrobe/")
public class Controller {

    Wardrobe wardrobe = new Wardrobe();

@GetMapping
public void Open(){
    if (wardrobe.isOpen() == false) {
        wardrobe.setOpen(true);
    } else {
        System.out.println("Door is already open!");
    }
}

@GetMapping
public void Close(){
    if (wardrobe.isOpen() == true) {
        wardrobe.setOpen(false);
    } else {
        System.out.println("Door is already closed!");
    }
}

@GetMapping
public void getIn(){
    if (wardrobe.isInside() == false) {
        wardrobe.setInside(true);
    } else {
        System.out.println("You are already in!");
    }
}

@GetMapping
public void getOut(){
    if (wardrobe.isInside() == true) {
        wardrobe.setInside(false);
    } else {
        System.out.println("You are already out of the closet");
    }
}

@GetMapping
public void kick(int force){
    wardrobe.setHealth(wardrobe.getHealth() - force);
    System.out.println("You kicked the wardrobe with " + force + " force! The wardrobe has still a health of " + (wardrobe.getHealth()-force) );

}


}
