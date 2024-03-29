package xxcactbankbug.oracle.apps.fnd.cactbank.lov.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class xxCactBankCountriesVORowImpl extends OAViewRowImpl {
    public static final int COUNTRYID = 0;
    public static final int COUNTRYNAMES = 1;

    /**This is the default constructor (do not remove)
     */
    public xxCactBankCountriesVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute CountryId
     */
    public Number getCountryId() {
        return (Number) getAttributeInternal(COUNTRYID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CountryId
     */
    public void setCountryId(Number value) {
        setAttributeInternal(COUNTRYID, value);
    }

    /**Gets the attribute value for the calculated attribute CountryNames
     */
    public String getCountryNames() {
        return (String) getAttributeInternal(COUNTRYNAMES);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CountryNames
     */
    public void setCountryNames(String value) {
        setAttributeInternal(COUNTRYNAMES, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case COUNTRYID:
            return getCountryId();
        case COUNTRYNAMES:
            return getCountryNames();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case COUNTRYID:
            setCountryId((Number)value);
            return;
        case COUNTRYNAMES:
            setCountryNames((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
