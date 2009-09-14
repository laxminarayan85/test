package com.efi.data;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Index;

@Entity
@Table(name = "accounts")
@NamedQueries( {
		@NamedQuery(name = "accounts.findAll", query = "from Account"),
		@NamedQuery(name = "accounts.byId", query = "select a from Account a where a.id= :id")
})
		
public class Account extends BaseDataObject {

	@Basic
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accountId", nullable = false, unique = true)
	private Long accountId;

	@Basic
	@Column(name = "status", nullable = true, unique = false)
	private String status;

	@Basic
	@Column(name = "masteracct", nullable = true, unique = false)
	private Long masterAcct;

	@Basic
	@Column(name = "resalenumber", nullable = false, unique = false)
	private String resaleNumber;

	@Basic
	@Column(name = "title", nullable = false, unique = false)
	private String title;
	
	@Basic
	@Column(name = "customerpo", nullable = false, unique = false)
	private String customerPO;
	
	/* TODO Addresses */
	/* TODO Tax Table ID */
	/* TODO Tax Code Table ID */
	@Basic
	@Column(name = "salesRank", nullable = false, unique = false)
	private Long salesRank;
	
	/* TODO Custom Rank */
	@Basic
	@Column(name = "useracctid", nullable = false, unique = false)
	private String userAcctId;
	
	@Basic
	@Column(name = "externalacctid", nullable = false, unique = false)
	private String externalAcctId;

	@Basic
	@Column(name = "dollardiscount", nullable = false, unique = false)
	private Boolean dollarDiscount;
	
	@Basic
	@Column(name = "onetimediscount", nullable = false, unique = false)
	private Boolean oneTimeDiscount;
	
	/* TODO Transmitted */
	@Basic
	@Column(name = "fileoriginals", nullable = false, unique = false)
	private String fileOriginals;
	
	@Basic
	@Column(name = "webaccessenabled", nullable = false, unique = false)
	private Boolean webAccessEnabled;
	
	/* TODO NeverACustomer */
	
	@Basic
	@Column(name = "autopayenabled", nullable = false, unique = false)
	private Boolean autoPayEnabled;
	
	@Basic
	@Column(name = "marketingoptout", nullable = false, unique = false)
	private Boolean marketingOptOut;

	@Basic
	@Column(name = "dopaycommissions", nullable = false, unique = false)
	private Boolean doPayCommissions;
	
	@Basic
	@Column(name = "porequired", nullable = false, unique = false)
	private Boolean poRequired;
	@Basic
	
	@Column(name = "applyfinancecharges", nullable = false, unique = false)
	private Boolean applyFinanceCharges;
	
	@Basic
	@Column(name = "generatestatements", nullable = false, unique = false)
	private Boolean generateStatements;
	
	@Basic
	@Column(name = "businesstype", nullable = false, unique = false)
	private String businessType;

	/* TODO Sales Rep */
	/* TODO defaultINV */
	/* TODO defaultEST */
	/* TODO invoiceTemplateID */
	/* TODO estimateTemplateID */
	
	@Basic
	@Column(name = "shippingmethod", nullable = false, unique = false)
	private String shippingMethod;
	
	/* TODO Aging */
	/* TODO Notes */
	/* TODO Totals section (20 or so values from onAccount to discountDollarAmt */
	@Basic
	@Column(name = "lastinvoiced", nullable = false, unique = false)
	private Date lastInvoiced;
	
	
	@Basic
	@Column(name = "lastestimate", nullable = false, unique = false)
	private Date lastEstimate;
	
	@Basic
	@Column(name = "firstinvoice", nullable = false, unique = false)
	private Date firstInvoice;
	@Basic
	@Column(name = "firstestimate", nullable = false, unique = false)
	private Date firstEstimate;
	
	@Basic
	@Column(name = "lastaged", nullable = false, unique = false)
	private Date lastAged;
	
	@Basic
	@Column(name = "lastpayment", nullable = false, unique = false)
	private Date lastPayment;

	@Basic
	@Column(name = "lastposted", nullable = false, unique = false)
	private Date lastPosted;

	@Basic
	@Column(name = "salesrankcalcdate", nullable = false, unique = false)
	private Date salesRankCalcDate;

	
	public Account() {

		super();

	}


	public Long getAccountId() {
		return accountId;
	}


	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Long getMasterAcct() {
		return masterAcct;
	}


	public void setMasterAcct(Long masterAcct) {
		this.masterAcct = masterAcct;
	}


