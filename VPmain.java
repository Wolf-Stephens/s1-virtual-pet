import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();
    public VPMain(){
        String ans = this.askForInput("Do you wanna comfort el baby");
        if(ans.equals("yes")){
            vp.comfort();
            waitABeat(2000);
            vp.sleep();
            waitABeat(2000);
            vp.execution4();
        }
        else{
            vp.neglect();
            ans=this.askForInput("Baby is depressed, are you sure you dont want to comfort it?");
            if(ans.equals("yes")){
                vp.comfort();
                waitABeat(2000);
                vp.sleep();
                ans=this.askForInput("Exercise the baby?");
                if(ans.equals("yes")){
                    vp.exercise();
                    waitABeat(2000);
                    vp.tired();
                    waitABeat(2000);
                    vp.hungry();
                    ans=this.askForInput("feeed the baby??");
                    if(ans.equals("yes")){
                        vp.execution3();
                        waitABeat(2000);
                        vp.dead();
                    }
                    else
                        vp.survive();
                    
                }
                else{
                    vp.execution2();
                    waitABeat(2000);
                    vp.dead();
                }
            }
            else{
                vp.execution();
                waitABeat(2000);
                vp.dead();
            }
        }
    

     }


    
    
    // public VPMain(){
    //     // vp.feed()
    //     // vp.exercise();
    //     // this.waitABeat(1000);
    //     // this.askForInput("Are you raedy to sleep?");
    //     // if(ans.equals("yes"));
    //     //     vp.sleep();
    //     // else;
    //     //     vp.exercise();


    // }

    public void waitABeat(int ms){
         try {
             Thread.sleep(ms); //milliseconds
         } catch(Exception e){
        
         }
     }

     public String askForInput(String q){
         String s = (String)JOptionPane.showInputDialog(
                     new JFrame(),
                    q,
                     "Input Dialog",
                     JOptionPane.PLAIN_MESSAGE
         );
         return s;
     }
public static void main(String[] args) {
         new VPMain();    
     }

    }

