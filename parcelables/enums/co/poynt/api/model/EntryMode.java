package co.poynt.api.model;

// @formatter:off
/**
 * https://feefighters.com/blog/pos-entry-mode-point-of-service-entry-mode/ & EVO mapped
 * 
 * 01 - Manually keyed (this will pertain to Visa internet transactions as well)
 * 81 - Manually keyed e-commerce (Mastercard only)
 * // &lt;enumeration value="Keyed"/>
 * // &lt;enumeration value="KeyedBadMagRead"/>
 * 
 * 02 - Magnetic stripe read (general or track 2)
 * 06 - Magnetic stripe read (Track 1)
 * 90 - Entire magnetic stripe read and transmitted
 * // &lt;enumeration value="TrackDataFromMSR"/>
 * // &lt;enumeration value="Track2DataFromMSR"/>
 * // &lt;enumeration value="MSRTrackDataFromRFID"/>
 * 
 * 05 and 95 - Contactless chip card
 * 07 - Contactless chip card using Visa Smart Debit / Credit chip data rules
 * 91 - Contactless chip transaction originated using magnetic stripe data rules (visa only)
 * // &lt;enumeration value="ChipReliable"/>
 * // &lt;enumeration value="ChipUnreliable"/>
 * // &lt;enumeration value="ChipTrackDataFromRFID"/>
 * // &lt;enumeration value="ContactlessMChipOrSmartCard"/>
 * // &lt;enumeration value="ContactlessStripe"/>
 * 
 * UNDEFINED EVO
 * // &lt;enumeration value="NFCCapable"/>
 * // &lt;enumeration value="TerminalNotUsed"/>
 * // &lt;enumeration value="BarCode"/>
 * // &lt;enumeration value="OCRReader"/>
 * // &lt;enumeration value="VSCCapable"/>
 * 
 * http://www.nationalchecknetwork.net/secure/ECHO-ISO-8583-Technical-Specification-V1.6.5.pdf - good ISO-8583 spec
 */
// @formatter:on
public enum EntryMode {

	// TODO: finalize this enum (as of 07/10/2014 its not finalized; should be
	// by end of the month)

	// @formatter:off
    KEYED("K"),
    KEYED_BAG_MAG_READ("A"),
    TRACK_DATA_FROM_MSR("M"),
    TRACK2_DATA_FROM_MSR("2"),
    CHIP_RELIABLE("B"),
    CHIP_UNRELIABLE("C"),
    CONTACTLESS_MCHIP_OR_SMARTCARD("D"),
    CONTACTLESS_STRIPE("E"),
    TERMINAL_NOT_USED("F"),
    BARCODE("G"),
    OCR_READER("H"),
    VSC_CAPABLE("I"),
    CHIP_TRACK_DATA_FROM_RFID("J"),
    MSR_TRACK_DATA_FROM_RFID("L"),
    NFC_CAPABLE("N"),
    ACCT_DATA_ON_FILE("O");
    // @formatter:on

	private String mode;

	EntryMode(String mode) {
		this.mode = mode;
	}

	public String mode() {
		return this.mode;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static EntryMode findByMode(String mode) {
		for (EntryMode v : values()) {
			if (v.mode().equals(mode)) {
				return v;
			}
		}
		return null;
	}
}
