/**
 *@Generated by sagacity-quickvo 4.6
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.time.LocalDate;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: TRADE_ORDER_INFO_2   
 */
@Entity(tableName="TRADE_ORDER_INFO_2")
public abstract class AbstractOrderInfo2VO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //orderId,orderType,buyer,saler,orderDate,totalAmt,quantity,price,status
	 
	 //not null properties
	 //orderId,orderType,buyer,saler,orderDate,totalAmt,quantity,price,status

	/**
	 * 
	 */
	private static final long serialVersionUID = 3630097654028997068L;
	
	/**
	 * 订单号
	 */
	@Id(strategy="assign")
	@Column(name="ORDER_ID",length=0L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String orderId;
	
	/**
	 * 订单类型
	 */
	@Column(name="ORDER_TYPE",length=0L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String orderType;
	
	/**
	 * 购买方
	 */
	@Column(name="BUYER",length=0L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String buyer;
	
	/**
	 * 销售方
	 */
	@Column(name="SALER",length=0L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String saler;
	
	/**
	 * 订单日期
	 */
	@Column(name="ORDER_DATE",length=10L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDate orderDate;
	
	/**
	 * 订单金额
	 */
	@Column(name="TOTAL_AMT",length=8L,type=java.sql.Types.FLOAT,nullable=false)
	protected Float totalAmt;
	
	/**
	 * 订单数量
	 */
	@Column(name="QUANTITY",length=8L,type=java.sql.Types.FLOAT,nullable=false)
	protected Float quantity;
	
	/**
	 * 单价
	 */
	@Column(name="PRICE",length=8L,type=java.sql.Types.FLOAT,nullable=false)
	protected Float price;
	
	/**
	 * 状态
	 */
	@Column(name="STATUS",length=0L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String status;
	


	/** default constructor */
	public AbstractOrderInfo2VO() {
	}
	
	/** pk constructor */
	public AbstractOrderInfo2VO(String orderId)
	{
		this.orderId=orderId;
	}


	/** full constructor */
	public AbstractOrderInfo2VO(String orderId,String orderType,String buyer,String saler,LocalDate orderDate,Float totalAmt,Float quantity,Float price,String status)
	{
		this.orderId=orderId;
		this.orderType=orderType;
		this.buyer=buyer;
		this.saler=saler;
		this.orderDate=orderDate;
		this.totalAmt=totalAmt;
		this.quantity=quantity;
		this.price=price;
		this.status=status;
	}
	
	/**
	 *@param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId=orderId;
	}
		
	/**
	 *@return the OrderId
	 */
	public String getOrderId() {
	    return this.orderId;
	}
	
	/**
	 *@param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType=orderType;
	}
		
	/**
	 *@return the OrderType
	 */
	public String getOrderType() {
	    return this.orderType;
	}
	
	/**
	 *@param buyer the buyer to set
	 */
	public void setBuyer(String buyer) {
		this.buyer=buyer;
	}
		
	/**
	 *@return the Buyer
	 */
	public String getBuyer() {
	    return this.buyer;
	}
	
	/**
	 *@param saler the saler to set
	 */
	public void setSaler(String saler) {
		this.saler=saler;
	}
		
	/**
	 *@return the Saler
	 */
	public String getSaler() {
	    return this.saler;
	}
	
	/**
	 *@param orderDate the orderDate to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate=orderDate;
	}
		
	/**
	 *@return the OrderDate
	 */
	public LocalDate getOrderDate() {
	    return this.orderDate;
	}
	
	/**
	 *@param totalAmt the totalAmt to set
	 */
	public void setTotalAmt(Float totalAmt) {
		this.totalAmt=totalAmt;
	}
		
	/**
	 *@return the TotalAmt
	 */
	public Float getTotalAmt() {
	    return this.totalAmt;
	}
	
	/**
	 *@param quantity the quantity to set
	 */
	public void setQuantity(Float quantity) {
		this.quantity=quantity;
	}
		
	/**
	 *@return the Quantity
	 */
	public Float getQuantity() {
	    return this.quantity;
	}
	
	/**
	 *@param price the price to set
	 */
	public void setPrice(Float price) {
		this.price=price;
	}
		
	/**
	 *@return the Price
	 */
	public Float getPrice() {
	    return this.price;
	}
	
	/**
	 *@param status the status to set
	 */
	public void setStatus(String status) {
		this.status=status;
	}
		
	/**
	 *@return the Status
	 */
	public String getStatus() {
	    return this.status;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("orderId=").append(getOrderId()).append("\n");
		columnsBuffer.append("orderType=").append(getOrderType()).append("\n");
		columnsBuffer.append("buyer=").append(getBuyer()).append("\n");
		columnsBuffer.append("saler=").append(getSaler()).append("\n");
		columnsBuffer.append("orderDate=").append(getOrderDate()).append("\n");
		columnsBuffer.append("totalAmt=").append(getTotalAmt()).append("\n");
		columnsBuffer.append("quantity=").append(getQuantity()).append("\n");
		columnsBuffer.append("price=").append(getPrice()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		return columnsBuffer.toString();
	}
}
