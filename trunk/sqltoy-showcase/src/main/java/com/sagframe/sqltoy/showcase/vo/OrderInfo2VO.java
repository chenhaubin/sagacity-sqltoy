/**
 *@Generated by sagacity-quickvo 4.6
 */
package com.sagframe.sqltoy.showcase.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import java.time.LocalDate;
import com.sagframe.sqltoy.showcase.vo.base.AbstractOrderInfo2VO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: TRADE_ORDER_INFO_2 	
 */
@SqlToyEntity
public class OrderInfo2VO extends AbstractOrderInfo2VO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3602020861562092432L;
	
	/** default constructor */
	public OrderInfo2VO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public OrderInfo2VO(String orderId)
	{
		this.orderId=orderId;
	}


	/** full constructor */
	public OrderInfo2VO(String orderId,String orderType,String buyer,String saler,LocalDate orderDate,Float totalAmt,Float quantity,Float price,String status)
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

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
    @Override
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public OrderInfo2VO clone() {
		try {
			return (OrderInfo2VO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
