/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class VacationScale {

	//public fields
    public int[] vacationDays;
    public int yearsOfService;

    //method
    public void setVacationScale() {
        //initialise array
    	vacationDays = new int[7];
    	//assign array element
    	vacationDays[0] = 10;
        vacationDays[1] = 15;
        vacationDays[2] = 15;
        vacationDays[3] = 15;
        vacationDays[4] = 20;
        vacationDays[5] = 25;
        vacationDays[6] = 30;
    }
    //method
    public void displayVacationDays(){
        if(yearsOfService >= 0 && yearsOfService < 6){
            System.out.println ("Days of vacation: " + vacationDays[yearsOfService]);
        }else if(yearsOfService >= 6){
            System.out.println ("Days of vacation: " + vacationDays[6]);
        }
        else {
            System.out.println ("Invalid years of service");
        } 
    }
}
