/**
 *  Online shopping system
 *  Created by:
 *              PS/2017/009     K.M.T.D.Ariyawansha
 *              PS/2017/052     H.K.H.H.Gunathilaka
 *              PS/2017/097     T.A.T.Lakmal
 *              PS/2017/150     P.A.S.P.Pitigala
 *              PS/2017/249     B.M.Jayasinghe
 */

import java.util.List;
import java.util.Scanner;

public class item{
    int i,j, b =1;
    float price;//defining price to store cost while shopping
    String[] itmN=new String[1];//defining new string to store bought item
    float[] costN=new float[1];//defining new string to store bought item's cost
    float[] qtyN=new float[1];//defining new string to store bought quantity

    public void adding(List<String> itm,List<Float> cost,List<Float> qty) {

        while (b == 1) {
                System.out.println("Press 1 to add items...\n\t\t\t\t\t\tPress 0 to previous menu...");
                Scanner input = new Scanner(System.in);
                b = input.nextInt();//taking input to add items

            String[] table = {"Item", "Price(unit)", "Quantity"};//printing the available items
            System.out.format("\n%30s%22s%15s\n\n", table[0], table[1], table[2]);
            for (j = 0; j < itm.size(); j++) {
                System.out.format("%30s%20.2f%15.2f\n", itm.get(j), cost.get(j), qty.get(j));
            }

            if(b==1) {//adding items

                System.out.print("\nEnter the item name : ");
                Scanner input1 = new Scanner(System.in);
                String name = input1.nextLine();//taking user input to item name
                itm.add(j, name);//calling add to store in itm list

                System.out.print("Enter the quantity to be added : ");
                Scanner input2 = new Scanner(System.in);
                float q = input2.nextFloat();//taking user input to quantity
                qty.add(j, q);//calling add to store in qty list

                System.out.print("Enter the cost per unit : ");
                Scanner input3 = new Scanner(System.in);
                float c = input3.nextFloat();//taking user input to item's cost
                cost.add(j, c);//calling add to store in cost list
            }
        }
    }

    public void removing(List<String> itm,List<Float> cost,List<Float> qty){
        int r=1;
        String[] table={"Item","Price(unit)","Quantity"};//printing item table
        System.out.format("%30s%22s%15s\n\n", table[0], table[1],table[2]);
        for(i=0; i< itm.size(); i++){
            System.out.format("%30s%20.2f%15.2f\n", itm.get(i), cost.get(i), qty.get(i));
        }
        while(r==1){
            System.out.println("Press 1 to remove items...\n\t\t\t\t\t\tPress 0 to previous menu...");
            Scanner ind=new Scanner(System.in);//taking user input to select remove items
            r=ind.nextInt();

            if(r==1) {
                System.out.print("\nEnter the item u want to remove : ");
                Scanner name = new Scanner(System.in);//taking user input to remove items
                String item = name.nextLine();
                int n = itm.indexOf(item);
                itm.remove(n);//calling remove to remove item
                cost.remove(n);//calling remove to remove item's cost
                qty.remove(n);//calling remove to remove quantity of that item

                System.out.format("%30s%22s%15s\n", table[0], table[1],table[2]);//printing table after removing items
                for (i = 0; i < itm.size(); i++) {
                    System.out.format("%30s%20.2f%15.2f\n", itm.get(i), cost.get(i), qty.get(i));
                }
            }
        }
    }
    public float shopping(List<String> itm,List<Float> cost,List<Float> qty){
        String[] table={"Index","Item","Price(unit)"};//printing table of items
        System.out.format("%5s%25s%20s\n\n",table[0], table[1],table[2]);
        for(j=0; j< itm.size(); j++){
            System.out.format("%5d%25s%20.2f\n",j+1, itm.get(j),cost.get(j));
        }
        System.out.print("\nEnter item number to add to cart : ");
        Scanner id=new Scanner(System.in);//taking item number to add item to cart
        int n=id.nextInt();
        System.out.print("Enter the quantity to add : ");
        float q=id.nextFloat();//taking quantity to add to cart
        float newQ=qty.get(n-1)-q;//updating quantity in store
        qty.set(n-1,newQ);
        this.itmN[0]=itm.get(n-1);//storing to item cart
        this.costN[0]=cost.get(n-1);//storing cost to cart
        this.qtyN[0]=q;//storing quantity to cart

        System.out.print("Your cost in cart is : ");
        price=cost.get(n-1)*q;//calculating price
        System.out.println(price);
        return price;
    }
    public void myCart(){
        String In=this.itmN[0];
        float Cn=this.costN[0];
        float Qn=this.qtyN[0];//printing values of recently added items in cart
        System.out.format("\n%30s%25.2f%20.2f\n",In, Cn,Qn);
    }
}