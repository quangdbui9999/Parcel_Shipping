/*
 * CSC-122 SP 2018 PROJECT:
 * Programmer: Quang Bui
 * Due Date: Tuesday, March 6th, 2018
 * Description: The Parcel class includes the properties: length, width,
 * height, weight, girth, and trackingNumber. The trackingNumber
 * variable is a static variable (it will be assigned in all objects
 * in the Parcel class when objects is created by the constructor
 * (default constructor and the constructor has the parameters) of Parcel
 * class). The value of girth is calculated with the formula:
 * (2 * width) + (2 * height)). Parcel class is a reusable component, and
 * it will be used again in the ShakeNBreak class. Parcel class only
 * just input, set dimension for the width, length, weight, and height
 * variables, after that it will calculate the girth and assigned
 * a trackingNumber for each parcel. Finally, Parcel class will be 
 * displayed (output on the screen) the information of a parcel.
 */

package testparcel;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Programmed by: Quang Bui
 * Due Date: Tuesday, February 27th, 2017
 * Description: The Parcel class includes the properties: length, width,
 * height, weight, girth, and trackingNumber. The trackingNumber
 * variable is a static variable (it will be assigned in all objects
 * in the Parcel class when objects is created by the constructor
 * (default constructor and the constructor has the parameters) of Parcel
 * class). The value of girth is calculated with the formula:
 * (2 * width) + (2 * height)). Parcel class is a reusable component, and
 * it will be used again in the ShakeNBreak class. Parcel class only
 * just input, set dimension for the width, length, weight, and height
 * variables, after that it will calculate the girth and assigned
 * a trackingNumber for each parcel. Finally, Parcel class will be 
 * displayed (output on the screen) the information of a parcel.
 */

public class Parcel {
    private double length, width, height, weight, girth;
    private long trackingNumber;
    private static long trackingNoGenerator = 201100000;
    
    /**
     * Mutator: introduction()
     * Pre-condition: the introduction() method only just declared in
     * the Parcel class
     * Post-condition: the introduction() method will output the 
     * introduction. 
     */
    public void introduction(){
        System.out.println("***************************************"
                + "********************");
        System.out.println("Welcome to Shake n Break "
                + "Automated Shipping Kiosk!\n");
    }
    
    /**
     * DEFAULT CONSTRUCTOR
     * no parameters
     * Pre-condition: 
     * The variables: length, width, height, weight, girth, and
     * trackingNumber must be declared and initialized.
     * Post-condition: Construct an object of Parcel class with
     * no parameters. 
     */
    public Parcel() {
        length = width = height = weight = girth = 0.0;
        trackingNumber = trackingNoGenerator++;
    }
    
    /**
     * CONSTRUCT WITH 4 PARAMETERS
     * @param inLength
     * @param inWidth
     * @param inHeight
     * @param inWeight 
     * Pre-condition:
     * The variables: length, width, height, weight, girth, and
     * trackingNumber must be declared and initialized.
     * Post-condition: Construct an object of Parcel class with 4
     * parameters inLength, inWidth, inHeight, and inWeight.
     * If length < width, the swapLengthWidth() will be executed,
     * otherwisr, the swapLengthWidth() will be ignore.
     * If length < height, the swapLengthHeight() will be executed,
     * otherwisr, the swapLengthHeight() will be ignore.
     * I would like to make sure the length's value must the 
     * largest value in 3 value of length, width, and height.
     */
    public Parcel(double inLength, double inWidth, double inHeight,
                    double inWeight) {
        length = inLength;
        width = inWidth;
        swapLengthWidth();
        height = inHeight;
        swapLengthHeight();
        weight = inWeight;
        girth = 0.0;
        trackingNumber = trackingNoGenerator++;
    }
    
    /**
     * Mutator: swapLengthWidth()
     * Pre-condition: the length and width variables must
     * be declare and initialized.
     * Post-condition: the swapLengthWidth() method will be executed 
     * if the length of a parcel is less than the width of the parcel. 
     */
    private void swapLengthWidth(){
        if(length < width){
            length = length + width;
            width = length - width;
            length = length - width;
        }
    }
    
    /**
     * Mutator: swapLengthHeight()
     * Pre-condition: the length and height variables must
     * be declare and initialized.
     * Post-condition: the swapLengthHeight() method will be executed 
     * if the length of a parcel is less than the height of the parcel. 
     */
    private void swapLengthHeight(){
        if(length < height){
            length = length + height;
            height = length - height;
            length = length - height;
        }
    }
    
