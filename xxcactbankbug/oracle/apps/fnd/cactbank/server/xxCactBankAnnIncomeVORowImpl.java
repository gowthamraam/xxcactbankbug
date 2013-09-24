package xxcactbankbug.oracle.apps.fnd.cactbank.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class xxCactBankAnnIncomeVORowImpl extends OAViewRowImpl {
    public static final int ANNUALINCOME = 0;
    public static final int LNAME = 1;

    /**This is the default constructor (do not remove)
     */
    public xxCactBankAnnIncomeVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute AnnualIncome
     */
    public String getAnnualIncome() {
        return (String) getAttributeInternal(ANNUALINCOME);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute AnnualIncome
     */
    public void setAnnualIncome(String value) {
        setAttributeInternal(ANNUALINCOME, value);
    }

    /**Gets the attribute value for the calculated attribute Lname
     */
    public String getLname() {
        return (String) getAttributeInternal(LNAME);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Lname
     */
    public void setLname(String value) {
        setAttributeInternal(LNAME, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ANNUALINCOME:
            return getAnnualIncome();
        case LNAME:
            return getLname();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ANNUALINCOME:
            setAnnualIncome((String)value);
            return;
        case LNAME:
            setLname((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
