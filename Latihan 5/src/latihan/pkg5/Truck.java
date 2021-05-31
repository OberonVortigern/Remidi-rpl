/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5;

/**
 *
 * @author ilham
 */
    public class Truck {

        public int cadence, gear, speed;


        public Truck(int startCadence, int startSpeed, int startGear){
            gear = startGear;
            cadence = startCadence;
            speed = startSpeed;
        }



        public void setCadence(int cadence) {
            this.cadence = cadence;
        }

        public void setGear(int gear) {
            this.gear = gear;
        }

        public void applybrake(int decrement) {
            speed -= decrement;
        }

        public void speedUp(int increment) {
            this.speed += increment;
        }

    }