    /**
     * Mutator: setWeight(double inWeight)
     * the setWeight(double inWeight) method will allow the programmers
     * change the weight's value of the parcel class.
     * @param inWeight 
     * Pre-conditions: inWeight has to be > 0
     * Post-condition: the value of weight variable have been changed 
     * depend on the inWeight's value if inWeight's value > 0
     */
    public void setWeight(double inWeight) {
        if(0 < inWeight){
            weight = inWeight;
        }
    }
    
    /**
     * Accessor: getWeight()
     * @return weight
     * the getWeight() method will return the value of weight property
     * of parcel class
     */
    public double getWeight() {
        return weight;
    }
    
    /**
     * Accessor: getHeight()
     * @return height
     * the getHeight() method will return the value of height property
     * of parcel class
     */
    public double getHeight() {
        return height;
    }

    /**
     * Mutator: setHeight(double inHeight)
     * the setHeight(double inHeight) method will allow the programmers
     * change the height's value of the parcel class.
     * @param inHeight 
     * Pre-conditions: inHeight has to be > 0
     * Post-condition: the value of height variable have been changed 
     * depend on the inHeight's value if inHeight's value > 0
     */
    public void setHeight(double inHeight) {
        if(0 < inHeight){
            height = inHeight;
        }
    }
    
    /**
     * Accessor: getLength()
     * @return length
     * the getLength() method will return the value of length property 
     * of parcel class
     */
    public double getLength() {
        return length;
    }

    /**
     * Mutator: setLength(double inLength)
     * @param inLength
     * the setLength(double inLength) method will allow the programmers
     * change the length's value of the parcel class.
     * Pre-conditions: inLength has to be > 0
     * Post-condition: the value of length variable have been changed 
     * depend on the inLength's value if inLength's value > 0
     */
    public void setLength(double inLength) {
        if(0 < inLength){
            length = inLength;
        }
    }

    /**
     * Accessor: getWidth()
     * @return width
     * the getWidth() method will return the value of width property
     * of parcel class
     */
    public double getWidth() {
        return width;
    }

    /**
     * Mutator: setWidth(double inWidth)
     * @param inWidth 
     * the setWidth(double inWidth) method will allow the programmers
     * change the width's value of the parcel class.
     * Pre-conditions: inWidth has to be > 0
     * Post-condition: the value of width variable have been changed 
     * depend on the inWidth's value if inWidth's value > 0
     */
    public void setWidth(double inWidth) {
        if(0 < inWidth){
            width = inWidth;
        }
    }
    
    /**
     * Accessor: calculateGirth()
     * Pre-condition: the height and width weight variables must
     * be declare and initialized.
     * Post-condition: the calculateGirth() method will be calculated
     * the girth = (2 * width + 2 * height) 
     */
    public double calculateGirth(){
        girth = 2 * width + 2 * height;
        return girth;
    }
    
    /**
     * Accessor: getGirth()
     * @return girth
     * the getGirth() method will return the value of girth property
     * of parcel class. The value of girth property will be calculated
     * by the calculateGirth() method
     */
    public double getGirth() {
        return this.calculateGirth();
    }

    /**
     * Mutator: setGirth(double girthCalculated)
     * @param girthCalculated
     * the setGirth(double girthCalculated) method will allow the 
     * programmers change the girth's value of the parcel class.
     * Pre-conditions: the calculateGirth() method is defined
     * Programmers should use this method when they apply the 
     * calculateGirth() method's result as a parameter.
     * I mean girthCalculated = result of calculateGirth() method
     * Post-condition: the value of width variable have been changed 
     * depend on the girthCalculated's value if girthCalculated > 0
     */
    public void setGirth(double girthCalculated) {
        if(0 < girthCalculated){
            girth = girthCalculated;
        }
    }

