package xxcactbankbug.oracle.apps.fnd.cactbank.server;


import java.sql.CallableStatement;

import java.sql.SQLException;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;

import oracle.apps.fnd.framework.server.OADBTransaction;

import oracle.jbo.Row;


import xxcactbankbug.oracle.apps.fnd.cactbank.lov.server.xxCactBankCountriesVOImpl;
import xxcactbankbug.oracle.apps.fnd.cactbank.lov.server.xxCactBankStatesVOImpl;
import xxcactbankbug.oracle.apps.fnd.cactbank.poplist.server.xxCactBankBranchVOImpl;
import xxcactbankbug.oracle.apps.fnd.cactbank.poplist.server.xxCactBankCityVOImpl;
import java.sql.CallableStatement;

import java.sql.SQLException;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;

import oracle.apps.fnd.framework.server.OADBTransaction;

import oracle.jbo.Row;

import xxcactbankbug.oracle.apps.fnd.cactbank.poplist.server.xxCactBankBranchVOImpl;
import xxcactbankbug.oracle.apps.fnd.cactbank.poplist.server.xxCactBankCityVOImpl;
import oracle.apps.fnd.framework.server.OADBTransaction; 
import oracle.apps.fnd.framework.server.OADBTransactionImpl; 
import oracle.jdbc.OracleCallableStatement; 
import java.sql.Types;

import java.util.Properties;

import oracle.apps.fnd.framework.OARow;

import oracle.jbo.Transaction;

import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;
import java.io.IOException;
import java.io.InputStream;

import java.sql.SQLException;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;

import xxcactbankbug.oracle.apps.fnd.cactbank.poplist.server.xxcactTxnTypeVOImpl;

