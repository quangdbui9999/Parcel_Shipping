/*
 * CSC-122 SP 2018 PROJECT:
 * Programmer: Quang Bui
 * Due Date: Tuesday, February 27th, 2017
 * Description: Create an object-oriented programming solution that 
 * uses a classfor Parcels that can be used by shipping companies. 
 * The Parcelclass should contain properties for the weight, length, 
 * width, and height of a Parcel as well as a tracking number. Another 
 * important property of a parcel object is its girth, which is 
 * determined by adding 2*width + 2* height.
 * A local shipping company, Shake n Breakcan accept Parcels that are 
 * at most 50 kg and do not exceed 105 cm in girth.  If the Parcel is 
 * too big (exceeds girth limit) or too heavy (exceeds weight limit) 
 * the Parcel cannot be accepted for shipment and the program needs to
 * report the problem.  If the Parcel is accepted for shipment, the 
 * program should report the Parcel’s tracking number to the customer 
 * and thank them for their patronage.
 */

package testparcel;

import java.util.Scanner;

/**
 * DRIVE FILR
 * Profesor: A. right
 * Programmer: Quang Bui
 */
public class TestParcel {
    public static void main(String[] args) { // length, width, height, weight
        String a = "quangbui";
        String b = a.substring(2);
        System.out.println(b);
        /*System.out.println("Parcel 1.");
        Parcel parcel1 = new Parcel();
        parcel1.setLength(51.1);
        parcel1.setWidth(52.2);
        parcel1.setHeight(53.3);
        parcel1.setWeight(44.4);
        ShakeNBreak object1 = new ShakeNBreak(parcel1.getLength(), 
                parcel1.getWidth(), parcel1.getHeight(), 
                parcel1.getWeight());
        System.out.println(object1);
        
        System.out.println("Parcel 2.");
        Parcel parcel2 = new Parcel();
        parcel2.setLength(55.5);
        parcel2.setWidth(56.6);
        parcel2.setHeight(57.7);
        parcel2.setWeight(54.6);
        ShakeNBreak object2 = new ShakeNBreak(parcel2.getLength(), 
                parcel2.getWidth(), parcel2.getHeight(), 
                parcel2.getWeight());
        System.out.println(object2);
        
        System.out.println("Parcel 3.");
        Parcel parcel3 = new Parcel();
        parcel3.setLength(28.8);
        parcel3.setWidth(17.9);
        parcel3.setHeight(17.0);
        parcel3.setWeight(49.99999);
        ShakeNBreak object3 = new ShakeNBreak(parcel3.getLength(), 
                parcel3.getWidth(), parcel3.getHeight(), 
                parcel3.getWeight());
        System.out.println(object3);
        
        System.out.println("Parcel 4.");
        Parcel parcel4 = new Parcel();
        parcel4.setLength(22.3);
        parcel4.setWidth(23.4);
        parcel4.setHeight(24.5);
        parcel4.setWeight(50.00001);
        ShakeNBreak object4 = new ShakeNBreak(parcel4.getLength(), 
                parcel4.getWidth(), parcel4.getHeight(), 
                parcel4.getWeight());
        System.out.println(object4);
        
        
        ShakeNBreak[] arrayShakeNBreak;
        int numParcel;
        Scanner cin = new Scanner(System.in);
        
        do{
            System.out.print("Enter the number of parcel: ");
            numParcel = Integer.parseInt(cin.nextLine());
            
            if(numParcel <= 0){
                System.err.println("The number of parcel must be > 0."
                        + " Can you check and input again, please");
            }
        }while(numParcel <= 0);
        
        System.out.println("You entered " + numParcel + " parcels.");
        arrayShakeNBreak = new ShakeNBreak[numParcel];
        
        for(int i = 0; i < arrayShakeNBreak.length; i++){
            System.out.println("Enter the information of "
                    + "Parcel: " + (i + 1));
            ShakeNBreak object = new ShakeNBreak();
            object.setDimensions();
            arrayShakeNBreak[i] = object;
            System.out.println("\n\n");
        }
        
        System.out.println("\n\n");
        
        for(int i = 0; i < arrayShakeNBreak.length; i++){
            System.out.println("The information of "
                    + "Parcel: " + (i + 1));
            System.out.println(arrayShakeNBreak[i]);
        }*/
    }
}

