package co.poynt.api.model;

public enum InventoryAdjustmentStatus {
	OPEN, // won't have any effect on inventory count
	COMPLETED, // will cause the inventory count to be updated
	CANCELLED
}
