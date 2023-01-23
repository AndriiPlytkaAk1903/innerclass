
public class Main {

    public static void main (String [] args){
        Computer comp = new Computer();
        comp.i7.start();
        comp.transfer.shutdown();
        Computer comp2 = new Computer (){
             public void superComp() {
                this.i7.start();
                this.transfer.start();
            }
        };

        comp2.superComp();



    }
}
