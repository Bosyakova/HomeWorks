package InterfaceClass;

    public class Dog extends Animal implements Trainable{
        protected Dog(String name) {
            super(name);
        }

        @Override
        public String voice() {
            return "Waf";
        }

        @Override
        public void eat() {

        }
        @Override
        public void train(){
        System.out.println("train");
        }
    }
