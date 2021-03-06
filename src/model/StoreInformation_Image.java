package model;

// Generated 2015/1/6 �W�� 11:59:56 by Hibernate Tools 3.4.0.CR1

/**
 * StoreInformationImage generated by hbm2java
 */
public class StoreInformation_Image implements java.io.Serializable {

	private int storeImageId;
	private StoreInformation storeInformation;
	private String boardGameHelp;
	private String imgFileName;
	private byte[] areaImage;

	public StoreInformation_Image() {
	}

	public StoreInformation_Image(int storeImageId,
			StoreInformation storeInformation) {
		this.storeImageId = storeImageId;
		this.storeInformation = storeInformation;
	}

	public StoreInformation_Image(int storeImageId,
			StoreInformation storeInformation, String boardGameHelp,
			String imgFileName, byte[] areaImage) {
		this.storeImageId = storeImageId;
		this.storeInformation = storeInformation;
		this.boardGameHelp = boardGameHelp;
		this.imgFileName = imgFileName;
		this.areaImage = areaImage;
	}

	public int getStoreImageId() {
		return this.storeImageId;
	}

	public void setStoreImageId(int storeImageId) {
		this.storeImageId = storeImageId;
	}

	public StoreInformation getStoreInformation() {
		return this.storeInformation;
	}

	public void setStoreInformation(StoreInformation storeInformation) {
		this.storeInformation = storeInformation;
	}

	public String getBoardGameHelp() {
		return this.boardGameHelp;
	}

	public void setBoardGameHelp(String boardGameHelp) {
		this.boardGameHelp = boardGameHelp;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getAreaImage() {
		return this.areaImage;
	}

	public void setAreaImage(byte[] areaImage) {
		this.areaImage = areaImage;
	}

}