	public String getResaleNumber() {
		return resaleNumber;
	}


	public void setResaleNumber(String resaleNumber) {
		this.resaleNumber = resaleNumber;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCustomerPO() {
		return customerPO;
	}


	public void setCustomerPO(String customerPO) {
		this.customerPO = customerPO;
	}


	public Long getSalesRank() {
		return salesRank;
	}


	public void setSalesRank(Long salesRank) {
		this.salesRank = salesRank;
	}


	public String getUserAcctId() {
		return userAcctId;
	}


	public void setUserAcctId(String userAcctId) {
		this.userAcctId = userAcctId;
	}


	public String getExternalAcctId() {
		return externalAcctId;
	}


	public void setExternalAcctId(String externalAcctId) {
		this.externalAcctId = externalAcctId;
	}


	public Boolean getDollarDiscount() {
		return dollarDiscount;
	}


	public void setDollarDiscount(Boolean dollarDiscount) {
		this.dollarDiscount = dollarDiscount;
	}


	public Boolean getOneTimeDiscount() {
		return oneTimeDiscount;
	}


	public void setOneTimeDiscount(Boolean oneTimeDiscount) {
		this.oneTimeDiscount = oneTimeDiscount;
	}


	public String getFileOriginals() {
		return fileOriginals;
	}


	public void setFileOriginals(String fileOriginals) {
		this.fileOriginals = fileOriginals;
	}


	public Boolean getWebAccessEnabled() {
		return webAccessEnabled;
	}


	public void setWebAccessEnabled(Boolean webAccessEnabled) {
		this.webAccessEnabled = webAccessEnabled;
	}


	public Boolean getAutoPayEnabled() {
		return autoPayEnabled;
	}


	public void setAutoPayEnabled(Boolean autoPayEnabled) {
		this.autoPayEnabled = autoPayEnabled;
	}


	public Boolean getMarketingOptOut() {
		return marketingOptOut;
	}


	public void setMarketingOptOut(Boolean marketingOptOut) {
		this.marketingOptOut = marketingOptOut;
	}


	public Boolean getDoPayCommissions() {
		return doPayCommissions;
	}


	public void setDoPayCommissions(Boolean doPayCommissions) {
		this.doPayCommissions = doPayCommissions;
	}


	public Boolean getPoRequired() {
		return poRequired;
	}


	public void setPoRequired(Boolean poRequired) {
		this.poRequired = poRequired;
	}


	public Boolean getApplyFinanceCharges() {
		return applyFinanceCharges;
	}


	public void setApplyFinanceCharges(Boolean applyFinanceCharges) {
		this.applyFinanceCharges = applyFinanceCharges;
	}


	public Boolean getGenerateStatements() {
		return generateStatements;
	}


	public void setGenerateStatements(Boolean generateStatements) {
		this.generateStatements = generateStatements;
	}


	public String getBusinessType() {
		return businessType;
	}


	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}


	public String getShippingMethod() {
		return shippingMethod;
	}


	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}


	public Date getLastInvoiced() {
		return lastInvoiced;
	}


	public void setLastInvoiced(Date lastInvoiced) {
		this.lastInvoiced = lastInvoiced;
	}


	public Date getLastEstimate() {
		return lastEstimate;
	}


	public void setLastEstimate(Date lastEstimate) {
		this.lastEstimate = lastEstimate;
	}


	public Date getFirstInvoice() {
		return firstInvoice;
	}


	public void setFirstInvoice(Date firstInvoice) {
		this.firstInvoice = firstInvoice;
	}


	public Date getFirstEstimate() {
		return firstEstimate;
	}


	public void setFirstEstimate(Date firstEstimate) {
		this.firstEstimate = firstEstimate;
	}


	public Date getLastAged() {
		return lastAged;
	}


	public void setLastAged(Date lastAged) {
		this.lastAged = lastAged;
	}


	public Date getLastPayment() {
		return lastPayment;
	}


	public void setLastPayment(Date lastPayment) {
		this.lastPayment = lastPayment;
	}


	public Date getLastPosted() {
		return lastPosted;
	}


	public void setLastPosted(Date lastPosted) {
		this.lastPosted = lastPosted;
	}


	public Date getSalesRankCalcDate() {
		return salesRankCalcDate;
	}


	public void setSalesRankCalcDate(Date salesRankCalcDate) {
		this.salesRankCalcDate = salesRankCalcDate;
	}
}