import xxcactbankbug.oracle.apps.fnd.cactbank.server.xxCactAttachmentVOImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class xxCactBankAMImpl extends OAApplicationModuleImpl {
    /**This is the default constructor (do not remove)
     */
    public xxCactBankAMImpl() {
    }


    public void initEnameVOQuery(String City)
       {
       xxCactBankBranchVOImpl vo = (xxCactBankBranchVOImpl)getxxCactBankBranchVO();
         
        if (vo == null) 
       {
       MessageToken[] errTokens = {new MessageToken("OBJECT_NAME", "xxEmpPoplistVO")};    
       throw new OAException("AK", "FWK_TBX_OBJECT_NOT_FOUND", errTokens);
        }
       vo.setWhereClause(null);
       vo.setWhereClauseParams(null);
//            if (City.equals("$T"))
//     {
//     vo.setWhereClause("1 = 2");
//      
//       } else
//     {
      vo.setWhereClause("CITY_NAME= :1"); 
     vo.setWhereClauseParams(null); // Always reset
      vo.setWhereClauseParam(0,City);
      // }
       vo.executeQuery();
       } 
    
    /**Container's getter for xxCactBankBranchVO
     */
    public xxCactBankBranchVOImpl getxxCactBankBranchVO() {
        return (xxCactBankBranchVOImpl)findViewObject("xxCactBankBranchVO");
    }

    /**Container's getter for xxCactBankCityVO
     */
    public xxCactBankCityVOImpl getxxCactBankCityVO() {
        return (xxCactBankCityVOImpl)findViewObject("xxCactBankCityVO");
    }


    /*********Insert Record**********/
     public void createRecord()

     {

     OAViewObject vo = (OAViewObject)getxxCactBankCreateVO();

     if (!vo.isPreparedForExecution())

     {             vo.executeQuery();       }

     Row row = vo.createRow();

     vo.insertRow(row);
     row.setNewRowState(Row.STATUS_INITIALIZED);
     }
     
     
    public void insertRecord()

    {

    getDBTransaction().commit();

    throw new OAException("Data Saved sucessfully .",OAException.CONFIRMATION);

    }
    


    /**Container's getter for xxCactBankAnnIncomeVO
     */
    public xxCactBankAnnIncomeVOImpl getxxCactBankAnnIncomeVO() {
        return (xxCactBankAnnIncomeVOImpl)findViewObject("xxCactBankAnnIncomeVO");
    }
    
    
    //code fm praba
   /* public void createAcc()
    {
     OAViewObject vo1=(OAViewObject)getxxCactBankAccTypeVO();
     if(!vo1.isPreparedForExecution())
     {
      vo1.executeQuery();
     }
     Row row=vo1.createRow();
     row.setAttribute("AccountType","initial value");
    }*/
    
    //code from gowtham
     public void createANewRow(OAViewObject viewObj)
                    {
                        //xxWell11DCVO1 vo=
                        System.out.println("Creating a new row method called"+viewObj);
                      
                        
                        if(!viewObj.isPreparedForExecution())
                        {
                         viewObj.executeQuery();
                        }
                        Row row=viewObj.createRow();
                        viewObj.insertRow(row);
                        row.setNewRowState(Row.STATUS_INITIALIZED);
                    } 
            


                 public void createEntryTestDebit()
                 {             
                     xxcactTxnTestVO1Impl vo1 =getxxcactTxnTestVO1();
                     this.createANewRow(vo1);
                 } 
                 
            public void createEntryTestCredit()
            {

        xxcactTxnTestVO2Impl vo1=getxxcactTxnTestVO2();
                this.createANewRow(vo1);       
              
            }


     public void createEntryTestAdmin()
     {
         //xxWell11DCVO1 vo=
         OAViewObject vo1=(OAViewObject)getxxcactbankBankVO();
         
         if(!vo1.isPreparedForExecution())
         {
          vo1.executeQuery();
         }
         Row row=vo1.createRow();
         vo1.insertRow(row);
         row.setNewRowState(Row.STATUS_INITIALIZED);
         row.setAttribute("AccNo",getSequenceValue("xxcact_accno_s"));
     }
        
         public void createEntryTestAdmin1()
         {
         
         
         OAViewObject vo2=(OAViewObject)getxxcactBanktxnTestMyTVO();
         
         if(!vo2.isPreparedForExecution())
         {
          vo2.executeQuery();
         }
         Row rowa=vo2.createRow();
         vo2.insertRow(rowa);
         rowa.setNewRowState(Row.STATUS_INITIALIZED);
         rowa.setAttribute("Sno",getSequenceValue("xxcact_sno_s"));
         
         
     } 


         public void createEntryTest()
         {
             //xxWell11DCVO1 vo=
             OAViewObject vo1=(OAViewObject)getXxcactTransactionVO();
             
             if(!vo1.isPreparedForExecution())
             {
              vo1.executeQuery();
             }
             Row row=vo1.createRow();
             vo1.insertRow(row);
             row.setNewRowState(Row.STATUS_INITIALIZED);
         } 
                  public void tableInst(String par )
                  {
        xxcactTxnTestVOImpl vo = getxxcactTxnTestVO();
                  if (vo == null)
                  {
                  // MessageToken[] errTokens = { new MessageToken("OBJECT_NAME",     "OrderdetailsVO")};
                  //  throw new OAException("DEMXX", "ORDLINES_OBJECT_NOT_FOUND",    errTokens);
                  }vo.initQuery(par);
                  System.out.println("Order nubmer address in AM "+par);
                  }
         
    public void tableInstBal(String par )
                {
                xxcactbanktxntestBalanceVOImpl vo123= getxxcactbanktxntestBalanceVO();
                if (vo123 == null)
                {
                // MessageToken[] errTokens = { new MessageToken("OBJECT_NAME",     "OrderdetailsVO")};
                //  throw new OAException("DEMXX", "ORDLINES_OBJECT_NOT_FOUND",    errTokens);
                }
                
                
                vo123.initQueryBal(par);
                System.out.println("Order nubmer address in AM "+par);
                }
       
       
         

         public void createEntry()
         {
             //xxWell11DCVO1 vo=
             OAViewObject vo1=(OAViewObject)getXxcactTransactionVO();
             if(!vo1.isPreparedForExecution())
             {
              vo1.executeQuery();
             }
             Row row=vo1.createRow();
             vo1.insertRow(row);
             row.setNewRowState(Row.STATUS_INITIALIZED);
         }
         public void apply()
         {
                System.out.println("AM method apply called--------------------------------------------------->");
             getTransaction().commit();
             System.out.println("AM method apply called--------------------------------------------------->");
         }
         
         
//         public void initDetails(String par )
//         {
//         xxCactBankDetVOImpl vo = getxxCactBankDetVO();
//         if (vo == null)
//         {
//         // MessageToken[] errTokens = { new MessageToken("OBJECT_NAME",     "OrderdetailsVO")};
//         //  throw new OAException("DEMXX", "ORDLINES_OBJECT_NOT_FOUND",    errTokens);
//         }vo.initQuery(par);
//         System.out.println("Order nubmer address in AM "+par);
//         }


    /**Container's getter for xxCactBankLatestTxn
     */
    public xxCactBankLatestTxnImpl getxxCactBankLatestTxn() {
        return (xxCactBankLatestTxnImpl)findViewObject("xxCactBankLatestTxn");
    }

    /**Container's getter for xxCactBankDetVO
     */
    public xxCactBankDetVOImpl getxxCactBankDetVO() {
        return (xxCactBankDetVOImpl)findViewObject("xxCactBankDetVO");
    }

    /**Container's getter for xxCactBankLoginVO
     */
    public xxCactBankLoginVOImpl getxxCactBankLoginVO() {
        return (xxCactBankLoginVOImpl)findViewObject("xxCactBankLoginVO");
    }
    
    //code from faizee
    
     public void InsertProc286(String username_v,String password_v)

        {

        System.out.println("enter under apply");

        OADBTransaction tranx = (OADBTransaction)getDBTransaction();

        String sql="begin INSERTPROC286(:1, :2); end;";

        CallableStatement csmt;

        csmt=tranx.createCallableStatement(sql,1);

        try

        {

        csmt.setString(1,username_v);

        csmt.setString(2,password_v);


        csmt.execute();

        }catch(SQLException e){ throw new OAException("Invalid UserId or Password",OAException.ERROR);}

        }
        
        
        
        //code from faizee
         public void initDetails(String userid)
           {
           xxCactBankDetVOImpl vo = getxxCactBankDetVO();
           if (vo == null)
           {
           MessageToken[] errTokens = { new MessageToken("OBJECT_NAME",
           "xxCactBankDetVO")};
           throw new OAException("DEMXX", "ORDLINES_OBJECT_NOT_FOUND",
           errTokens);
           }
           vo.initQuery(userid);
           }
           
    public void rollbackOrder()
       {
       Transaction txn = getTransaction();

       if (txn.isDirty())
       {
       txn.rollback();
       }
       }

    /**Container's getter for xxCactAttachmentVO
     */
    public xxCactAttachmentVOImpl getxxCactAttachmentVO() {
        return (xxCactAttachmentVOImpl)findViewObject("xxCactAttachmentVO");
    }

    /**Container's getter for xxCactBankOccTypeVO
     */
    public xxCactBankOccTypeVOImpl getxxCactBankOccTypeVO() {
        return (xxCactBankOccTypeVOImpl)findViewObject("xxCactBankOccTypeVO");
    }

    /**Container's getter for xxCactBankAccTypeVO
     */
    public xxCactBankAccTypeVOImpl getxxCactBankAccTypeVO() {
        return (xxCactBankAccTypeVOImpl)findViewObject("xxCactBankAccTypeVO");
    }

    /**Container's getter for xxCactBankDocTypeVO
     */
    public xxCactBankDocTypeVOImpl getxxCactBankDocTypeVO() {
        return (xxCactBankDocTypeVOImpl)findViewObject("xxCactBankDocTypeVO");
    }
    
    /*****************Code for Email*********************/
     private String from;
     private String to;
     private String subject;
     private String text;

     public void sendMail(String from, String to, String subject, String text){
     this.from = from;
     this.to = to;
     this.subject = subject;
     this.text = text; 
     }
     
    public void send(){
    System.out.print("Test MAil sent23232323");

    boolean debug = true;
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "465");
    props.put("mail.smtp.auth", "true");
    props.put("mail.debug", "true");
    props.put("mail.smtp.socketFactory.fallback", "false");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.starttls.enable", "true");

    //Session mailSession = Session.getDefaultInstance(props);
     Session mailSession =Session.getInstance(props, new javax.mail.Authenticator() {

    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication("cactesbank@gmail.com", "welcome@4i");
    }
    }); 
    //    Session mailSession = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
    //
    //    protected PasswordAuthentication getPasswordAuthentication() {
    //    return new PasswordAuthentication("p.davidrichards@gmail.com", "pathinathan");
    //    }
    //    });

    mailSession.setDebug(debug);



    Message simpleMessage = new MimeMessage(mailSession);

    InternetAddress fromAddress = null;
    InternetAddress toAddress = null;
    try {
    fromAddress = new InternetAddress(from);
    toAddress = new InternetAddress(to);
    } catch (AddressException e) {
    
    e.printStackTrace();
    }

    try {
    simpleMessage.setFrom(fromAddress);
    simpleMessage.setRecipient(RecipientType.TO, toAddress);
    simpleMessage.setSubject(subject);
    simpleMessage.setText(text);

    Transport.send(simpleMessage, simpleMessage.getAllRecipients());
    //Transport.send(simpleMessage);
    } catch (Exception e) {
    
    e.printStackTrace();
    System.out.println(e.getLocalizedMessage());
    }
    }
    
    /********E-mail notification*********/
     public void EmailProc(String recipient_v,String userid_v,String password_v,
        String name_v)

            {

            System.out.println("enter under apply");

            OADBTransaction tranx = (OADBTransaction)getDBTransaction();
     System.out.println("-------->tes1");
            String sql="begin SENDMAIL.SEND(:1, :2, :3, :4); end;";
                System.out.println("-------->tes2");
            CallableStatement csmt;
                System.out.println("-------->tes3");
            csmt=tranx.createCallableStatement(sql,1);
                System.out.println("-------->tes4");
            try

            {

            csmt.setString(1,recipient_v);
                System.out.println("-------->tes5");
            csmt.setString(2,userid_v);
                System.out.println("-------->tes6");
            csmt.setString(3,password_v);
                System.out.println("-------->tes7");
            csmt.setString(4,name_v);
                System.out.println("-------->tes8");
            csmt.execute();
             System.out.println("After csmt.execute()");
            }
            catch(SQLException e){ throw new OAException("Please Enter Email id..",OAException.ERROR);}


            }

    /**Container's getter for xxCactBankCountriesVO
     */
    public xxCactBankCountriesVOImpl getxxCactBankCountriesVO() {
        return (xxCactBankCountriesVOImpl)findViewObject("xxCactBankCountriesVO");
    }

    /**Container's getter for xxCactBankStatesVO
     */
    public xxCactBankStatesVOImpl getxxCactBankStatesVO() {
        return (xxCactBankStatesVOImpl)findViewObject("xxCactBankStatesVO");
    }
    
    /***********Date validation--> daysBetween*************/
