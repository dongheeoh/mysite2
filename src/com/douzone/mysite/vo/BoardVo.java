package com.douzone.mysite.vo;

public class BoardVo {
	private long no;
	private String title;
	private String name;
	private String text;
	private String writeDate;
	private long hit;
	private long gNo;
	private long oNo;
	private long depth;
	private long userNo;
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public long getHit() {
		return hit;
	}
	public void setHit(long hit) {
		this.hit = hit;
	}
	public long getgNo() {
		return gNo;
	}
	public void setgNo(long gNo) {
		this.gNo = gNo;
	}
	public long getoNo() {
		return oNo;
	}
	public void setoNo(long oNo) {
		this.oNo = oNo;
	}
	public long getDepth() {
		return depth;
	}
	public void setDepth(long depth) {
		this.depth = depth;
	}
	public long getUserNo() {
		return userNo;
	}
	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", name=" + name + ", text=" + text + ", writeDate="
				+ writeDate + ", hit=" + hit + ", gNo=" + gNo + ", oNo=" + oNo + ", depth=" + depth + ", userNo="
				+ userNo + "]";
	}
	

	
	
}
