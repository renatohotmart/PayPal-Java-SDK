package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Currency extends PayPalModel {

	/**
	 * 3 letter currency code
	 */
	private String currency;

	/**
	 * amount upto 2 decimals represented as string
	 */
	private String value;

	/**
	 * Default Constructor
	 */
	public Currency() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Currency(String currency, String value) {
		this.currency = currency;
		this.value = value;
	}
}
