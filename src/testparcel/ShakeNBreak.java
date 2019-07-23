/*
 * CSC-122 SP 2018 PROJECT:
 * Programmer: Quang Bui
 * Due Date: Tuesday, March 6th, 2018
 * Description: Class ShakeNBreak will decide the parcel is ship or 
 * not ship depend on the values of the girth and weight is calculated.
 */

package testparcel;

/**
 * Programmed by: Quang Bui
 * Due Date: Tuesday, March 6th, 2018
 * Description: Class ShakeNBreak will decide the parcel is ship or 
 * not ship depend on the values of the girth and weight is calculated.
 */
public class ShakeNBreak {
    private Parcel postalParcel;
    private CheckShipping shipment;
    
    /**
     * DEFAULT CONSTRUCTOR
     * no parameters
     * Pre-condition: Programmers use the parcel class. The Parcel must
     * be defined. The shipment variable must be declared with
     * enumerated type CheckShipping.
     * the introduction() method must be defined.
     * Post-condition: Programmers use the Parcel class to create an
     * object of postalParcel, and shipment variable will be assigned
     * to CheckShipping.nonCheck; Each time programmers create an 
     * object of ShakeNBreak class, the introduction() method of 
     * Parcel class will be executed.
     */
    public ShakeNBreak(){
        postalParcel = new Parcel();
        postalParcel.introduction();
        shipment = CheckShipping.nonCheck;
    }
    
    /**
     * CONSTRUCT WITH 4 PARAMETERS
     * @param inLength
     * @param inWidth
     * @param inHeight
     * @param inWeight 
     * Pre-condition: The Parcel class is defined.
     * the introduction() method must be defined.
     * Post-condition: Construct an object of ShakeNBreak class with 4
     * parameters inLength, inWidth, inHeight, and inWeight.
     * and shipment variable will be assigned
     * to CheckShipping.nonCheck; Each time programmers create an 
     * object of ShakeNBreak class, the introduction() method of 
     * Parcel class will be executed.
     * 
     */
    public ShakeNBreak(double inLength, double inWidth, double inHeight,
                    double inWeight) {
        postalParcel = new Parcel(inLength, inWidth, inHeight, inWeight);
        postalParcel.introduction();
        shipment = CheckShipping.nonCheck;
    }
    
    /**
     * Accessor: getCheckShipping()
     * @return shipment
     * the getCheckShipping() method will return the value of shipment
     * property of ShakeNBreak class
     */
    public CheckShipping getCheckShipping(){
        return shipment;
    }
    
    /**
     * Mutator: setCheckShipping(CheckShipping inShipment)
     * @param inShipment
     * the setCheckShipping(CheckShipping inShipment) method will allow 
     * the programmers change the shipment's value of the ShakeNBreak class
     * Pre-conditions: inShipment must be declared in ShakeNBreak class
     * Post-condition: the value of shipment variable have been changed 
     * depend on the inShipment's value is assigned
     */
    public void setCheckShipping(CheckShipping inShipment){
        shipment = inShipment;
    }
    
    /**
     * Accessor: checkParcel()
     * @return shipment
     * Pre-condition: The shipment variables must be declared with
     * enumerated type CheckShipping. Programmers use the parcel class.
     * The Parcel must be defined.
     * Post-condition: the checkParcel() method will checke and 
     * decide does a parcel is shipping or not shipping.
     * If the value of girth > 105 and weight > 50, the parcel is too 
     * big and too heavy, if a parcel with girth > 105, the parcel 
     * is to big, if the parcel with weight > 50, the parcel is too
     * heavy, otherwise, they will shipping this parcel
     */
    private CheckShipping checkParcel(){
        if(postalParcel.calculateGirth()> 105 && postalParcel.getWeight() > 50){
            shipment = CheckShipping.tooBigandHeavy;
        }else if(postalParcel.getWeight() > 50){
            shipment = CheckShipping.tooHeavy;
        }else if(postalParcel.calculateGirth() > 105){
            shipment = CheckShipping.tooBig;
        }else{
            shipment = CheckShipping.shipping;
        }
        return shipment;
    }
    
    /**
     * Accessor: showParcelInformation()
     * @return parcelInformation
     * Pre-condition: The checkParcel() method must be defined.
     * The showTrackingNumber() method of Parcel class is defined.
     * Post-condition: the showParcelInformation() method will use the 
     * information is defined in checkParcel() method to show the
     * information of a parcel.
     * If the value of girth > 105 and weight > 50, the parcel is too 
     * big and too heavy, if a parcel with girth > 105, the parcel 
     * is to big, if the parcel with weight > 50, the parcel is too
     * heavy, otherwise, they will get this trackingNumber,
     * and shipping to customer.
     */
    private String showParcelInformation(){
        String parcelInformation = "";
        switch (checkParcel()) {
            case tooBigandHeavy:
                parcelInformation += "The Parcel is too big "
                        + "and too heavy.";
                break;
            case tooHeavy:
                parcelInformation += "The Parcel is too heavy.";
                break;
            case tooBig:
                parcelInformation += "The Parcel is too big.";
                break;
            case shipping:
                parcelInformation += postalParcel.showTrackingNumber();
                break;
            default:
                break;
        }
        
        parcelInformation += "\n\n";
        
        return parcelInformation;
    }
    
    /**
     * Accessor: toString()
     * @return result
     * Pre-condition: The showParcelInformation() method must be defined.
     * The toString() method of Parcel class is defined.
     * Post-condition: the toString() method will use the information
     * of toString() method of Parcel class and showParcelInformation() 
     * method to output on the screen the information of a parcel.
     */
    public String toString(){
        String result = "";
        
        result += this.postalParcel;
        result += this.showParcelInformation();
        
        return result;
    }
    
    /**
     * Mutator: setDimensions()
     * Pre-condition: The setDimensions() method of Parcel class must 
     * be defined.
     * Post-condition: The setDimensions() method of ShakeNBreak class
     * will call again the setDimensions() method of Parcel class to set
     * the size (length, weight, width, height) for a parcel.
     */
    public void setDimensions(){
        postalParcel.setDimensions();
    }
}
