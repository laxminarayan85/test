package com.efi.vo
{
                             
[Bindable]
                             
[RemoteClass(alias="com.efi.data.Account")]
                             
public class Account
                             
{
                                   
public function Account()
                                   
{
                                   
}
                                   

                                   
public var id:Number;
                                   
public var created:Date;
                                   
public var modified:Date;
                                                                      
public var created:Date;

public var accountId:Number;

public var status:String;

public var masterAcct:Number;

public var resaleNumber:Number;

public var title:String;

public var customerPO:String;

public var salesRank:Number;

public var userAcctId:String;

public var externalAcctId:String;

public var dollarDiscount:Boolean;

public var oneTimeDiscount:Boolean;

public var fileOriginals:Boolean;

public var webAccessEnabled:Boolean;

public var autoPayEnabled:Boolean;

public var marketingOptOut:Boolean;

public var doPayCommissions:Boolean;

public var poRequired:Boolean;

public var applyFinanceCharges:Boolean;

public var generateStatements:Boolean;

public var businessType:String;

public var shippingMethod:String;

public var lastInvoiced:Date;

public var lastEstimate:Date;

public var firstInvoice:Date;

public var firstEstimate:Date;

public var lastAged:Date;

public var lastPayment:Date;

public var lastPosted:Date;

public var salesRankCalcDate:Date;
}
}
    