/*
run:
Parcel 1.
***********************************************************
Welcome to Shake n Break Automated Shipping Kiosk!

Length 	 Width 	 Height
53.3	 51.1	 52.2

The girth is 206.6 cm.

 Please put your Parcel on the scale
 Weight: 44.4 kg

The Parcel is too big.


Parcel 2.
***********************************************************
Welcome to Shake n Break Automated Shipping Kiosk!

Length 	 Width 	 Height
57.7	 55.5	 56.6

The girth is 224.2 cm.

 Please put your Parcel on the scale
 Weight: 54.6 kg

The Parcel is too big and too heavy.


Parcel 3.
***********************************************************
Welcome to Shake n Break Automated Shipping Kiosk!

Length 	 Width 	 Height
28.8	 17.9	 17.0

The girth is 69.8 cm.

 Please put your Parcel on the scale
 Weight: 49.99999 kg

 Here is your tracking number: # 201100005
Thank you.  We will bill your account




Parcel 4.
***********************************************************
Welcome to Shake n Break Automated Shipping Kiosk!

Length 	 Width 	 Height
24.5	 22.3	 23.4

The girth is 91.4 cm.

 Please put your Parcel on the scale
 Weight: 50.00001 kg

The Parcel is too heavy.


Enter the number of parcel: -1
The number of parcel must be > 0. Can you check and input again, please
Enter the number of parcel: 0
The number of parcel must be > 0. Can you check and input again, please
Enter the number of parcel: -6
The number of parcel must be > 0. Can you check and input again, please
Enter the number of parcel: 4
You entered 4 parcels.
Enter the information of Parcel: 1
***********************************************************
Welcome to Shake n Break Automated Shipping Kiosk!

Enter length of parcel:  12.3
Enter width of parcel:   12.4
Enter height of parcel:  12.5
Enter weight of parcel:  15.5



Enter the information of Parcel: 2
***********************************************************
Welcome to Shake n Break Automated Shipping Kiosk!

Enter length of parcel:  18.8
Enter width of parcel:   19.9
Enter height of parcel:  20.8
Enter weight of parcel:  50.11111



Enter the information of Parcel: 3
***********************************************************
Welcome to Shake n Break Automated Shipping Kiosk!

Enter length of parcel:  30.21
Enter width of parcel:   35.27
Enter height of parcel:  32.43
Enter weight of parcel:  32.44



Enter the information of Parcel: 4
***********************************************************
Welcome to Shake n Break Automated Shipping Kiosk!

Enter length of parcel:  43.23
Enter width of parcel:   41.67
Enter height of parcel:  44.98
Enter weight of parcel:  50.65






The information of Parcel: 1
Length 	 Width 	 Height
12.5	 12.3	 12.4

The girth is 49.4 cm.

 Please put your Parcel on the scale
 Weight: 15.5 kg

 Here is your tracking number: # 201100008
Thank you.  We will bill your account




The information of Parcel: 2
Length 	 Width 	 Height
20.8	 18.8	 19.9

The girth is 77.4 cm.

 Please put your Parcel on the scale
 Weight: 50.11111 kg

The Parcel is too heavy.


The information of Parcel: 3
Length 	 Width 	 Height
35.27	 30.21	 32.43

The girth is 125.28 cm.

 Please put your Parcel on the scale
 Weight: 32.44 kg

The Parcel is too big.


The information of Parcel: 4
Length 	 Width 	 Height
44.98	 41.67	 43.23

The girth is 169.8 cm.

 Please put your Parcel on the scale
 Weight: 50.65 kg

The Parcel is too big and too heavy.


BUILD SUCCESSFUL (total time: 1 minute 4 seconds)

*/