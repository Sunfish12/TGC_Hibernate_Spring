package model;

// Generated 2015/1/6 �W�� 11:59:56 by Hibernate Tools 3.4.0.CR1

/**
 * BoardGamesImage generated by hbm2java
 */
public class BoardGames_Image implements java.io.Serializable {

	private int storeImageId;
	private BoardGames boardGames;
	private String imgFileName;
	private byte[] boardGameImages;

	public BoardGames_Image() {
	}

	public BoardGames_Image(int storeImageId) {
		this.storeImageId = storeImageId;
	}

	public BoardGames_Image(int storeImageId, BoardGames boardGames,
			String imgFileName, byte[] boardGameImages) {
		this.storeImageId = storeImageId;
		this.boardGames = boardGames;
		this.imgFileName = imgFileName;
		this.boardGameImages = boardGameImages;
	}

	public int getStoreImageId() {
		return this.storeImageId;
	}

	public void setStoreImageId(int storeImageId) {
		this.storeImageId = storeImageId;
	}

	public BoardGames getBoardGames() {
		return this.boardGames;
	}

	public void setBoardGames(BoardGames boardGames) {
		this.boardGames = boardGames;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getBoardGameImages() {
		return this.boardGameImages;
	}

	public void setBoardGameImages(byte[] boardGameImages) {
		this.boardGameImages = boardGameImages;
	}

}
