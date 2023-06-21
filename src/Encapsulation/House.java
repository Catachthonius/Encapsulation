package Encapsulation;

public class House {
        private int floorsNumber;
        private String address;
        private String[] residentsNames;

        //Getters and setters:
        public int getFloorsNumber(){
            return floorsNumber;
        }
        public void setFloorsNumber(int floorsNumber){
            this.floorsNumber = floorsNumber;
        }

        public String getAddress(){
            return address;
        }
        public void setAddress(String address){
            this.address = address;
        }

        public String[] getResidentsName() {
            return residentsNames;
        }
        public void setResidentsNames(String[] residentsNames) {
            this.residentsNames = residentsNames;
        }
    }
