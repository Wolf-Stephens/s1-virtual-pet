/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet{
    VirtualPetFace face;
    private int energy = 9;
    


    
    // VirtualPetFace face;
    // int hunger = 0;   // how hungry the pet is.
    
    // constructor
    // public VirtualPet() {
    //     face = new VirtualPetFace();
    //     face.setImage("normal");
    //     face.setMessage("Hello.");
    // }
    

    public VirtualPet(){
        face = new VirtualPetFace();
        face.setImage("cry");
        face.setMessage("I'm crine yo");
    }

    public void comfort(){
        face.setImage("Happy");
        face.setMessage("Thanks homie");
    }

    public void exercise(){
        face.setImage("exercising");
        face.setMessage("Gotta go fast");
        energy -= 3;
    }
    public void neglect(){
        face.setImage("depressed");
        face.setMessage("im friggin depressed yo");
    } 
    public void sleep(){
        face.setImage("asleep");
        face.setMessage("sleeep");
        energy += 3;
    }
    public void execution(){
        face.setImage("dead");
        face.setMessage("imma slime you from beyond the grave");
    }

    public void tired(){
        face.setImage("tired");
        face.setMessage("im cooked");
    }

    
    // public void feed() {
    //     if (hunger > 10) {
    //         hunger = hunger - 10;
    //     } else {
    //         hunger = 0;
    //     }
    //     face.setMessage("Yum, thanks");
    //     face.setImage("normal");
    // }
    
    // public void exercise() {
    //     hunger = hunger + 3;
    //     face.setMessage("1, 2, 3, jump.  Whew.");
    //     face.setImage("tired");
    // }
    
    // public void sleep() {
    //     hunger = hunger + 1;
    //     face.setImage("asleep");
    



} // end Virtual Pet
