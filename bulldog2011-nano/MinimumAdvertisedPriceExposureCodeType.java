// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * Defines how the buyer is to view the discounted price for MAP items. If a seller offers an item
 * for less than the item's agreed upon Minimum Advertised Price (MAP), the discounted price of the
 * item cannot be displayed on the page containing the item.
 * 
 */
public enum MinimumAdvertisedPriceExposureCodeType {

    /**
     * 
   * PreCheckout specifies that the buyer must click a link (or a button) to navigate to a separate
   * page (or window) that displays the discount price.
   * 
     */
    PRE_CHECKOUT("PreCheckout"),
  

    /**
     * 
   * DuringCheckout specifies that the discounted price must be shown on the eBay checkout
   * flow page.
   * 
     */
    DURING_CHECKOUT("DuringCheckout"),
  

    /**
     * 
   * None means the discount price is not shown via either PreCheckout nor DuringCheckout.
   * 
     */
    NONE("None"),
  

    /**
     * 
   * Reserved for future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    MinimumAdvertisedPriceExposureCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static MinimumAdvertisedPriceExposureCodeType fromValue(String v) {
        if (v != null) {
            for (MinimumAdvertisedPriceExposureCodeType c: MinimumAdvertisedPriceExposureCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}