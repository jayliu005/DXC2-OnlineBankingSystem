package com.dxc.dxc2.transaction;

public class TransactionRejectedException extends RuntimeException {

	public TransactionRejectedException(String message) {
		super(message);
	}
}
