/**
 *  Online shopping system
 *  Created by:
 *              PS/2017/009     K.M.T.D.Ariyawansha
 *              PS/2017/052     H.K.H.H.Gunathilaka
 *              PS/2017/097     T.A.T.Lakmal
 *              PS/2017/150     P.A.S.P.Pitigala
 *              PS/2017/249     B.M.Jayasinghe
 */

import java.util.Scanner;

public class User {
    category new1 = new category();//defining a new category class
    int a=1;
    public int Admin() {

        System.out.println("\t\tLogged in as administrator\n ");
        while (a == 1) {
            System.out.println("\t\t\t1. Add item\n\t\t\t2. Remove item\n\t\t\t\t\t\tPress 0 to Previous menu");
            Scanner num = new Scanner(System.in);
            int index = num.nextInt();//taking user input to add or remove items
            switch (index) {
                case 1: {//if Add item option is chosen
                    return 1;
                }
                case 2:{//if remove items is chosen

                    return 2;
                }
                case 0: {//going to previous menu
                    return 0;
                }
                default:{
                    System.out.println("Enter a valid index!");
                }
            }
        }
        return 0;
    }
    public int customer(){
        System.out.println("You can now select your items...\n");
        int num=new1.menu1();//calling category method to chose item category
        return num;//returning category number
    }
}
