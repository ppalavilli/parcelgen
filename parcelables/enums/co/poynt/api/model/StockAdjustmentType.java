package co.poynt.api.model;

public enum StockAdjustmentType {
	STOCK_ORDER, // when an order to resupply is received
	STOCK_TAKE, // When the merchant manually count and update
	STOCK_TRANSFER, // when transfering between stores
	STOCK_RETURN // when an item was returned
}
