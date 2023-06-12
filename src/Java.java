/**
 *  Online shopping system
 *  Created by:
 *              PS/2017/009     K.M.T.D.Ariyawansha
 *              PS/2017/052     H.K.H.H.Gunathilaka
 *              PS/2017/097     T.A.T.Lakmal
 *              PS/2017/150     P.A.S.P.Pitigala
 *              PS/2017/249     B.M.Jayasinghe
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Java{
    //login method to collect user data
    public static void login(){
        int x;
        String userName;
        String password;
        String newName;
        String id;
        int num;
        String email;
        String Address;
        System.out.println("*New member type '0'");
        System.out.println("*Existing member type '1'");
        System.out.print("\nEnter your Number: ");
        Scanner value= new Scanner(System.in);//taking user input to select member type
        x =value.nextInt();
        if(x==1) {//existing member
            System.out.print("Enter User name:");
            Scanner name= new Scanner(System.in);
            userName= name.nextLine();//taking input for username

            System.out.print("Enter password:");
            Scanner pw= new Scanner(System.in);
            password= pw.nextLine();//taking
        }
        else if(x==0){//new member
            System.out.print("Enter your name:");
            Scanner nName= new Scanner(System.in);
            newName= nName.nextLine();//taking input for new name

            System.out.print("Enter your nic number:");
            Scanner nicId= new Scanner(System.in);
            id= nicId.nextLine();//taking input for NIC

            System.out.print("Enter your contact number:");
            Scanner pNum= new Scanner(System.in);//taking input for contact number
            num= pNum.nextInt();

            System.out.print("Enter your address:");
            Scanner add= new Scanner(System.in);//taking input for address
            Address= add.nextLine();

            System.out.print("Enter your Email address:");
            Scanner mail= new Scanner(System.in);//taking input for email
            email= mail.nextLine();
        }
    }
    public static void main(String[] args) {
        category cat = new category();//defining a new category class
        float price=0F;//Setting price variable to zero
        User usr = new User();//calling new user class
        int c,k=0;
        String[] cartN=new String[20];//defining an array to store cart items
        float[] cartC=new float[20];//defining an array to store cost of cart items
        float[] cartQ=new float[20];//defining an array to store quantity of cart items
        //welcome masege
        System.out.println("\t\t\t********Online Shopping System********** ");
        System.out.println("\t\t\t             Welcome");
        System.out.println("\t\t\t      online shopping center");
        System.out.println("\t\t\t****************************************\n");

        //defining Lists vegN,vegC and vegQ for store item,cost and Quantity of vegetables
        List<String> vegN=new ArrayList<>();List<Float> vegC=new ArrayList<>();List<Float> vegQ=new ArrayList<>();
        //defining Lists frtN,frtC and frtQ for store item,cost and Quantity of fruits
        List<String> frtN=new ArrayList<>();List<Float> frtC=new ArrayList<>();List<Float> frtQ=new ArrayList<>();
        //defining Lists bevN,bevC and bevQ for store item,cost and Quantity of beverages
        List<String> bevN=new ArrayList<>();List<Float> bevC=new ArrayList<>();List<Float> bevQ=new ArrayList<>();
        //defining Lists snkN,snkC and snkQ for store item,cost and Quantity of snacks
        List<String> snkN=new ArrayList<>();List<Float> snkC=new ArrayList<>();List<Float> snkQ=new ArrayList<>();

        //storing some initial values in vegN,vegC and vegQ lists for vegetables
        vegN.add(0, "Carrot");vegN.add(1, "Mushrooms");vegN.add(2, "Beans");vegN.add(3, "Onions");
        vegC.add(0, 100.50F);vegC.add(1, 80.00F);vegC.add(2, 140.00F);vegC.add(3, 125.00F);
        vegQ.add(0, 500F);vegQ.add(1, 100F);vegQ.add(2, 250F);vegQ.add(3, 300F);
        //storing some initial values in frtN,frtC and frtQ Lists for fruits
        frtN.add(0, "Apple");frtN.add(1, "Orange");frtN.add(2, "PineApple");frtN.add(3, "WoodApple");
        frtC.add(0, 40.00F);frtC.add(1, 30.00F);frtC.add(2, 110.00F);frtC.add(3, 25.00F);
        frtQ.add(0, 1000F);frtQ.add(1, 300F);frtQ.add(2, 130F);frtQ.add(3, 700F);
        //storing some initial values for bevN,bevC and bevQ lists for beverages
        bevN.add(0, "Milo");bevN.add(1, "Fresh milk 1ltr");bevN.add(2, "Sprite 1.5ltr");
        bevC.add(0, 65.00F);bevC.add(1, 230.00F);bevC.add(2, 210.00F);
        bevQ.add(0, 120F);bevQ.add(1, 30F);bevQ.add(2, 50F);
        //storing some initial values for snkN,snC and snkQ Lists for snacks
        snkN.add(0, "Lemon puff");snkN.add(1, "Almond 100g");snkN.add(2, "Chick bits 80g");
        snkC.add(0, 100.00F);snkC.add(1, 400.00F);snkC.add(2, 110.00F);
        snkQ.add(0, 25F);snkQ.add(1, 20F);snkQ.add(2, 100F);

        System.out.println("Press 1 to log in as administrator\nPress 2 to login as customer\n\t\t\t\t\tPress 0 to exit");
        Scanner num=new Scanner(System.in);//taking user input to login menu
        c=num.nextInt();
        login();//calling login method
        while (c!=0) {
            item veg = new item();//defining new item class as veg for 'Vegetables'
            item frt=new item();//defining new item class as frt for 'Fruits'
            item bev=new item();//defining new item class as bev for 'beverages'
            item snk=new item();//defining new item class as snk for 'Snacks'
            if(c==1) {//logged in as admin
                int a = usr.Admin();//calling admin method
                if(a==1) {//chosen add items
                    int b = cat.menu1();//calling menu1 method in category class to select item category
                    if (b == 1) {//vegetables category
                        System.out.println("\tThese are the vegetables in our stocks");
                        System.out.println("\tQuantity is shown using 'Kilograms'...\n");
                        veg.adding(vegN,vegC,vegQ);//calling adding method from item class for veg class to add vegetables
                    }
                    if (b==2){//fruits category
                        System.out.println("\tThese are the Fruits in our stocks\n");
                        frt.adding(frtN,frtC,frtQ);//calling adding method from item class for frt class to add fruits
                    }
                    if(b==3){//beverages category
                        System.out.println("\tThese are the Beverages in our stocks\n");
                        bev.adding(bevN,bevC,bevQ);//calling adding method from item class for bev class to add beverages
                    }
                    if(b==4){//snacks category
                        System.out.println("\tThese are the Snacks in our stocks\n");
                        snk.adding(snkN,snkC,snkQ);//calling adding method from item class for snk class to add snacks
                    }
                }
                if(a==2){//chosen remove items
                    int d=cat.menu1();//calling menu1 method in category class to select item category
                    if (d == 1) {//vegetables category
                        System.out.println("\tThese are the vegetables in our stocks");
                        System.out.println("\tQuantity is shown using 'Kilograms'...\n");
                        veg.removing(vegN,vegC,vegQ);//calling removing method from item class for veg  to remove vegetables
                    }
                    if (d==2){//fruits category
                        System.out.println("\tThese are the Fruits in our stocks\n");
                        frt.removing(frtN,frtC,frtQ);//calling removing method from item class for frt to remove fruits
                    }
                    if(d==3){//beverages category
                        System.out.println("\tThese are the Beverages in our stocks\n");
                        bev.removing(bevN,bevC,bevQ);//calling removing method from item class for bev to remove beverages
                    }
                    if(d==4){//snacks category
                        System.out.println("\tThese are the Snacks in our stocks\n");
                        snk.removing(snkN,snkC,snkQ);//calling removing method from item class for snk to remove snacks
                    }
                }
            }
            if(c==2){//logged in as customer
                System.out.println("\nMake sure your order is above Rs.4000 ...\nor your order will be canceled");
                int e=usr.customer();//calling customer method in user class
                if (e == 1) {//vegetables category
                    System.out.println("\tThese are the vegetables in our stocks");
                    System.out.println("\tQuantity is shown using 'Kilograms'...\n");
                    price+=veg.shopping(vegN,vegC,vegQ);//calling shopping method for veg class
                    veg.myCart();//calling myCart method for veg class to see recently bought items
                    cartN[k]=veg.itmN[0];//storing item name in cart
                    cartC[k]=veg.costN[0];//storing cost per unit in cart
                    cartQ[k]=veg.qtyN[0];//storing quantity in cart
                }
                if (e==2){//fruits category
                    System.out.println("\tThese are the Fruits in our stocks\n");
                    price+=frt.shopping(frtN,frtC,frtQ);//calling shopping method for frt item class
                    frt.myCart();//calling myCart method for frt class to see recently bought items
                    cartN[k]=frt.itmN[0];//storing item name in cart
                    cartC[k]=frt.costN[0];//storing cost per unit in cart
                    cartQ[k]=frt.qtyN[0];//storing quantity in cart
                }
                if(e==3){//beverages category
                    System.out.println("\tThese are the Beverages in our stocks\n");
                    price+=bev.shopping(bevN,bevC,bevQ);//calling shopping method for bev item class
                    bev.myCart();//calling myCart method for bev class to see recently bought items
                    cartN[k]=bev.itmN[0];//storing item name in cart
                    cartC[k]=bev.costN[0];//storing cost per unit in cart
                    cartQ[k]=bev.qtyN[0];
                }
                if(e==4){
                    System.out.println("\tThese are the Snacks in our stocks\n");
                    price+=snk.shopping(snkN,snkC,snkQ);//calling shopping method for snk item class
                    snk.myCart();//calling myCart method for snk class to see recently bought items
                    cartN[k]=snk.itmN[0];//storing item name in cart
                    cartC[k]=snk.costN[0];//storing cost per unit in cart
                    cartQ[k]=snk.qtyN[0];//storing quantity in cart
                }
                k++;//updating k value
                System.out.print("\nTotal cost in your cart : "+price);
                System.out.println("\n\t\tPress 0 to continue...\t\t\t\tPress 9 to view cart...");
                Scanner n=new Scanner(System.in);//taking user input to view bought items
                int num1=n.nextInt();
                if(num1==9){
                    int k1=k--;
                    //printing bought items
                    String[] table={"Item","Price(unit)","Quantity","Total"};
                    System.out.format("%30s%22s%15s%15s\n\n", table[0], table[1],table[2],table[3]);
                    for(k=0;k<k1;k++){
                        System.out.format("%30s%22.2f%15.2f%15.2f\n", cartN[k], cartC[k],cartQ[k],cartC[k]*cartQ[k]);
                    }
                    System.out.print("\nTotal without delivery charges : "+price);
                    if(price<4000){
                        System.out.println("\nAdd more items or your order will be rejected!\n");
                        c=2;
                    }
                    else {
                        System.out.print("\nPlease Enter the distance from our stores in kilometers : ");
                        Scanner km = new Scanner(System.in);//taking user input for distance
                        float num2 = km.nextInt();
                        float num3 = num2 - 1;
                        float value = 50 + num3 * 35;//for 1st kilometer charge is 50 and 35 for each kilometer been added
                        float total = price + value;//calculating total value
                        System.out.print("\n\t\tTotal bill with delivery charges is Rs." + total);
                        System.out.println("\n\n\t\t***** Thank you for shopping with us! *****\n\n");
                    }
                }
            }
            System.out.println("\tPress 1 to continue...\n\tPress 9 to login menu...");
            Scanner ind=new Scanner(System.in);//taking user input to login menu
            int n1=ind.nextInt();
            if(n1==9){//going to login menu
                System.out.println("Press 1 to log in as administrator\nPress 2 to login as customer\n\t\t\t\t\tPress 0 to exit");
                Scanner nmb=new Scanner(System.in);
                c=nmb.nextInt();
                login();//calling login method
            }
            if(n1==1){
                continue;
            }
        }
    }
}
