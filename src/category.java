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

public class category{

    public int menu1() {
        int val,c=1;//initializing values

        while (c==1) {
            System.out.println("\t\t\t1.Vegetables\n\t\t\t2.Fruits\n\t\t\t3.Beverages\n\t\t\t4.Snacks\n");
            System.out.print("Enter the category number : ");
            Scanner index = new Scanner(System.in);//taking user input to chose category
            val = index.nextInt();

            if(val==1) {//chose category Vegetables
                return 1;
            }
            if(val==2) {//chose category Fruits
                return 2;
            }
            if(val==3) {//chose beverages
                return 3;
            }
            if(val==4) {//chose snacks
                return 4;
            }
            else {
                System.out.println("\t\tEnter a valid category number\n");
            }
        }
        return 0;
    }
}