    /**
     * Accessor: getTrackingNumber()
     * @return trackingNumber
     * the getTrackingNumber() method will return the value 
     * of trackingNumber property of parcel class
     */
    public long getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Mutator: setTrackingNumber()
     * the setTrackingNumber() method will allow the programmers
     * assigned the trackingNumber's value of the parcel class
     * (trackingNumber's value is assigned = trackingNoGenerator + 1)
     * Pre-conditions: none
     * Post-condition: the value of trackingNumber variable have 
     * been changed depend on the trackingNoGenerator's value is
     * incremented to 1;
     */
    public void setTrackingNumber() {
        trackingNumber = trackingNoGenerator++;
    }
    
    /**
     * Mutator: setDimensions()
     * Pre-condition: the length, width, height, weight variables must
     * be declare and do not initialize. The Scanner class must be
     * imported with syntax import java.util.Scanner;
     * Post-condition: the setDimensions() method will use the Scanner class
     * to input the value for length, width, height, and weight variables.
     * If length < width, the swapLengthWidth() will be executed,
     * otherwisr, the swapLengthWidth() will be ignore.
     * If length < height, the swapLengthHeight() will be executed,
     * otherwisr, the swapLengthHeight() will be ignore.
     * I would like to make sure the length's value must the 
     * largest value in 3 value of length, width, and height.
     */
    public void setDimensions(){
        Scanner cin = new Scanner(System.in);
        
        do{
            System.out.print("Enter length of parcel:  ");
            length = Double.parseDouble(cin.nextLine());
            
            if(length <= 0){
                System.err.println("The length of parcel must be "
                        + "greater than 0.");
            }
        }while(length <= 0);
        
        do{
            System.out.print("Enter width of parcel:   ");
            width = Double.parseDouble(cin.nextLine());
            
            if(width <= 0){
                System.err.println("The width of parcel must be "
                        + "greater than 0.");
            }
        }while(width <= 0);
        
        this.swapLengthWidth();
        
        do{
            System.out.print("Enter height of parcel:  ");
            height = Double.parseDouble(cin.nextLine());
            
            if(height <= 0){
                System.err.println("The height of parcel must be "
                        + "greater than 0.");
            }
        }while(height <= 0);
        
        this.swapLengthHeight();
        
        do{
            System.out.print("Enter weight of parcel:  ");
            this.weight = Double.parseDouble(cin.nextLine());
            
            if(weight <= 0){
                System.err.println("The weight of parcel must be "
                        + "greater than 0.");
            }
        }while(weight <= 0);
    }
    
    /**
     * Accessor: showParcelSize()
     * @return sizeInformation
     * Pre-condition: The length, width, and height variables must be 
     * declared and initialized. The DecimalFormat class must be
     * imported by the systax import java.text.DecimalFormat;
     * Post-condition: the showParcelSize() method will print the
     * information of the length, width, and height of a parcel.
     */
    private String showParcelSize(){
        DecimalFormat fmt = new DecimalFormat("0.0###");
        String sizeInformation = "";
        sizeInformation += "Length \t Width \t Height\n";
        sizeInformation += fmt.format(length) + "\t " 
                + fmt.format(width) + "\t " 
                + fmt.format(height) + "\n";
        return sizeInformation;
    }
    
    /**
     * Accessor: toString()
     * @return result
     * Pre-condition: The showParcelSize()
     * and calculateGirth() method must be defined,
     * these variables: length, width, height, weight, girth, and
     * trackingNumber and be declared and initialized and 
     * calculated. The DecimalFormat class must be
     * imported with syntax import java.text.DecimalFormat;
     * Post-condition: the toString() method will output the information
     * of showParcelSize() and calculateGirth() method and output 
     * the value of length, width, height, and weight
     */
    @Override
    public String toString(){
        String result = "";
        DecimalFormat fmt = new DecimalFormat("0.0###");
        
        result += this.showParcelSize() + "\n";
        result += "The girth is " + fmt.format(this.calculateGirth())
                + " cm.\n\n";
        result += " Please put your Parcel on the scale\n" +
                    " Weight: " + this.weight + " kg\n\n";
        return result;
    }
    
    /**
     * Accessor: showTrackingNumber()
     * @return result
     * Pre-condition: The trackingNumber is declared and initialized.
     * The getTrackingNumber() method must be defined.
     * Post-condition: the showTrackingNumber() method will output the 
     * information of trackingNumber variable depend on the 
     * getTrackingNumber() method
     */
    public String showTrackingNumber(){
        String result = "";
        result += " Here is your tracking number: # ";
        result += this.getTrackingNumber();
        result += "\nThank you.  We will "
                        + "bill your account\n\n";
        return result;
    }
}