//     public String daysBetween(java.sql.Date d1, java.sql.Date d2)
//              {
//                 //return (String)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
//                   return String.valueOf((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
//                } 


 public String dataSumAction(String s) 
//  public String dataSumAction() 
    { OADBTransaction oadbtransaction = (OADBTransaction)getTransaction(); 
      OADBTransactionImpl oadbtransactionimpl = (OADBTransactionImpl)getTransaction();

     String retValues;

     StringBuffer str = new StringBuffer(); 
     System.out.println("-------> test 20");
     str.append( " BEGIN "); 
     System.out.println("test 21");
     str.append( " xxrandom( "); 
        str.append( "       s => :1  ");
        str.append( "    ); "); 
     System.out.println("test 22");
     //str.append( "       item1           => :1, "); 
    // str.append( "       item2           => :2, "); 
    
        System.out.println("test 23");
    
        System.out.println("test 24");
     str.append( " END; ");

     OracleCallableStatement oraclecallablestatement = 
      (OracleCallableStatement)oadbtransaction.createCallableStatement(str.toString(), 1);
        System.out.println("test 25");
     try{ 
      //oraclecallablestatement.setInt(1,  Integer.parseInt(item1) ); 
      //oraclecallablestatement.setInt(2,  Integer.parseInt(item2) );

      oraclecallablestatement.registerOutParameter(1, Types.VARCHAR);
         System.out.println("test 26");
      oraclecallablestatement.execute(); 
         System.out.println("test 27");
      retValues = oraclecallablestatement.getString(1); 
     } 
     catch(Exception e) 
     { 
      throw OAException.wrapperException(e); 
     } 
     return retValues; 
    }


    /**Container's getter for xxcactTxnTestVO
     */
    public xxcactTxnTestVOImpl getxxcactTxnTestVO() {
        return (xxcactTxnTestVOImpl)findViewObject("xxcactTxnTestVO");
    }

    /**Container's getter for XxcactTransactionVO
     */
    public XxcactTransactionVOImpl getXxcactTransactionVO() {
        return (XxcactTransactionVOImpl)findViewObject("XxcactTransactionVO");
    }

    /**Container's getter for xxcactTxnTypeVO
     */
    public xxcactTxnTypeVOImpl getxxcactTxnTypeVO() {
        return (xxcactTxnTypeVOImpl)findViewObject("xxcactTxnTypeVO");
    }

    /**Container's getter for xxcactbanktxntestBalanceVO
     */
    public xxcactbanktxntestBalanceVOImpl getxxcactbanktxntestBalanceVO() {
        return (xxcactbanktxntestBalanceVOImpl)findViewObject("xxcactbanktxntestBalanceVO");
    }

    /**Container's getter for xxcactBankValiVO
     */
    public xxcactBankValiVOImpl getxxcactBankValiVO() {
        return (xxcactBankValiVOImpl)findViewObject("xxcactBankValiVO");
    }

    /**Container's getter for xxcactbankBankVO
     */
    public xxcactbankBankVOImpl getxxcactbankBankVO() {
        return (xxcactbankBankVOImpl)findViewObject("xxcactbankBankVO");
    }

    /**Container's getter for xxcactBanktxnTestMyTVO
     */
    public xxcactBanktxnTestMyTVOImpl getxxcactBanktxnTestMyTVO() {
        return (xxcactBanktxnTestMyTVOImpl)findViewObject("xxcactBanktxnTestMyTVO");
    }


    /**Container's getter for xxcactTxnTestVO1
     */
    public xxcactTxnTestVO1Impl getxxcactTxnTestVO1() {
        return (xxcactTxnTestVO1Impl)findViewObject("xxcactTxnTestVO1");
    }

    /**Container's getter for xxcactTxnTestVO2
     */
    public xxcactTxnTestVO2Impl getxxcactTxnTestVO2() {
        return (xxcactTxnTestVO2Impl)findViewObject("xxcactTxnTestVO2");
    }

    /**Container's getter for xxCactBankCreateVO
     */
    public xxCactBankCreateVOImpl getxxCactBankCreateVO() {
        return (xxCactBankCreateVOImpl)findViewObject("xxCactBankCreateVO");
    }

    /**Sample main for debugging Business Components code using the tester.
     */
    public static void main(String[] args) {
        launchTester("xxcactbankbug.oracle.apps.fnd.cactbank.server", /* package name */
      "xxCactBankAMLocal" /* Configuration Name */);
    }
}
