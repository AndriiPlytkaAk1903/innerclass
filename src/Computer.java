public class Computer {
    class Proccessor {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.println("isStart = " + isStart);
        }

        public void shutdown () {
            isStart = false;
            System.out.println("isStart = " + isStart);
        }


    }
    class RAM {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.println("RAM is start");
        }

        public void shutdown () {
            isStart = false;
            System.out.println("isStart = " + isStart);
        }

    }
    public void superComp(){
        this.i7.start();
        this.transfer.start();
        System.out.println("Proccessor = " + i7.isStart);
        System.out.println("RAM = " + transfer.isStart);
    }

    Proccessor i7 = new Proccessor();
    RAM transfer = new RAM();
}